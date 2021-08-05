package Thread.ProduceConsume;

/**
 * @Author Simple
 * @Create 2021/7/14 9:03
 */
public class Test {
    public static void main(String[] args) {
        ValueOP valueOP = new ValueOP();
        ProducerThread producerThread = new ProducerThread(valueOP);
        ConsumerThread consumerThread = new ConsumerThread(valueOP);
        /**
         * 一个生产者和一个消费者交替进行
         */
        producerThread.start();
        consumerThread.start();

    }
}
