package Thread.ProduceConsume;

/**
 * @Author Simple
 * @Create 2021/7/14 9:07
 */
public class Test2 {
    public static void main(String[] args) {
        ValueOP valueOP = new ValueOP();
        ProducerThread p1 = new ProducerThread(valueOP);
        ProducerThread p2 = new ProducerThread(valueOP);
        ProducerThread p3 = new ProducerThread(valueOP);

        ConsumerThread c1 = new ConsumerThread(valueOP);
        ConsumerThread c2 = new ConsumerThread(valueOP);
        ConsumerThread c3 = new ConsumerThread(valueOP);
        /**
         * 多个生产者和多个消费者交替进行
         */
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();

    }
}
