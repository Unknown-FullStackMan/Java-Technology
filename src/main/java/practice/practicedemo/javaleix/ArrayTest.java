package javaleix;

import java.util.Arrays;

/**
 * @Author Simple
 * @Create 2021/7/1 17:25
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i=0;i<10;i++){
            a[i]=i;
        }
        for (int e:
             a) {
            System.out.println(e);
        }

        System.out.println(a);
        System.out.println(Arrays.toString(a));


        /**
         * 提供了一种创建数组对象并同时赋予初始值的简化书写形式
         * 不需要调用new
         */
        int[] b = {2,3,6,5,4,8};

        /**
         * 这种表示法将创建一个新数组并利用括号中提供的值进行初始化，数组的大小就是初始值的
         * 个数。 使用这种语法形式可以在不创建新变量的情况下重新初始化一个数组
         */
        a = new int[]{4,5,4,8,4,4};

        b= Arrays.copyOf(a, 12);

        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.binarySearch(b, 8));


        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        if(args.length == 0 || args[0].equals("-h"))
            System.out.println("Hello");
        else if (args[0].equals("-g"))
            System.out.println("Good BY");
        for (int i = 1; i < args.length; i++) {
            System.out.println(" "+ args[i]);
        }
        System.out.println("!!!");
    }
}
