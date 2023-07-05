package test.study.thread;
//多线程抢票
public class testDemo3 implements Runnable{
    private int ticket=20;
    public void run(){
        while(ticket>0){
            System.out.println(Thread.currentThread().getName()+"--->抢到了第"+ticket--+"票");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        testDemo3 ticket=new testDemo3();

        new Thread(ticket,"马老六").start();
        new Thread(ticket,"勾八").start();
        new Thread(ticket,"马宇雷").start();
    }
}
