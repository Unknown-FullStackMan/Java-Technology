package practice.practicedemo.springboot.AsyncAndSync.Task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * @Author Simple
 * @Create 2021/6/28 9:40
 */
public class QuartzSimpleTask   extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("quartz简单的定时任务执行时间："+new Date().toLocaleString());
    }
}
