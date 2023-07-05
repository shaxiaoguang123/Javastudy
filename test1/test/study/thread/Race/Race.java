package test.study.thread.Race;

public class Race {
    public static void main(String[] args) {
        int step=100;
        Thread thread=new Thread();
        Rabbit rabbit=new Rabbit(step);
        Turtle turtle=new Turtle(step);
        new Thread(rabbit,"兔子").start();
        new Thread(turtle,"乌龟").start();
        while(true){
            if(rabbit.GameOver()&&turtle.GameOver()){
                System.out.println("游戏结束");
                break;
            } else if (rabbit.GameOver()&&!turtle.GameOver()) {
                turtle.setFlag();
                System.out.println("兔子赢了");


                break;
            } else if (!rabbit.GameOver()&&turtle.GameOver()) {
                rabbit.setFlag();
                System.out.println("乌龟赢了");

                break;
            }else{
                continue;
            }
        }
    }
}
