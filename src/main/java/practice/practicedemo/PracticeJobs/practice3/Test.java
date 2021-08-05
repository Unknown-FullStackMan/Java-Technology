package PracticeJobs.practice3;

/**
 * @Author Simple
 * @Create 2021/7/14 16:15
 */
public class Test {
    public static void main(String[] args) {

        Father father = new Father();
        father.setAge(AgeEnum.Father_38.toString());
        father.setName("张三");
        father.job();


        Son son = new Son();
        son.setAge(AgeEnum.Son_15.toString());
        son.setName("张小三");
        son.job();

        /**
         *     son.name  father.name 因为不能访问子类不能调用其父类的private属性
         *     son.age   father.age 可以访问public修饰的---
         */

        Daughter daughter = new Daughter();
        daughter.setAge(AgeEnum.Daughter_12.toString());
        System.out.println("女儿年龄是在枚举的第 "+(AgeEnum.Daughter_12.ordinal()+1) +" 位");



        if(son instanceof Father && daughter instanceof Father){
            System.out.println("儿子是继承父亲");
            System.out.println("女儿是继承父亲");
        }


        Father father2 = new Son();
        father2.eat2();  // 子类的eat2()方法
        father2.job();   // 子类的job()方法
        father2.eat3();  // 父类的eat3()方法
        /**
         *  father2.eat2();  // 子类的eat2()方法
         *  father2.job();   // 子类的job()方法
         *  father2.eat3();  // 父类的eat3()方法
         *  father2.drink();  //不能调用， 父类引用变量可以访问子类中属于父类的属性和方法，但是不能访问子类独有的属性和方法
         */

        Father father3 = new Daughter();
        father3.eat2();

        System.out.println("类型转换异常");
        Son son1 = (Son) new Father();
        son1.eat2();
    }
}
