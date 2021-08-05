package practice.practicedemo.RedisTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import practice.practicedemo.springboot.redisOperations.entity.Address;
import practice.practicedemo.springboot.redisOperations.entity.Person;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Author Simple
 * @Create 2021/6/28 10:35
 */
@SpringBootTest
public class RedisTemplateTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;  // 以String序列化方式保存数据的通用模板类
    @Resource
    private RedisTemplate<String, Person> redisTemplate; // 默认以JDK二进制方式保存数据的通用模板类



    @Test
    public void StringRedisTemplateTest(){
        Person person = new Person("Simple","Mu");
        person.setAddress(new Address("CD","Chain"));
        stringRedisTemplate.opsForValue().set("player:srt","simple mu",20, TimeUnit.DAYS);
        redisTemplate.opsForValue().set("player:srt",person,20,TimeUnit.DAYS);
        stringRedisTemplate.opsForValue().set("player:srt", String.valueOf(person), 20, TimeUnit.DAYS);
        ValueOperations<String, String> valueOperations = stringRedisTemplate.opsForValue();
        valueOperations.set("peroson", String.valueOf(person));
    }


}
