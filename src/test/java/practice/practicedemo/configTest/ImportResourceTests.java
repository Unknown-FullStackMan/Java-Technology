package practice.practicedemo.configTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Simple
 * @date 2021/6/23 17:21
 */

@SpringBootTest
public class ImportResourceTests {

    @Autowired
    private ConfigurableApplicationContext ioc;

    @Test
    public void testHelloService() {
        //测试Spring上下文环境中是否有testBeanService这样一个bean，有的话表示xml配置文件生效
        boolean testBeanService= ioc.containsBean("testBeanService");
        System.out.println(testBeanService);
    }
}
