package practice.practicedemo.springboot.AsyncAndSync.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import practice.practicedemo.springboot.AsyncAndSync.Task.AbstractTask;

import java.util.concurrent.Future;

/**
 * @Author Simple
 * @Create 2021/6/28 8:50
 */
@Component
public class AsyncExecutorTask extends AbstractTask {
    @Async("taskExecutor")
    public Future<String> doTaskOneCallback() throws Exception {
        super.doTaskOne();
        System.out.println("任务一，当前线程:"+Thread.currentThread().getName());
        return new AsyncResult<>("任务一完成");
    }

    @Async("taskExecutor")
    public Future<String> doTaskTwoCallback() throws Exception {
        super.doTaskOne();
        System.out.println("任务二，当前线程:"+Thread.currentThread().getName());
        return new AsyncResult<>("任务二完成");
    }
    @Async("taskExecutor")
    public Future<String> doTaskThreeCallback() throws Exception {
        super.doTaskOne();
        System.out.println("任务三，当前线程:"+Thread.currentThread().getName());
        return new AsyncResult<>("任务三完成");
    }
}
