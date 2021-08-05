package practice.practicedemo.springboot.InterceptorFilterListenerTest.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.practicedemo.springboot.InterceptorFilterListenerTest.filter.CustomFilter;

/**
 * @Author Simple
 * @Create 2021/6/25 10:34
 */
// 不使用@WebFilter注解注册，使用FilterRegistrationBean配置注册
@Configuration
public class FilterRegistration {
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        //Filter可以new，也可以使用依赖注入Bean
        registration.setFilter(new CustomFilter());
        //过滤器名称
        registration.setName("customFilter");
        //拦截路径
        registration.addUrlPatterns("/*");
        //设置顺序
        registration.setOrder(10);
        return registration;
    }
}
