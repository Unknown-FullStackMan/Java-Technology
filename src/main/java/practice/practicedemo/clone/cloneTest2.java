package practice.practicedemo.clone;


import practice.practicedemo.pojo.cloneClass;

/**
 * @Author Simple
 * @Create 2021/7/2 14:03
 */
public class cloneTest2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * 浅拷贝test
         */
        cloneClass s1 = new cloneClass();
        s1.setName("s1");
        s1.setCloneClass(new cloneClass());

        cloneClass s2 = s1.clone();
        s2.setName("s2");

        System.out.println(s1 == s2);
        System.out.println(s2.getName());
        System.out.println(s1.getName());
        System.out.println(s1.getCloneClass() == s2.getCloneClass());

    }
}
