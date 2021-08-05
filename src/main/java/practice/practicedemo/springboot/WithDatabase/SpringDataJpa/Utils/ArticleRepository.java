package practice.practicedemo.springboot.WithDatabase.SpringDataJpa.Utils;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.practicedemo.springboot.WithDatabase.SpringDataJpa.Model.Article;

/**
 * @author Simple
 * @date 2021/6/24 15:21
 */
public interface ArticleRepository extends JpaRepository<Article,Long> {
    Article findByAuthor(String author);
}
