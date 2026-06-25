package control.test;

public class Count {
    int count = 30; // 初始化

    public Count() {
        count = 60; // 重新赋值
        System.out.println(count);
    }

    public static void main(String[] args) {
        new Count();
    }
}