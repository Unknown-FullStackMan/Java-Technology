package practice.practicedemo.springboot.InterceptorFilterListenerTest.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Author Simple
 * @Create 2021/6/25 10:40
 */
@SuppressWarnings("serial")
public class MyEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MyEvent(Object source) {
        super(source);
    }
}
