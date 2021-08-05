package practice.practicedemo.configTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import practice.practicedemo.springboot.TestRESTful.pojo.testConfigurationProperties.Employee;



/**
 * @author Simple
 * @date 2021/6/23 17:40
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ValueBindTests {

    @Autowired
    Employee employee;

    @Test
    public void valueBindTests2(){
        System.out.println(employee.toString());
    }


}
