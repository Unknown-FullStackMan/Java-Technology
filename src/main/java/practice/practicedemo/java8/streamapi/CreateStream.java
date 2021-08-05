package practice.practicedemo.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author Simple
 * @Create 2021/7/30 15:40
 */
public class CreateStream {
    public static void main(String[] args) {
        /**
         * 常用的Stream三种创建方式
         */

        // 1.集合 .stream()方法
        Stream<Student> studentStream = Test.basketballClub.stream();
        System.out.println(studentStream.max((x,y)-> x.getAge()- y.getAge()));
        // 2.静态方法Stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c");
        System.out.println(stream2);
        // 3.数组
        String[] arr = {"a","b","c"};
        Stream<String> stream3 = Arrays.stream(arr);

    }
}
