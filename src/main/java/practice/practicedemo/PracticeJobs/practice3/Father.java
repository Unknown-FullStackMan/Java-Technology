package PracticeJobs.practice3;

/**
 * @Author Simple
 * @Create 2021/7/14 16:09
 */
public class Father implements Work{
    private String name ;
    public String age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 封装，private修饰的方法和属性不能被其他类和子类访问
     */
    private void eat1(){
        System.out.println("父亲吃米饭1");
    }

    public void eat2(){
        System.out.println("父亲吃米饭2");
    }

    public void eat3(){
        System.out.println("父亲吃米饭3");
    }

    @Override
    public void job() {
        System.out.println(getName()+"今年年纪"+getAge()+"  他的job是程序员！");
    }
}
