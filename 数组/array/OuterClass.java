package array;

public class OuterClass {
    private int instanceVar = 10;
    private static int staticVar = 20;

    // 静态内部类
    static class InnerClass {
        public void display() {
            // ❌ 不能访问外部类的实例变量
            // System.out.println(instanceVar);

            // ✅ 只能访问外部类的静态成员
            System.out.println("外部类的静态变量：" + staticVar);
        }

        public static void staticMethod() {
            System.out.println("静态内部类的静态方法");
        }
    }

    public static void main(String[] args) {
        // 创建静态内部类对象（不需要外部类对象）
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        inner.display();

        // 调用静态内部类的静态方法
        OuterClass.InnerClass.staticMethod();
    }
}
