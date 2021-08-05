package practice.practicedemo.springboot.TestRESTful.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Simple
 * @date 2021/6/23 11:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reader {
    private String name;
    private Integer age;
}
