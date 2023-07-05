package test.study.thread.Race;

public class Turtle implements Runnable{
    private boolean flag=true;
    private boolean gameOver=flag;
    private int runlen=0;
    Turtle(int runLen){
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
            } else if(i==runlen){
                gameOver=true;
                break;
            }else{
                System.out.println(Thread.currentThread().getName()+"->>>跑了"+i+"步");
            }
        }

    }

}
