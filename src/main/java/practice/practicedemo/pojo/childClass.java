package pojo;

/**
 * @Author Simple
 * @Create 2021/7/2 11:07
 */
public class childClass extends superClass {
    private  String name3;
    public static void main(String[] args) {
        childClass c = new  childClass();
        c.name3 = c.name2;
    }
}
