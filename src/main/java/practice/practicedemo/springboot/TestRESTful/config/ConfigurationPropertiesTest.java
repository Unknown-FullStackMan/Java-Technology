package practice.practicedemo.springboot.TestRESTful.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author Simple
 * @date 2021/6/24 9:21
 */
@ConfigurationProperties(prefix = "config.test")
@Data
public class ConfigurationPropertiesTest {
    private Integer id;
    private String classesOne;
    private String addressOne;
    private List<String> moreList;
}
