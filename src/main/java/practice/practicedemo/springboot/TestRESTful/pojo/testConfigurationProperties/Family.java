package practice.practicedemo.springboot.TestRESTful.pojo.testConfigurationProperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author Simple
 * @date 2021/6/23 16:20
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "family")   //表示配置的整体前缀
public class Family {

    private String familyName;   //成员变量名称要和yml配置项key一一对应
    private Father father;
    private Mother mother;
    private Child child;
}
