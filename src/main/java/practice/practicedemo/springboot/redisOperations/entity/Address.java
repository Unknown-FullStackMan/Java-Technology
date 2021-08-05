package practice.practicedemo.springboot.redisOperations.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Simple
 * @Create 2021/6/28 10:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {
    private static final long serialVersionUID = -8985545025228238771L;

    private String city;
    private String country;


}

