package test.study.homeWork.Day1;

import java.util.Scanner;

public class Day1_3 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("请输入一个数字:");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int j=n-i;
            System.out.printf("%d+%d=%d\n",i,j,n);
        }
    }
}
