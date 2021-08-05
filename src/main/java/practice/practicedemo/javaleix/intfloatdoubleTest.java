package javaleix;

/**
 * @Author Simple
 * @Create 2021/7/1 14:48
 */
public class intfloatdoubleTest {
    public static strictfp void main(String[] args) {


        /**
         * 如果将一个类标记为
         * strictfp, 这个类中的所有方法都要使用严格的浮点计算.
         * 在 main 方法中的所有指令都将使用严格的浮点计算
         */

        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);

        /**
         *  Java中，没有幂运算， 因此需要借助于 Math 类的 pow 方法。
         *  将 y 的值设置为 x 的 a 次幂（ xa)。pow 方法有两个 double 类型的参数， 其返回结果也为
         * double 类型。
         */

        double y2 = Math.pow(x,2);
        System.out.println(y2);

        int n = 123456789;
        float f = n;
        System.out.println(n);

        double xd = 9.997;
        int nx = (int)xd;
        System.out.println(nx);  /** 变量 nx 的值为 9。强制类型转换通过截断小数部分将浮点值转换为整型。 */

          /**   想对浮点数进行舍人运算， 以便得到最接近的整数 仍然需要使用强制类型转换（ int)。其原因
            是 round 方法返回的结果为 long 类型，由于存在信息丢失的可能性，所以只有使用显式的强
            制类型转换才能够将 long 类型转换成 int 类型。 */
        System.out.println((int)Math.round(xd));
        System.out.println(Math.round(9.5)); /** 将括号内的数+0.5之后，向下取值 */


        x += 3.5;
        /** 是合法的， 将把 X 设置为（int)(x + 3.5)。*/


        /** 。但用在表达式中时，
         二者就有区别了。前缀形式会先完成加 1; 而后缀形式会使用变量原来的值。*/

        int a = n++;
        int a2 = ++n;
        System.out.println("a= "+a+" a2 ="+ a2+" n="+ n);

        String str = "hello";
        System.out.println(str.substring(0,3));  /** 在 substring 中从 0 开始计数，直到 3 为止， 但不包含 3。*/

        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);


    }
}
