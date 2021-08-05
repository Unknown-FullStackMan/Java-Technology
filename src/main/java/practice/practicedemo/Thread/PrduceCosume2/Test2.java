package Thread.PrduceCosume2;

/**
 * @Author Simple
 * @Create 2021/7/14 9:38
 */
public class Test2 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        ProducerThread p1 = new ProducerThread(myStack);
        ProducerThread p2 = new ProducerThread(myStack);
        ConsumerThread c1 = new ConsumerThread(myStack);
        ConsumerThread c2= new ConsumerThread(myStack);


        p1.setName("生产商1号");
        p2.setName("生产商2号");
        c1.setName("消费者1号");
        c2.setName("消费者2号");


        p1.start();
        p2.start();
        c1.start();
        c2.start();


    }

}
