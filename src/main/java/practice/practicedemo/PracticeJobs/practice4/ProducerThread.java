package PracticeJobs.practice4;

/**
 * @Author Simple
 * @Create 2021/7/14 9:29
 */
public class ProducerThread extends Thread {
    private MyStack myStack;

    public ProducerThread(MyStack myStack) {

        this.myStack = myStack;
    }

    @Override
    public void run() {
        while (true){
            myStack.push();
        }
    }
}
