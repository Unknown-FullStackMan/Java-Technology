package practice.practicedemo.springboot.TestRESTful.pojo.testConfigurationProperties;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import practice.practicedemo.springboot.TestRESTful.utils.YamlPropertySourceFactory;


/**
 * @author Simple
 * @date 2021/6/23 16:57
 */

@Data
@Component
@Validated
@PropertySource(value = {"classpath:family.yml"}, factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "family02")
public class Family02 {

    private String familyName;   //成员变量名称要和yml配置项key一一对应
    private Father father;
    private Mother mother;
    private Child child;
}
