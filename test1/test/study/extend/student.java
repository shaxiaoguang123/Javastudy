package test.study.extend;

public class student extends person{
    student(){
        System.out.println("student");
    }
    void say(){
        System.out.println("studentSay");
    }

    public static void main(String[] args) {
        student s=new student();
        s.say();
    }
}
