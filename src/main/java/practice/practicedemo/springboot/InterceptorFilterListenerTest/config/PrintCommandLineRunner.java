package practice.practicedemo.springboot.InterceptorFilterListenerTest.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author Simple
 * @Create 2021/6/25 11:18
 */
@Slf4j
@Component
public class PrintCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        log.info("======================================================");
        log.info("========================程序启动========================");
        log.info("======================================================");
        System.out.println("BeanCommandLineRunner run1() args: "+ Arrays.toString(args));
    }
}
