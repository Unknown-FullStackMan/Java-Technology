package practice.practicedemo.RedisTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import practice.practicedemo.springboot.redisOperations.entity.Address;
import practice.practicedemo.springboot.redisOperations.entity.Person;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Author Simple
 * @Create 2021/6/28 13:04
 */
@SpringBootTest
public class RedisConfigTest2 {
    @Resource(name = "redisTemplate")
    private ValueOperations<String,Object> valueOperations;   // 以redis string类型存取Java Object(序列化反序列化)

    @Resource(name = "redisTemplate")
    private HashOperations<String, String, Object> hashOperations; // 以redis的hash类型存储java Object

    @Resource(name = "redisTemplate")
    private ListOperations<String, Object> listOperations; // 以redis的list类型存储java Object

    @Resource(name = "redisTemplate")
    private SetOperations<String, Object> setOperations;   // 以redis的set类型存储java Object

    @Resource(name = "redisTemplate")
    private ZSetOperations<String, Object> zSetOperations;  // 以redis的zset类型存储java Object

    @Test
    public void testValueObj(){
        Person p1 = new Person("simple","mu");
        p1.setId("100");
        p1.setAddress(new Address("成都","中国"));
        valueOperations.set("people1",p1,20, TimeUnit.DAYS);
        Person getback =(Person) valueOperations.get("people1");
        System.out.println(getback);
    }

    @Test
    public void testSetOperation(){
        Person person = new Person("kobe","byrant");
        Person person2 = new Person("curry","stephen");
        Person person3 = new Person("curry","stephen");
        setOperations.add("player_sets",person,person2,person3); // person2 person3重复，只插入一条数据
        // members获取Redis Set中的所有记录
        Set<Object> membersSet = setOperations.members("player_sets");
        System.out.println(membersSet);
    }

    @Test
    public void testHashOperation(){
        Person person = new Person("1","kobe","byrant",new Address("洛杉矶","美国"));
        hashOperations.put("hash:player","firstName",person.getFirstName());
        hashOperations.put("hash:player","lastName",person.getLastName());
        hashOperations.put("hash:player","address",person.getAddress());

        hashOperations.put("hash:player2","firstName",person.getFirstName());
        hashOperations.put("hash:player2","lastName",person.getLastName());
        hashOperations.put("hash:player2","address",person.getAddress());

        Person person2 = new Person("simple","mu");
        hashOperations.put("hash:player2","firstName",person2.getFirstName());
        hashOperations.put("hash:player2","lastName",person2.getLastName());
        hashOperations.put("hash:player2","address",person2.getAddress());
        String firstName = (String)hashOperations.get("hash:player","firstName");
        System.out.println(firstName);
    }

    @Test
    public void testListOperations(){
        listOperations.leftPush("list:player",new Person("simple","mu"));
        listOperations.leftPush("list:player",new Person("kobe","byrant"));
        listOperations.leftPush("list:player",new Person("Jordan","Mikel"));
        listOperations.leftPush("list:player",new Person("curry","stephen"));
        // 从左侧存，再从左侧取，所以取出来的数据是后放入的 curry
        Person person = (Person) listOperations.leftPop("list:player");
        System.out.println(person);
    }


}
