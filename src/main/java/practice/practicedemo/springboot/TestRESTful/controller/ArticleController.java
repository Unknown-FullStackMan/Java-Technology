package practice.practicedemo.springboot.TestRESTful.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import practice.practicedemo.springboot.TestRESTful.pojo.Article;
import practice.practicedemo.springboot.TestRESTful.pojo.Reader;
import practice.practicedemo.springboot.TestRESTful.utils.AjaxResponse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Simple
 * @date 2021/6/23 11:06
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleController {


    List<Reader> readers = new ArrayList<Reader>(){{
        add(new Reader("simple",12));
        add(new Reader("simplemu",18));
    }};


    //获取一篇Article，使用GET方法,根据id查询一篇文章
    //@RequestMapping(value = "/articles/{id}",method = RequestMethod.GET)
    @Cacheable(value="article")
    @GetMapping("/articles/get/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id){
        Article article = Article.builder()
                .id(id)
                .author("simple")
                .content("springboot2.X")
                .createTime(new Date())
                .title("t1")
                .readers(readers)
                .build();
        log.info("article: "+article);
        return AjaxResponse.success(article);
    }
    //增加一篇Article ，使用POST方法(RequestBody方式接收参数)
    //@RequestMapping(value = "/articles",method = RequestMethod.POST)
    @PostMapping("/articles/add/")
    public AjaxResponse saveArticle(@RequestBody Article article,
                                    @RequestHeader String aaa){

        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
        log.info("=====saveArticle=====:" + article);
        return AjaxResponse.success(article);
    }


   //增加一篇Article ，使用POST方法(RequestParam方式接收参数)
   @PostMapping("/articles")
   public AjaxResponse saveArticle(@RequestParam  String author,
                                  @RequestParam  String title,
                                  @RequestParam  String content,
                                  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                                  @RequestParam  Date createTime){

    log.info("saveArticle:" + createTime);
        return AjaxResponse.success();
   }
   //更新一篇Article，使用PUT方法，以id为主键进行更新
   //@RequestMapping(value = "/articles",method = RequestMethod.PUT)
   @PutMapping("/articles/update")
   public AjaxResponse updateArticle(@RequestBody Article article){
       if(article.getId() == null){
           //article.id是必传参数，因为通常根据id去修改数据
           //TODO 抛出一个自定义的异常
       }

       log.info("=====updateArticle=====:" + article);
       return AjaxResponse.success();
   }

    //删除一篇Article，使用DELETE方法，参数是id
    //@RequestMapping(value = "/articles/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/articles/delete/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id){

        log.info("=====deleteArticle=====:" + id);
        return AjaxResponse.success();
    }


    @PostMapping("/articles/testMockito")
    public AjaxResponse saveArticle(@RequestBody Article article){

        log.info("=====saveArticle=====:" + article);
        return AjaxResponse.success(article);
    }


}
