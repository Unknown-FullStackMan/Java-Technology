package clone;

import pojo.superClass;

/**
 * @Author Simple
 * @Create 2021/7/2 13:59
 */
public class cloneTest {
    public static void main(String[] args) {
        superClass s1 = new superClass();
        s1.setName("s1");
        superClass s2 = s1;
        System.out.println(s2.getName());
        s2.setName("s2");
        System.out.println(s2.getName()+"  "+s1.getName());
        System.out.println(s1 == s2);
    }
}
