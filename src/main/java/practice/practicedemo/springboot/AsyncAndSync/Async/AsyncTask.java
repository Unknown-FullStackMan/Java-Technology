package practice.practicedemo.springboot.AsyncAndSync.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import practice.practicedemo.springboot.AsyncAndSync.Task.AbstractTask;

/**
 * @Author Simple
 * @Create 2021/6/25 17:16
 */
@Component
public class AsyncTask extends AbstractTask {

    @Async
    @Override
    public void doTaskOne() throws InterruptedException {
        super.doTaskOne();
    }
    @Async
    @Override
    public void doTaskTwo() throws InterruptedException {
        super.doTaskTwo();
    }
    @Async
    @Override
    public void doTaskThree() throws InterruptedException {
        super.doTaskThree();
    }
}
