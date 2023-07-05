package test.study.homeWork.Day1;

import java.util.Scanner;

public class Day1_1 {
    public static void main(String[] args) {
        float c;
        Scanner s=new Scanner(System.in);
        System.out.println("请输入成绩 :");
        c=s.nextFloat();
        if(c==100){
            System.out.println("奖励为Mate40Pro");
        }else if(c>80&&c<=90){
            System.out.println("奖励为Ipad");
        }
        else if(c>=60&&c<=80){
            System.out.println("奖励为swith");
        }
        else{
            System.out.println("没有奖励");
        }
    }
}
