package practice.practicedemo.ThreadConcurrent.DeadLock;



/**
 * @Author Simple
 * @Create 2021/7/1 9:55
 */
public class DeadLockDemo {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
            DeadLock();
    }

    public static void DeadLock(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    synchronized (A){
                        try {
                            Thread.currentThread().sleep(2000);
                        }catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        synchronized (B){
                            System.out.println("LOCK B");
                        }
                    }
            }
        });

        Thread thread2 =new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B){
                    synchronized (A) {
                        System.out.println("LOCK A");
                    }
                }

            }
        });

        thread1.start();
        thread2.start();
    }
}
