package practice.practicedemo.springboot.InterceptorFilterListenerTest.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author Simple
 * @Create 2021/6/25 10:23
 */

// 注册器名称为customFilter,拦截的url为所有
@WebFilter(filterName = "customFilter ",urlPatterns = "/")  //第一种实现并注册Filter的方法，使用WebFilter注解即可注册filter
@Slf4j
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter 初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("customFilter 请求处理之前----doFilter方法之前过滤请求");
        //对request、response进行一些预处理
        // 比如设置请求编码
        // request.setCharacterEncoding("UTF-8");
        // response.setCharacterEncoding("UTF-8");

        //链路 直接传给下一个过滤器
        filterChain.doFilter(servletRequest, servletResponse);

        log.info("customFilter 请求处理之后----doFilter方法之后处理响应");
    }

    @Override
    public void destroy() {
        log.info("filter 销毁");
    }
}
