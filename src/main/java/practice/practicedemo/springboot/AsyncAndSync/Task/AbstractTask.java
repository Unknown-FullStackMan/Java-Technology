package practice.practicedemo.springboot.AsyncAndSync.Task;

import java.util.Random;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

/**
 * @Author Simple
 * @Create 2021/6/25 17:02
 */

public abstract class AbstractTask {
    private static Random random = new Random();
    public void doTaskOne() throws InterruptedException {
        System.out.println("任务一开始做!!!!");
        long start = currentTimeMillis();
        sleep(random.nextInt(10000));
        long end = currentTimeMillis();
        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
    }
    public void doTaskTwo() throws InterruptedException {
        System.out.println("任务二开始做!!!!");
        long start = currentTimeMillis();
        sleep(random.nextInt(10000));
        long end = currentTimeMillis();
        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
    }
    public void doTaskThree() throws InterruptedException {
        System.out.println("任务三开始做!!!!");
        long start = currentTimeMillis();
        sleep(random.nextInt(10000));
        long end = currentTimeMillis();
        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
    }


}
