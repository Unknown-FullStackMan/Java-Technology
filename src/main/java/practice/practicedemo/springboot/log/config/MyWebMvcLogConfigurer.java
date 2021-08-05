package practice.practicedemo.springboot.log.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import practice.practicedemo.springboot.log.interceptor.AccessLogInterceptor;

/**
 * @Author Simple
 * @Create 2021/6/25 16:23
 */
@Configuration
public class MyWebMvcLogConfigurer implements WebMvcConfigurer {
    //设置排除路径，spring boot 2.*，注意排除掉静态资源的路径，不然静态资源无法访问
    private final String[] excludePath = {"/static"};

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AccessLogInterceptor()).addPathPatterns("/**").excludePathPatterns(excludePath);
    }
}
