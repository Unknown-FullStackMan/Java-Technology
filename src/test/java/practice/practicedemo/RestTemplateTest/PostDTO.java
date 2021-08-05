package practice.practicedemo.RestTemplateTest;

import lombok.Data;

/**
 * @Author Simple
 * @Create 2021/6/28 17:25
 */
@Data
public class PostDTO {
    private int userId;
    private int id;
    private String title;
    private String body;
}