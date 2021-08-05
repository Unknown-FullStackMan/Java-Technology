package javaleix;

import java.time.LocalDate;


/**
 * @Author Simple
 * @Create 2021/7/2 9:09
 */
public class DateTest {
    public static void main(String[] args) {

        /**
         * 不要使用构造器来构造 LocalDate 类的对象。实际上，应当使用静态工厂方法 (factory
         * method) 代表你调用构造器。
         */
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);

        /**
         * 可以提供年、 月和日来构造对应一个特定日期的对象：
         * LocalDate.of(1999, 12, 31)
         */
        LocalDate localDate1 = localDate.of(1999, 12,30 );
        int year = localDate1.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(year+" "+ month+" "+day);

        /**
         * 这个调用之后 newYeareEve 会有什么变化？ 它会改为 1000 天之后的日期吗？ 事实上，并没
         * 有。plusDays 方法会生成一个新的 LocalDate 对象，
         */
        LocalDate a = localDate.plusDays(100);
        System.out.println(localDate);
        System.out.println(a);



    }
}
