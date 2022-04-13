package practice.practicedemo;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import practice.practicedemo.pojo.superClass;

/**
 * @Author Simple
 * @Create 2021/8/19 15:18
 */
public class test {
    @Test
    public void test1(){
        String s = null;
        change(s);
        System.out.println(s);
    }

    private void change(String s){
         s = "xxxxxxxxxxxxx";
    }



    @Test
    public void test2(){
        System.out.println(JSONObject.toJSONString(null));
    }

    @Test
    public void test3(){
        superClass superClass1 = new superClass();
        superClass1.setName("xxx");
        superClass1.setId(1);

        System.out.println("superClass1= "+superClass1);

        superClass superClass2 =superClass1;

        System.out.println("superClass2= "+superClass2);

        System.out.println("superClass1==superClass2: "+(superClass1==superClass2));

        superClass superClass3 = new superClass();
        System.out.println("before superClass3= "+superClass3);
        superClass3 = superClass1;
        System.out.println("after superClass3= "+superClass3);
        System.out.println("superClass3==superClass1: "+(superClass1==superClass3));

        System.out.println("superClass3==superClass2: "+(superClass2==superClass3));

    }
}
