package practice.practicedemo.clone;

import practice.practicedemo.pojo.cloneClass;
import practice.practicedemo.pojo.cloneClass2;

/**
 * @Author Simple
 * @Create 2021/7/2 14:30
 */
public class cloneTest3 {
    /**
     * 深拷贝test
     */

    public static void main(String[] args) throws CloneNotSupportedException {

        cloneClass2 c2 = new cloneClass2();
        c2.setName("c2");
        c2.setId(111);
        c2.setCloneClass(new cloneClass());

        cloneClass2 class3 = c2.clone();
        System.out.println(c2.getCloneClass() == class3.getCloneClass());

    }
}
