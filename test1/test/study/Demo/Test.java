package test.study.Demo;

// 一个 public 类，类名和文件名相同
public class Test {
    // 成员变量
    private String name;
    // 构造方法
    public Test(String name) {
        this.name = name;
    }
    // 成员方法
    public void sayHello() {
        System.out.println("Hello, " + name);
    }
}

// 一个非 public 类，类名和文件名不同
class Demo {
    // 成员变量
    private int num;
    // 构造方法
    public Demo(int num) {
        this.num = num;
    }
    // 成员方法
    public void showNum() {
        System.out.println("The number is " + num);
    }
}

// 一个内部类，定义在 Test 类里面
