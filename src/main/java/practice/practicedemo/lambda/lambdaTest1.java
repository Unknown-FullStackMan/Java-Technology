package lambda;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * @Author Simple
 * @Create 2021/7/2 14:55
 */
public class lambdaTest1 {
    public static void main(String[] args) {
        Comparator<String> comparator = (first,second)->first.length()-second.length();

        ActionListener listener = even-> System.out.println("this time is "+new Date());
        System.out.println(listener);

        String[] planets = new String[] { "Mercury" , "Venus" , "Earth" , "Mars" , "Jupiter" , "Saturn" , "Uranus" , "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out. println("Sorted in dictionary order:") ;
        Arrays.sort(planets);
        System.out.println (Arrays.toString(planets));
        System.out . println ("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second .length()) ;
        System.out. println(Arrays.toString(planets));
        Timer t = new Timer(1000, event ->
                System.out.println ("The time is " + new Date()));
        t.start();

        JOptionPane.showMessageDialog (null , "Quit program?");
        System.exit(0);
    }
}
