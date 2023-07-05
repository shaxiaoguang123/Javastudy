package test.study.io;

import java.util.Scanner;

public class io {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);//需要先建一个类Scanner
        int a=s.nextInt();
        System.out.println(a);
        String b=s.next();
        System.out.println(b);
        s.nextLine();//清空缓冲区
        double c=s.nextDouble();
        System.out.println(c);
        s.close();
    }
}
