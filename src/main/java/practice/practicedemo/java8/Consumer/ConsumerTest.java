package practice.practicedemo.java8.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author Simple
 * @Create 2021/7/30 8:51
 * Consumer的作用顾名思义,是给定义一个参数,对其进行(消费)处理,处理的方式可以是任意操作.
 * 其核心方法如下:
 *
 * void accept(T t);
 * 对给定的参数T执行定义的操作
 *
 * default Consumer andThen(Consumer<? super T> after)
 * 对给定的参数T执行定义的操作执行再继续执行after定义的操作
 */
public class ConsumerTest {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        // 用法1：正常重写accept()方法
        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                if(person.getName().equals("Simple")){
                    personList.add(person);
                }

            }
        };

        personConsumer = personConsumer.andThen((e)->{
          personList.removeIf((x)->x.getAge()<22);
        });

        Stream.of(
                new Person(21,"xx"),
                new Person(21,"xxxxx"),
                new Person(21,"PPP"),
                new Person(21,"OO"),
                new Person(21,"Simple"),
                new Person(22,"Simple"),
                new Person(23,"Simple")
        ).forEach(personConsumer);
        System.out.println(personList);


        // 用法2：使用Lambda表达式
        Consumer<Person> personConsumer2 = (x)->{
            if(x.getName().equals("xx")){
                personList.add(x);
            }
        };
        Stream.of(
                new Person(21,"xx"),
                new Person(21,"xxxxx"),
                new Person(21,"PPP"),
                new Person(21,"OO"),
                new Person(21,"Simple"),
                new Person(22,"Simple"),
                new Person(23,"Simple")
        ).forEach(personConsumer2);
        // 或者直接传入Lambda表达式
        Stream.of(
                new Person(21,"xx"),
                new Person(21,"xxxxx"),
                new Person(21,"PPP"),
                new Person(21,"OO"),
                new Person(21,"Simple"),
                new Person(22,"Simple"),
                new Person(23,"Simple")
        ).forEach((x)->{
            if(x.getName().equals("OO")){
                personList.add(x);
            }
        });
        System.out.println(personList);


        Consumer<String>  consumer = e-> System.out.println(e);
        consumer.accept("helloworld");

    }
}
