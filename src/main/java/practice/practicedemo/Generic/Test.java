package practice.practicedemo.Generic;


import java.util.Map;

/**
 * @Author Simple
 * @Create 2021/7/30 10:28
 */
public class Test {
    public static void main(String[] args) {
        Point<Integer> point = new Point<Integer>();
        point.setX(100);
        System.out.println(point.getX());

        Point<Double> p = new Point<>();
        p.setY((double) 100.12f);
        System.out.println(p.getY());


        Point2<Integer,String > point2 = new Point2<>();
        point2.setName("Simple");
        point2.setX(11);
        System.out.println(point2.toString());
    }
}
