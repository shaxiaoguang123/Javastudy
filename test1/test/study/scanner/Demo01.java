package test.study.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       if(s.hasNextInt()){
           int i=s.nextInt();
           System.out.println(i);
       }else{
           System.out.println("not int");
           System.out.print("not int");//print不换行ptintln换行
           System.out.println("not int");

       }
      s.close();
    }
}
