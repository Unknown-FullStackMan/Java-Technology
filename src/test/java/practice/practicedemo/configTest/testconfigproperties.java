package practice.practicedemo.configTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import practice.practicedemo.springboot.TestRESTful.config.ConfigurationPropertiesTest;

/**
 * @author Simple
 * @date 2021/6/24 9:30
 */
@ExtendWith(SpringExtension.class)  //Junit5
@SpringBootTest
public class testconfigproperties {

    @Autowired
    ConfigurationPropertiesTest configurationPropertiesTest;

    @Test
    public void test(){
        System.out.println(configurationPropertiesTest);
    }
}
