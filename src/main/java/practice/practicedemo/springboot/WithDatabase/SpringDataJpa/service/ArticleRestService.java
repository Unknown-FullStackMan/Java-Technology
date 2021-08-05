package practice.practicedemo.springboot.WithDatabase.SpringDataJpa.service;

import practice.practicedemo.springboot.TestRESTful.pojo.ArticleVO;

import java.util.List;

/**
 * @author Simple
 * @date 2021/6/24 15:23
 */
public interface ArticleRestService  {
    ArticleVO saveArticle(ArticleVO articleVO);

    void deletedArticle(Long id);

    void updateArticle(ArticleVO articleVO);

    ArticleVO getArticle(Long id);

    List<ArticleVO> getAll();

}
