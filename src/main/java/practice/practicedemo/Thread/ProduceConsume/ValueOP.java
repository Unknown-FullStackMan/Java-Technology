package Thread.ProduceConsume;

/**
 * @Author Simple
 * 定义一个操作数据的类
 * @Create 2021/7/14 8:51
 */
public class ValueOP {

    private String value = "";
    public void setValue() {
        // 如果value不为空
        // 同步代码中
        synchronized (this){
            while(!value.equalsIgnoreCase("")){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 设置value的值
            String value = System.currentTimeMillis()+"_"+System.nanoTime();
            System.out.println("set的Value: "+value);
            this.value = value;
            this.notifyAll();
        }
    }

    public void getValue(){
        synchronized (this){
            while (value.equalsIgnoreCase("")){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 不是空串，读取 字段值
            System.out.println("get的Value: "+value);
            this.value = "";
            this.notifyAll();
        }
    }
}
