package practice.practicedemo.springboot.log.interceptor;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import practice.practicedemo.springboot.log.entity.AccessLog;
import practice.practicedemo.springboot.log.utils.AddressIpUtils;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @Author Simple
 * @Create 2021/6/25 15:34
 */
@Slf4j(topic = "ACCESS-LOG")
public class AccessLogInterceptor implements HandlerInterceptor {
    // 请求开始时间标志
    private static final String LOGGER_SEND_TIME = "SEND_TIME";
    // 请求日志实体标识
    private static final String LOGGER_ACCESS_LOG = "ACCESS_LOG_ENTITY";

    /**
     * 进入SpringMVC的Controller之前开始记录日志实体
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 创建日志实体
        AccessLog accessLog = new AccessLog();
        // 设置IP地址
        accessLog.setIp(AddressIpUtils.getIpAddress(request));
        // 设置请求方法，GET，POST...
        accessLog.setHttpMethod(request.getMethod());
        // 设置请求开始时间
        request.setAttribute(LOGGER_SEND_TIME,System.currentTimeMillis());
        // 设置请求实体到request内，方便afterCompletion方法调用
        request.setAttribute(LOGGER_ACCESS_LOG,accessLog);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // 获取本次请求实体
        AccessLog accessLog = (AccessLog) request.getAttribute(LOGGER_ACCESS_LOG);
        // 获取请求错误码，根据需求存入数据库，这里不保存
        int status = response.getStatus();
        accessLog.setHttpStatus(status);
        // 设置访问者(这里暂时写死）
        // 因为不同的应用可能将访问者信息放在session里面，有的通过request传递，
        // 总之可以获取到，但获取的方法不同
        accessLog.setUsername("Simple");

        // 当前时间
        long currentTime = System.currentTimeMillis();
        // 请求开始时间
        long sendTime = Long.valueOf(request.getAttribute(LOGGER_SEND_TIME).toString());

        // 设置请求时间差
        accessLog.setDuration(Integer.valueOf((currentTime-sendTime)+""));

        accessLog.setCreateTime(new Date());

        log.info(accessLog.toString());
    }
}
