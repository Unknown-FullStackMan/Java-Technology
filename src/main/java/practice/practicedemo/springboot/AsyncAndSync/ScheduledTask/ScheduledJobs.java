package practice.practicedemo.springboot.AsyncAndSync.ScheduledTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author Simple
 * @Create 2021/6/28 9:23
 */
@Component
public class ScheduledJobs {
    @Scheduled(fixedDelay = 5000)
    public void fixeDelayJob() throws InterruptedException {
        System.out.println("fixeDelayJob 开始:" + new Date());
        Thread.sleep(10*1000);
        System.out.println("fixeDelayJob 结束:" + new Date());
    }

    //表示每隔3秒
    @Scheduled(fixedRate=3000)
    public void fixedRateJob()throws InterruptedException{
        System.out.println("===========fixedRate 开始:" + new Date());
        Thread.sleep(5 * 1000);
        System.out.println("===========fixedRate 结束:" + new Date());
    }

    //表示每隔10秒执行一次
    @Scheduled(cron="0/10 * * * * ? ")
    public void cronJob(){
        System.out.println("=========================== ...>>cron...." + new Date());
    }
}
