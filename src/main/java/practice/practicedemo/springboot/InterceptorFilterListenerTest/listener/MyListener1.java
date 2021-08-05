package practice.practicedemo.springboot.InterceptorFilterListenerTest.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import practice.practicedemo.springboot.InterceptorFilterListenerTest.event.MyEvent;

/**
 * @Author Simple
 * @Create 2021/6/25 10:42
 */
@Slf4j
@Component
public class MyListener1 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源: %s.",MyListener1.class.getName(),event.getSource()));
    }
}
