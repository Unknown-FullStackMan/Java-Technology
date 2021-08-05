package Thread.ProduceConsume;

/**
 * @Author Simple
 * @Create 2021/7/14 9:02
 */
public class ConsumerThread extends Thread {

    // 消费者消费数据就调用ValueOP类的getValue()方法 获取value字段值
    private ValueOP valueOP;

    public ConsumerThread(ValueOP valueOP){
        this.valueOP = valueOP;
    }

    @Override
    public void run() {
        while (true){
            valueOP.getValue();
        }
    }
}
