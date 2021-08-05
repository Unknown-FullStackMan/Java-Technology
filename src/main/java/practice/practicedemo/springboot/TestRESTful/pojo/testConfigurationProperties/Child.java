package practice.practicedemo.springboot.TestRESTful.pojo.testConfigurationProperties;

import lombok.Data;

import java.util.List;

/**
 * @author Simple
 * @date 2021/6/23 16:22
 */
@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}