package PracticeJobs.practice3;

/**
 * @Author Simple
 * @Create 2021/7/14 16:10
 */
public class Daughter extends Father{
    @Override
    public void eat2() {
        System.out.println("女儿吃牛肉");
    }

    @Override
    public void job() {
        System.out.println(getName()+"今年年纪"+getAge()+"  她的的job也是学习！！！");
    }
}
