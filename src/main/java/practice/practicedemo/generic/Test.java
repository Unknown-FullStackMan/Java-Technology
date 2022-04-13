package practice.practicedemo.generic;


/**
 * @Author Simple
 * @Create 2021/7/30 10:28
 */
public class Test {
    public static void main(String[] args) {

        // 指定类型
        Point<Integer> point = new Point<Integer>();
        point.setX(100);
        // 不需要强转
        int intX = point.getX();
        System.out.println(intX);

        Point<Double> p = new Point<>();
        p.setY((double) 100.12f);
        System.out.println(p.getY());

        // 不指定类型
        Point point1 = new Point();
        point1.setX("XXX");
        // 需要强转
        String strX = (String) point1.getX();
        System.out.println(strX);

        Point2<Integer,String > point2 = new Point2<>();
        point2.setName("Simple");
        point2.setX(11);
        System.out.println(point2.toString());
    }
}
