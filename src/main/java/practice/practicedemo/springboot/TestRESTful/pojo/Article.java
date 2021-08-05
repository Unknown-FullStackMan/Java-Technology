package practice.practicedemo.springboot.TestRESTful.pojo;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author Simple
 * @date 2021/6/23 10:31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder(value = {"content","title"})  // 改变子属性在JSON序列化中的默认定义的顺序。如：content在先，title在后。
public class Article {
    @JsonIgnore() //排除某个属性不做序列化与反序列化
    private Long id;

    //@JsonProperty("author01") //@JsonProperty(anotherName) 为某个属性换一个名称，体现在JSON数据里面
    private String author;

    private String title;
    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL) //@JsonInclude(JsonInclude.Include.NON_NULL) 排除为空的元素不做序列化反序列化
    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8") //通常会对日期类型转换，进行全局配置，而不是在每一个java bean里面配置
    private Date createTime;

    private List<Reader> readers;
}
