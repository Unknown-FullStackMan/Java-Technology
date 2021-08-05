package PracticeJobs.practice4;

/**
 * @Author Simple
 * @Create 2021/7/14 9:30
 */
public class ConsumerThread extends Thread {
    private MyStack myStack;

    public ConsumerThread(MyStack myStack) {
        this.myStack = myStack;
    }

    @Override
    public void run() {
        while (true){
            myStack.pop();
        }
    }
}
