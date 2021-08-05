//package practice.practicedemo.CacheTest;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.cache.annotation.EnableCaching;
//import practice.practicedemo.springboot.springcache.pojo.User;
//import practice.practicedemo.springboot.springcache.service.UserService;
//
//import javax.annotation.Resource;
//
///**
// * @Author Simple
// * @Create 2021/6/28 15:07
// */
//@SpringBootTest
//@EnableCaching
//public class CacheTest {
//
//    @Resource
//    private UserService userService;
//
//    @Test
//    public void findUserTest() {
//        for (int i = 0; i < 3; i++) {
//            System.out.println("第" + i + "次");
//            User user = userService.findUser();
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    public void updateUserTest() {
//        userService.updateUser();
//        User user = userService.findUser();
//        System.out.println(user);
//    }
//
//    @Test
//    public void clearUserTest() {
//        userService.clearUser();
//        User user = userService.findUser();
//        System.out.println(user);
//    }
//
//}
