package Thread.ProduceConsume;

/**
 * @Author Simple
 * 定义生产者线程类
 * @Create 2021/7/14 8:59
 */
public class ProducerThread extends Thread{
    // 生产者生产数据就调用ValueOP类的setValue()方法 给value字段赋值
    private ValueOP valueOP;

    public ProducerThread(ValueOP valueOP){
        this.valueOP = valueOP;
    }

    @Override
    public void run() {
            while (true){
                valueOP.setValue();
            }
    }
}
