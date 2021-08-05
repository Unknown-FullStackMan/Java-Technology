package practice.practicedemo.RestTemplateTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author Simple
 * @Create 2021/6/28 17:25
 */
@SpringBootTest
class ResttemplateWithSpringApplicationTests {

    @Resource(name = "OKHttp3RestTemplate")
    private RestTemplate restTemplate;

    @Test
    void testSimple()  {
        String url = "http://jsonplaceholder.typicode.com/posts/1";
        String str = restTemplate.getForObject(url, String.class);
        System.out.println(str);
    }

    @Test
    public void testPoJO() {
        String url = "http://jsonplaceholder.typicode.com/posts/1";
        PostDTO postDTO = restTemplate.getForObject(url, PostDTO.class);
        System.out.println(postDTO.toString());
    }

    @Test
    public void testArrays() {
        String url = "http://jsonplaceholder.typicode.com/posts";
        PostDTO[] postDTOs = restTemplate.getForObject(url, PostDTO[].class);
        System.out.println("数组长度：" + postDTOs.length);
    }

    @Test
    public void testEntityPojo(){
        String url = "http://jsonplaceholder.typicode.com/posts/5";
        ResponseEntity<PostDTO> responseEntity = restTemplate.getForEntity(url,PostDTO.class);
        PostDTO body = responseEntity.getBody();
        System.out.println("HTTP 响应body：" + body.toString());


        //以下是getForEntity比getForObject多出来的内容
        HttpStatus statusCode = responseEntity.getStatusCode(); // 获取响应码
        int statusCodeValue = responseEntity.getStatusCodeValue(); // 获取响应码值
        HttpHeaders headers = responseEntity.getHeaders(); // 获取响应头

        System.out.println("HTTP 响应状态：" + statusCode);
        System.out.println("HTTP 响应状态码：" + statusCodeValue);
        System.out.println("HTTP Headers信息：" + headers);
    }
}