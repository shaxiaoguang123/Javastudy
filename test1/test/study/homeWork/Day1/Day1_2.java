package test.study.homeWork.Day1;

import java.util.Scanner;

public class Day1_2 {
    public static void main(String[] args) {
        float ave=0;
        Scanner c=new Scanner(System.in);
        for(int i=0;i<5;i++){
            double m= c.nextDouble();
            ave+=m;
        }
        System.out.println(ave/5);
    }
}
