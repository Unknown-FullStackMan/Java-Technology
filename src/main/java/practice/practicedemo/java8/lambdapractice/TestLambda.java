package practice.practicedemo.java8.lambdapractice;


import practice.practicedemo.java8.Consumer.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author Simple
 * @date 2021/6/22 16:06
 */
public class TestLambda {
    public static void main(String[] args) {
        final Integer even = 2;

        // 1.输出
        List<String> list = Arrays.asList("a","b","c","a","b","c","a","b","c","a","b","c");
        List<String> integers = Arrays.asList("1","2","3","5","2","3");
        List<String> integers2 = new ArrayList<>();
        integers2.addAll(integers);
        list.forEach(e-> System.out.println(e));
        list.forEach((String e)-> System.out.println(e));
//        Consumer<Person> stringConsumer = x->{
//           if(x.getAge()>2){
//               integers2.add(x.getName());
//           }
//        };
//        Stream.of(
//                new Person(21,"zhangsan"),
//                new Person(22,"lisi"),
//                new Person(23,"wangwu"),
//                new Person(24,"wangwu"),
//                new Person(23,"lisi"),
//                new Person(26,"lisi"),
//                new Person(26,"zhangsan")
//        ).forEach(stringConsumer);


        System.out.println(integers2);
        // 2.排序
        List<String> list2 = Arrays.asList("1","1","3","3","2","2","6","6","7","2","9","1");
        list2.sort((e1,e2)->{
             int i = Integer.parseInt(e1) - Integer.parseInt(e2);
            return i;
        });
        System.out.println(list2);
        // 一样效果
        System.out.println(list2.toString());


        Arrays.asList(1,2,3,4,5).forEach(e->{
            if(e % even == 0){
                System.out.println("值为偶数的输出："+ e);
                System.out.println("值为偶数的输出并加100："+ (e+100));
            }

        });
        Arrays.asList(4,2,3,1,5).sort((e1,e2)->e1.compareTo(e2));
        Arrays.asList(1,2,3,1,5).sort((e1,e2)->{
            int result = e1.compareTo(e2);
            System.out.println(result);
            return 1;
        });
    }
}
