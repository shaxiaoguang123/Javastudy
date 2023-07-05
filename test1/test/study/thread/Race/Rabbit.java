package test.study.thread.Race;

public class Rabbit implements Runnable{
    private boolean flag=true;
    private boolean gameOver=false;
    private int runlen=0;
    Rabbit(int runLen){
        runlen=runLen;
    }
    void setFlag(){
        flag=false;
    }
    boolean GameOver(){
        return gameOver;
    }

    @Override
    public void run() {
        for (int i = 0; i <=runlen; i++) {
            if(flag==false){
                break;
            } else if (i==runlen) {
              gameOver=true;
            } else if(i%10==0) {
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            else{
                System.out.println(Thread.currentThread().getName()+"->>>跑了"+i+"步");
            }
        }

    }

}