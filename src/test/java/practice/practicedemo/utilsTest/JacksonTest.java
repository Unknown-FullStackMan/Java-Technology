package practice.practicedemo.utilsTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import practice.practicedemo.springboot.TestRESTful.pojo.Article;
import practice.practicedemo.springboot.TestRESTful.pojo.Reader;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Simple
 * @date 2021/6/23 14:11
 */
public class JacksonTest {

    @Test
    void testJackson() throws JsonProcessingException {
        // jacksond的ObjectMapper 转换对象
        ObjectMapper mapper = new ObjectMapper();
        List<Reader> readers = new ArrayList<Reader>(){{
            add(new Reader("simple",12));
            add(new Reader("simplemu",18));
        }};
        Article article = Article.builder()
                .id(2L)
                .author("simple")
                .content("springboot2.X")
                .createTime(new Date())
                .title("t1")
                .readers(readers)
                .build();

        // 将java对象转换为JSON字符串
        String jsonStr = mapper.writeValueAsString(article);
        System.out.println("对象转为字符串："+jsonStr);

        //将jsonStr转换为Article类的对象
        Article article2 = mapper.readValue(jsonStr,Article.class);
        System.out.println("json字符串转为对象：" +article2);
    }
}
