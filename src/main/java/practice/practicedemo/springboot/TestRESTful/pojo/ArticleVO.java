package practice.practicedemo.springboot.TestRESTful.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Simple
 * @date 2021/6/24 14:11
 */
@Data
public class ArticleVO {

        private Long id;
        private String author;
        private String title;
        private String content;
        private Date createTime;
        private List<Reader> readers;
        private String price;


}
