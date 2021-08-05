package practice.practicedemo.AsyncSyncTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import practice.practicedemo.springboot.AsyncAndSync.Async.AsyncCallBackTask;
import practice.practicedemo.springboot.AsyncAndSync.Async.AsyncExecutorTask;
import practice.practicedemo.springboot.AsyncAndSync.Async.AsyncTask;
import practice.practicedemo.springboot.AsyncAndSync.Sync.SyncTask;

import java.util.concurrent.Future;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;

/**
 * @Author Simple
 * @Create 2021/6/25 17:11
 */

@SpringBootTest
@EnableAsync
public class TaskTest {

    @Autowired
    SyncTask syncTask;

    @Test
    public void testSync() throws InterruptedException {
        syncTask.doTaskOne();
        syncTask.doTaskTwo();
        syncTask.doTaskThree();
    }

    @Autowired
    private AsyncTask asyncTask;


    @Test
    public void testAsyncTasks() throws Exception {
        asyncTask.doTaskOne();
        asyncTask.doTaskTwo();
        asyncTask.doTaskThree();
    }

    @Autowired
    private AsyncCallBackTask asyncCallBackTask;

    @Test
    public void testAsyncCallbackTask() throws Exception {
        long start = currentTimeMillis();
        Future<String> task1 = asyncCallBackTask.doTaskOneCallback();
        Future<String> task2 = asyncCallBackTask.doTaskTwoCallback();
        Future<String> task3 = asyncCallBackTask.doTaskThreeCallback();

        // 三个任务都调用完成，退出循环等待
        while (!task1.isDone() || !task2.isDone() || !task3.isDone()) {
            sleep(1000);
        }

        long end = currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }

    @Autowired
    AsyncExecutorTask task;

    @Test
    public void testAsyncExecutorTask() throws Exception {
        task.doTaskOneCallback();
        task.doTaskTwoCallback();
        task.doTaskThreeCallback();
        sleep(20*1000L);

    }

}
