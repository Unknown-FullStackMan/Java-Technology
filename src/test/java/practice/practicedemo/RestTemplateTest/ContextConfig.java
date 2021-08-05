package practice.practicedemo.RestTemplateTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Simple
 * @Create 2021/6/28 17:27
 */
@Configuration
public class ContextConfig {

    @Bean
    public RestTemplate OKHttp3RestTemplate(){
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
