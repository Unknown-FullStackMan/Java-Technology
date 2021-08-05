package practice.practicedemo.ListenerTest;

import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import practice.practicedemo.springboot.InterceptorFilterListenerTest.event.MyEvent;

import javax.annotation.Resource;

/**
 * @Author Simple
 * @Create 2021/6/25 11:01
 */
@SpringBootTest
public class CustomListenerTest {
    @Resource
    ApplicationContext applicationContext;

    @Test
    public void testEvent(){
        applicationContext.publishEvent(new MyEvent("01号事件"));
    }
}
