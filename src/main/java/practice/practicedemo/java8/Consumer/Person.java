package practice.practicedemo.java8.Consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author Simple
 * @Create 2021/7/30 8:52
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
public class Person {
    private Integer age;
    private String name;
}
