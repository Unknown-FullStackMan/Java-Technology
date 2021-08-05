package practice.practicedemo.springboot.InterceptorFilterListenerTest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import practice.practicedemo.springboot.InterceptorFilterListenerTest.interceptor.CustomHandlerInterceptor;



/**
 * @author Simple
 * 实现 WebMvcConfigurer接口 注册刚才定义的拦截器
 * @date 2021/6/25 10:03
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Autowired
    CustomHandlerInterceptor customHandlerInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册拦截器 拦截规则
        // 多个拦截器时 以此添加 执行顺序按添加顺序
        registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/");
    }
}
