package test.study.thread;

/**
 * @author sha'xiao'guang
 */ //创建一个线程并且执行
public class treadDemo1 extends Thread {
    public  void run(){
        for (int i=0;i<2000;i++){
            System.out.println("++++++++++++++"+i);
        }
    }

    public static void main(String[] args) {
        treadDemo1 th=new treadDemo1();
        th.start();
        for(int i=10;i<2000;i++){
            System.out.println("---------------"+i);
        }

    }
}
