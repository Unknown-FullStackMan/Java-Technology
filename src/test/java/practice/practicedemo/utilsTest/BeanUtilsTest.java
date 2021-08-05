package practice.practicedemo.utilsTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;
import practice.practicedemo.springboot.TestRESTful.pojo.Article;
import practice.practicedemo.springboot.TestRESTful.pojo.ArticleVO;

/**
 * @author Simple
 * @date 2021/6/24 14:10
 */
@SpringBootTest
public class BeanUtilsTest {

    @Test
    public void test(){
        Article article = new Article();
        article.setAuthor("A");
        article.setId(1L);
        article.setContent("aaa");
        article.setTitle("XXXX");

        ArticleVO articleVO = new ArticleVO();
        articleVO.setTitle("NBBB");
        articleVO.setId(2L);
        //articleVO.setPrice("111");
        BeanUtils.copyProperties(article,articleVO);
        System.out.println(articleVO.toString());
    }
}
