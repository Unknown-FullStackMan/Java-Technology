package practice.practicedemo.springboot.TestRESTful.pojo.testConfigurationProperties;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;



import javax.validation.constraints.Min;


/**
 * @author Simple
 * @date 2021/6/23 16:21
 */
@Data
public class Father {

    @NotEmpty
    private String name;

    @Min(21)
    private Integer age;
}