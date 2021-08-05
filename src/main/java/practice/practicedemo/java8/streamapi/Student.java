package practice.practicedemo.java8.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author Simple
 * @Create 2021/7/30 15:26
 */

@AllArgsConstructor
@Data
public class Student {
    private String id;
    private String name;
    private Integer age;
    private String classNum;
}
