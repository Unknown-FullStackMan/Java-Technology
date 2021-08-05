package practice.practicedemo.springboot.WithDatabase.SpringDataJpa.service.impl;


import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.practicedemo.springboot.TestRESTful.pojo.ArticleVO;
import practice.practicedemo.springboot.WithDatabase.SpringDataJpa.Model.Article;
import practice.practicedemo.springboot.WithDatabase.SpringDataJpa.Utils.ArticleRepository;
import practice.practicedemo.springboot.WithDatabase.SpringDataJpa.Utils.DozerUtils;
import practice.practicedemo.springboot.WithDatabase.SpringDataJpa.service.ArticleRestService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author Simple
 * @date 2021/6/24 15:27
 */
@Service
public class ArticleJPARestServiceImpl implements ArticleRestService {


    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private Mapper dozerMapper;

    @Override
    public ArticleVO saveArticle(ArticleVO articleVO) {
        Article articlePO = dozerMapper.map(articleVO,Article.class);
        articleRepository.save(articlePO);
        return articleVO;
    }

    @Override
    public void deletedArticle(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void updateArticle(ArticleVO articleVO) {
        Article articlePO = dozerMapper.map(articleVO,Article.class);
        articleRepository.save(articlePO);
    }

    @Override
    public ArticleVO getArticle(Long id) {
        Optional<Article> article = articleRepository.findById(id);
        return dozerMapper.map(article.get(),ArticleVO.class);
    }

    @Override
    public List<ArticleVO> getAll() {
        List<Article> articleLis = articleRepository.findAll();
        //查询article表的所有数据
        return DozerUtils.mapList(articleLis,ArticleVO.class);
    }
}
