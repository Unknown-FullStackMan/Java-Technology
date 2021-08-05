package practice.practicedemo.springboot.AsyncAndSync.Async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @Author Simple
 * @Create 2021/6/25 17:29
 */
@Component
public class AsyncCallBackTask extends AsyncTask{

    @Async
    public Future<String> doTaskOneCallback() throws Exception{
        super.doTaskOne();
        return new AsyncResult<>("任务一完成");
    }

    @Async
    public Future<String> doTaskTwoCallback() throws Exception {
        super.doTaskTwo();
        return new AsyncResult<>("任务二完成");
    }

    @Async
    public Future<String> doTaskThreeCallback() throws Exception {
        super.doTaskThree();
        return new AsyncResult<>("任务三完成");
    }

}
