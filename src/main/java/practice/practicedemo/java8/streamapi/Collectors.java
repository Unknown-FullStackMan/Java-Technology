package practice.practicedemo.java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @Author Simple
 * @Create 2021/7/30 15:43
 */
public class Collectors {
    public static void main(String[] args) {

        /**
         *    Collectors.toList把流中元素收集到List
         *    Collectors.toSet把流中元素收集到Set
         */
        List<Student> collect1 = Test.computerClub.stream().collect(java.util.stream.Collectors.toList());
        Set<Student> collect2 = Test.pingpongClub.stream().collect(java.util.stream.Collectors.toSet());

        // 注意key必须是唯一的 如果不是唯一的会报错而不是像普通map那样覆盖
        // Collectors.toMap
        Map<String,String> collect3 = Test.pingpongClub.stream().collect(java.util.stream.Collectors.toMap(Student::getId,Student::getName));
        System.out.println(collect3);

        // 分组 类似于数据库中的group by
        Map<String,List<Student>> collect4 = Test.pingpongClub.stream().collect(java.util.stream.Collectors.groupingBy(Student::getClassNum));
        System.out.println("按照班级号分组:");
        System.out.println(collect4);

        // 字符串拼接，第一个参数是分隔符，第二个参数是前缀，第二个参数是后缀
        String collect5 = Test.computerClub.stream().map(Student::getName).collect(java.util.stream.Collectors.joining(",","(",")"));
        System.out.println(collect5);

        // 三个俱乐部符合年龄要求的按照班级分组
        Map<String,List<Student>> collect6 = Stream.of(Test.basketballClub,Test.computerClub,Test.pingpongClub)
                .flatMap(e->e.stream().filter(s->s.getAge()<17))
                .collect(java.util.stream.Collectors.groupingBy(Student::getClassNum));

        System.out.println(collect6);
    }
}
