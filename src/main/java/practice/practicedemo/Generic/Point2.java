package practice.practicedemo.Generic;

/**
 * @Author Simple
 * @Create 2021/7/30 10:32
 */
public class Point2<T,U> {
    private T x;
    private T y;

    private U name;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public U getName() {
        return name;
    }

    public void setName(U name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                ", name=" + name +
                '}';
    }
}
