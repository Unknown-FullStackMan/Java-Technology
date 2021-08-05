package javaleix;

import java.math.BigDecimal;

/**
 * @Author Simple
 * @Create 2021/7/1 16:52
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        System.out.println(0.3 - 0.1);
        System.out.println(0.2 + 0.1);
        System.out.println(0.2 * 0.1);
        System.out.println(0.3 / 0.1);

        /**
         * BigDecimal用于精确计算
         */
        BigDecimal bigDecimal = new BigDecimal(2);
        BigDecimal bDouble = new BigDecimal(2.3);
        BigDecimal bString = new BigDecimal("2.3");
        System.out.println("bigDecimal=" + bigDecimal);
        System.out.println("bDouble=" + bDouble);
        System.out.println("bString=" + bString);


        // JDK的描述：1、参数类型为double的构造方法的结果有一定的不可预知性。有人可能认为在Java中写入newBigDecimal(0.1)所创建的BigDecimal正好等于 0.1（非标度值 1，其标度为 1），
        // 但是它实际上等于0.1000000000000000055511151231257827021181583404541015625。这是因为0.1无法准确地表示为 double（或者说对于该情况，不能表示为任何有限长度的二进制小数）。这样，传入到构造方法的值不会正好等于 0.1（虽然表面上等于该值）。
        // 2、另一方面，String 构造方法是完全可预知的：写入 newBigDecimal("0.1") 将创建一个 BigDecimal，它正好等于预期的 0.1。因此，比较而言，通常建议优先使用String构造方法。

        BigDecimal bDouble2 = BigDecimal.valueOf(2.3);
        BigDecimal bDouble3 = new BigDecimal(Double.toString(2.3));
        System.out.println("bDouble3=" + bDouble3);
        System.out.println("bDouble2=" + bDouble2);


        /**
         * BigDecimal的加减乘除
         * Biglnteger 类实现了任意精度的整数运算， BigDecimal 实现了任意精度的浮点数运算。
         * 减乘除其实最终都返回的是一个新的BigDecimal对象，因为BigInteger与BigDecimal都是不可变的（immutable）的，在进行每一步运算时，都会产生一个新的对象
         */
        BigDecimal a = new BigDecimal("4.5");
        BigDecimal b = new BigDecimal("1.3");
        System.out.println("a + b =" + a.add(b));
        System.out.println("a - b =" + a.subtract(b));
        System.out.println("a * b =" + a.multiply(b));
        System.out.println("a / b =" + a.divide(b,1,0));
        System.out.println(a);
    }
}
