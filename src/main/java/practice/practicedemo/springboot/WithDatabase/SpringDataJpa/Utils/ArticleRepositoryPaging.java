package practice.practicedemo.springboot.WithDatabase.SpringDataJpa.Utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.PagingAndSortingRepository;
import practice.practicedemo.springboot.WithDatabase.SpringDataJpa.Model.Article;

/**
 * @author Simple
 * @date 2021/6/24 15:49
 */
public interface ArticleRepositoryPaging extends PagingAndSortingRepository<Article,Long> {

    //查询article表的所有数据，传入Pageable分页参数，不需要自己写SQL
    Page<Article> findAll(Pageable pageable);
    //根据author字段查询article表数据，传入Pageable分页参数，不需要自己写SQL
    Page<Article> findByAuthor(String author, Pageable pageable);
    //根据author字段和title字段，查询article表数据，传入Pageable分页参数，不需要自己写SQL
    Slice<Article> findByAuthorAndTitle(String author, String title, Pageable pageable);
}
