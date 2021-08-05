package practice.practicedemo.springboot.TestRESTful.config;


import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Simple
 * @date 2021/6/24 9:27
 */
@Configuration
@EnableConfigurationProperties(ConfigurationPropertiesTest.class)
public class configpropertiestest {
    @Bean
    public ConfigurationPropertiesTest configurationPropertiesTest(ConfigurationPropertiesTest configurationPropertiesTest){
        System.out.println(configurationPropertiesTest.getId());
        return configurationPropertiesTest;
    }

}
