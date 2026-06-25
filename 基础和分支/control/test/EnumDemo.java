package control.test;

// 枚举定义
enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

public class EnumDemo {
    public static void main(String[] args) {
        Season s = Season.SUMMER;

        // if-else
        if (s == Season.SPRING) System.out.println("春");
        else if (s == Season.SUMMER) System.out.println("夏");

        // switch (Java 8 兼容写法)
        switch (s) {
            case SPRING:
                System.out.println("春");
                break;
            case SUMMER:
                System.out.println("夏");
                break;
            default:
                System.out.println("其他");
                break;
        }
    }
}

