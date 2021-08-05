package javaleix;

import java.io.Console;
import java.util.Scanner;

/**
 * @Author Simple
 * @Create 2021/7/1 16:35
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("what your name:");
        String name = in.nextLine();
        /** 使用 nextLine 方法是因为在输人行中有可能包含空格。要想读取一个单词 */
        System.out.println("what your firstName:");
        String firstName = in.next();
        System.out.println("what your age:");
        int age = in.nextInt();
        System.out.println("name: "+name+" "+"age: "+age);

        /** 所以 Scanner 类不适用于从控制台读取密码。Java SE 6 特别
         引入了 Console 类实现这个目的。要想读取一个密码， 可以采用下列代码：*/

        /** 采用 Console 对象处理输入不如采用 Scanner 方便。每次只能读取一行输入， 而没有
         能够读取一个单词或一个数值的方法。*/
//        Console console = System.console();
//        String username = console.readLine("userName: ");
//        char[] password = console.readPassword("Password:");


        System.out.println(0.2 + 0.1);
    }
}
