package practice.practicedemo.configTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import practice.practicedemo.springboot.TestRESTful.pojo.testConfigurationProperties.Family;
import practice.practicedemo.springboot.TestRESTful.pojo.testConfigurationProperties.Family02;

/**
 * @author Simple
 * @date 2021/6/23 16:23
 */
@ExtendWith(SpringExtension.class)  //Junit5
@SpringBootTest
public class CustomYamlTest {

    @Autowired
    Family family;

    @Autowired
    Family02 family02;
    @Test
    public void hello(){
        System.out.println(family.toString());
    }
    @Test
    public void hello2(){
        System.out.println(family02.toString());
    }

}