package lambda;

import javax.swing.*;

/**
 * @Author Simple
 * @Create 2021/7/2 15:16
 */
public class TimedGreeter extends lambda.Greeter {

    public void greet(){
    Timer t = new Timer(1000, super::greet);
    t.start();
    }
}
