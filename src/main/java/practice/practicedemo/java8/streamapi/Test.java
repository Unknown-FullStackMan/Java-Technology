package practice.practicedemo.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Author Simple
 * @Create 2021/7/30 15:27
 */
public class Test {
    static List<Student> computerClub = Arrays.asList(
            new Student("2015134001", "小明", 15, "1501"),
            new Student("2015134003", "小王", 14, "1503"),
            new Student("2015134006", "小张", 15, "1501"),
            new Student("2015134008", "小梁", 17, "1505")
    );
    //篮球俱乐部
    static List<Student> basketballClub = Arrays.asList(
            new Student("2015134012", "小c", 13, "1503"),
            new Student("2015134013", "小s", 14, "1503"),
            new Student("2015134015", "小d", 15, "1504"),
            new Student("2015134018", "小y", 16, "1505")
    );
    //乒乓球俱乐部
    static List<Student> pingpongClub = Arrays.asList(
            new Student("2015134022", "小u", 16, "1502"),
            new Student("2015134021", "小i", 14, "1502"),
            new Student("2015134026", "小m", 17, "1504"),
            new Student("2015134027", "小n", 16, "1504")
    );
    static List<List<Student>> allClubStu = new ArrayList<>();

    public static void main(String[] args) {
        allClubStu.add(pingpongClub);
        allClubStu.add(basketballClub);
        allClubStu.add(computerClub);

    }
}
