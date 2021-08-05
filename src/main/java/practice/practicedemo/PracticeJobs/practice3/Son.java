package PracticeJobs.practice3;

/**
 * @Author Simple
 * @Create 2021/7/14 16:09
 */
public class Son extends Father implements Work {

    @Override
    public void job() {
        System.out.println(getName()+"今年年纪"+getAge()+"  他的的job是学习！！！");
    }

    @Override
    public void eat2() {
        System.out.println("儿子吃汉堡");
    }

    public void drink(){
        System.out.println("儿子吃可乐");
    }

}
