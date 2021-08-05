package practice.practicedemo.RedisTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.hash.HashMapper;
import org.springframework.data.redis.hash.Jackson2HashMapper;
import practice.practicedemo.springboot.redisOperations.entity.Address;
import practice.practicedemo.springboot.redisOperations.entity.Person;

import javax.annotation.Resource;
import java.util.Map;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

/**
 * @Author Simple
 * @Create 2021/6/28 13:55
 */
@SpringBootTest
public class RedisConfigTest3 {

    @Resource(name="redisTemplate")
    private HashOperations<String, String, Object> jacksonHashOperations;

    private HashMapper<Object,String,Object> jackson2HashMapper = new Jackson2HashMapper(false);

    @Test
    public void testHashPutAll(){
        Person person = new Person("kobe","bryant");
        person.setId("kobe");
        person.setAddress(new Address("洛杉矶","美国"));

        //将对象以hash的形式放入redis数据库
        Map<String,Object> mappedHash = jackson2HashMapper.toHash(person);
        jacksonHashOperations.putAll("player:" + person.getId(), mappedHash);

        //将对象从数据库取出来
        Map<String,Object> loadedHash = jacksonHashOperations.entries("player:" + person.getId());
        Object map = jackson2HashMapper.fromHash(loadedHash);
        Person getback = new ObjectMapper().convertValue(map,Person.class);



        System.out.println(person.getFirstName().equals(getback.getFirstName()));
    }

}
