package test.study.thread;


//创建线程的第二种方法  先实现Runnanble的接口 然后重写run函数  创建thread的线程，然后吧类作为参数传输进去，最后thread调用start的方法
public class threadDemo2 implements Runnable{



    @Override
    public void run() {
        for (int i=0;i<2000;i++){
            System.out.println("++++++++++++++"+i);
        }
    }
    public static void main(String[] args) {
        threadDemo2 th=new threadDemo2();


        new Thread(th,"ada").start();
        for(int i=10;i<2000;i++){
            System.out.println("---------------"+i);
        }

    }
}

