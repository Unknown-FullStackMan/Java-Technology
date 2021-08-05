package practice.practicedemo.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Simple
 * @Create 2021/7/30 11:02
 */
public class Test2 {
    public static void main(String[] args) {

        List<Integer> dest = new ArrayList<>();
        List<Number> src = new ArrayList<>();
        List<String> list = new ArrayList<>();
        // test() T是指定类型，所以dest和src必须是同一类型
        // Test2.test(dest,src);
        // test2() ?是不指定类型，所以dest和src可以是不同类型
        Test2.test2(dest,src);

        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("XXX");
        list.add("2");
        list.add("1");
        System.out.println(Test2.test3(list));


    }


    public static  <T extends Number> void test(List<T> dest, List<T> src){
        System.out.println(dest);
        System.out.println(src);
    }

    public static void test2(List<? extends Number> dest ,List<? extends Number> src){
        System.out.println(dest);
        System.out.println(src);
    }

    public static <T> List<T> test3(List<T> list){
        List<T> list1 = new ArrayList<>();
        list.forEach(x->{
            if(x.equals("1")){
                list1.add(x);
            }
        });
        return  list1;
    }
}
