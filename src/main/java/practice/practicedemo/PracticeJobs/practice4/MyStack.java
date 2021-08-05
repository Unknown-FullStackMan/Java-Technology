package PracticeJobs.practice4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author Simple
 * @Create 2021/7/14 9:18
 */
public class MyStack {
    private List<String > list = new ArrayList<String>();  // 定义集合模拟栈
    private static final int Max = 100 ; // 集合最大容量
    private static int i = 0;
    private static long timeout = 10000l;
    private Random random = new Random();
    long consumeTime = (long) ((random.nextDouble()+0.5)*1000.00);
    long produceTime = 1000l;

    volatile  boolean empty = true;
    volatile  boolean full = false;
    volatile long fullStartTime = 0;
    volatile long fullTotalTime = 0;
    volatile long emptyStartTime = 0;
    volatile long emptyTotalTime = 0;

    // 定义方法模拟生产
    public synchronized void push(){
        // 当超市中数据满 就等待
        while (list.size() >= Max){
            System.out.println("生产者线程：                                "+Thread.currentThread().getName()+"  超市满，等待。。。");
            try {
                full = true;
                if(fullStartTime != 0) {
                    fullStartTime = System.currentTimeMillis();
                }
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        fullTotalTime =(System.currentTimeMillis()-fullStartTime)/1000;
        if (fullTotalTime==10 && full){
            System.out.println("没有人消费,"+Thread.currentThread().getName()+"永久停止生产");
            Thread.currentThread().stop();
        }
        if(!full){
            i++;
            String data = "product--"+i;
            System.out.println("生产者线程：                                "+Thread.currentThread().getName()+"  超市添加了数据： "+data);
            try {
                Thread.sleep(produceTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.add(data);
            empty = false ;
            this.notifyAll();
        }

    }
    // 定义方法模拟消费
    public synchronized void pop(){
        while(list.size() <= 0){
            try {
                empty =true;
                if(emptyStartTime != 0) {
                    emptyStartTime = System.currentTimeMillis();
                }
                System.out.println("消费者线程：                                "+Thread.currentThread().getName()+"  超市空，等待。。。");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        emptyTotalTime =(System.currentTimeMillis()-emptyStartTime)/1000;
        if (emptyTotalTime==10 && empty){
            System.out.println("没有人生产,"+Thread.currentThread().getName()+"永久停止消费");
            Thread.currentThread().stop();
        }
        if(!empty){
            try {
                Thread.sleep(consumeTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("消费者线程：                                "+Thread.currentThread().getName()+"  超市减少了数据:  "+list.remove(0));
            full = false;
            this.notifyAll();
        }

    }
}
