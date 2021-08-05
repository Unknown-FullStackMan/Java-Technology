package practice.practicedemo.springboot.redisOperations.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @Author Simple
 * @Create 2021/6/28 10:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    private static final long serializableUID =  -8985545025228238754L;

    private String id;
    private String firstName;
    private String lastName;
    private Address address;
    public Person(String firstname, String lastname) {
        this.firstName = firstname;
        this.lastName = lastname;
    }


}
