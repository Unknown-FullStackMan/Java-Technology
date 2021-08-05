package practice.practicedemo.springboot.springcache.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Simple
 * @Create 2021/6/28 15:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String id;
    private String name;
    private String address;
    private String tel;
    private Integer age;


}
