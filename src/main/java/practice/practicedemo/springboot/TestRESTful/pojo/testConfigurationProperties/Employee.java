package practice.practicedemo.springboot.TestRESTful.pojo.testConfigurationProperties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

/**
 * @author Simple
 * @date 2021/6/23 17:30
 */
@Data
@Configuration
@PropertySource(name = "employeeProperties",
                value = "classpath:employee.properties",
                encoding = "utf-8")
public class Employee {


    @Value("#{'${employee.names}'.split(',')}")
    private List<String> employeeNames;

    @Value ("#{'${employee.names}'.split(',')[0]}")
    private String firstEmployeeName;

    @Value ("#{${employee.age}}")
    private Map<String, Integer> employeeAge;

    @Value ("#{${employee.age}.two}")
// @Value ("#{${employee.age}['two']}")  //这样写也可以
    private String employeeAgeTwo;

    @Value ("#{${employee.age}['five'] ?: 31}")
    private Integer ageWithDefaultValue;

    @Override
    public String toString() {
        return "Employee{" +"\n"+
                "employeeNames=" + employeeNames +"\n"+
                ",firstEmployeeName='" + firstEmployeeName + '\'' +"\n"+
                ", employeeAge=" + employeeAge +"\n"+
                ", employeeAgeTwo='" + employeeAgeTwo + '\'' +"\n"+
                ", ageWithDefaultValue=" + ageWithDefaultValue +"\n"+
                '}';
    }
}
