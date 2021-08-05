package practice.practicedemo.ThreadConcurrent.CAS;




import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author Simple
 * @Create 2021/7/1 13:16
 */
public class Counter {

    private int i = 0;
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
        final Counter cas = new Counter();
        List<Thread> threadList = new ArrayList<Thread>(600);
        long start = System.currentTimeMillis();
        for (int j = 0; j < 100; j++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        cas.count();
                        cas.safeCount();
                    }
                }
            });
            threadList.add(t);
        }
        for (Thread t : threadList){
            t.start();
        }
            /**  等待所有线程执行完成 */
        for (Thread t : threadList){
            try {
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(cas.i);
        System.out.println(cas.atomicInteger.get());
        System.out.println("花费时间: "+(System.currentTimeMillis()-start));
    }

    /**  使用CAS实现线程安全计数器 */
    public void safeCount(){
        for (;;){
            int i = atomicInteger.get();
            boolean suc = atomicInteger.compareAndSet(i,++i);
            if(suc){
                break;
            }
        }
    }

    /*** 非线程安全计数器
     */
    public void count(){
        i++;
    }
}
