package practice.practicedemo.ThreadTest;

import org.junit.jupiter.api.Test;

/**
 * @Author Simple
 * @Create 2021/7/1 9:21
 */
public class ConcurrentTest {
    private static final long count = 100000000l;



    @Test
    public  void concurrentTest() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        int b= 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long end = System.currentTimeMillis();
        t.join();
        System.out.println("concurrent time = "+(end-start));
    }
    @Test
    public void serial(){
        long start =System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long end = System.currentTimeMillis();
        System.out.println("serial time = "+(end-start));
    }

}
