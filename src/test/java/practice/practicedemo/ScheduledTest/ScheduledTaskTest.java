package practice.practicedemo.ScheduledTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import practice.practicedemo.springboot.AsyncAndSync.ScheduledTask.ScheduledJobs;

/**
 * @Author Simple
 * @Create 2021/6/28 9:31
 */
@SpringBootTest
public class ScheduledTaskTest {
    @Autowired
    ScheduledJobs scheduledJobs;
    @Test
    public void testscheduledJobs() throws InterruptedException {
        scheduledJobs.cronJob();
        scheduledJobs.fixeDelayJob();
        scheduledJobs.fixedRateJob();


    }
}
