package control.test;

//import java.util.Scanner;
//
//public class Total {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        double A = 10.5;
//        System.out.println("原值 A = " + A);
//        System.out.print("请输入新的 double 值：");
//        A = input.nextDouble();
//        System.out.println("修改后 A = " + A);
//    }
//}

//import java.util.Scanner;
//
//public class Total {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入年龄：");
//        int age = input.nextInt();
//        if (age >= 18) {
//            System.out.println("已成年");
//        } else {
//            System.out.println("未成年");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Total {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入小明年龄：");
//        int xm = input.nextInt();
//        System.out.print("请输入小芳年龄：");
//        int xf = input.nextInt();
//        if (xm == xf) {
//            System.out.println("两人年龄相等");
//        } else {
//            System.out.println("两人年龄不相等");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class Total {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入一个四位数：");
//        int num = input.nextInt();
//        int thou = num / 1000;
//        int hund = num / 100 % 10;
//        int ten = num / 10 % 10;
//        int one = num % 10;
//        System.out.println("千位：" + thou + "，百位：" + hund + "，十位：" + ten + "，个位：" + one);
//    }
//}

import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("用户名：");
        String user = input.next();
        System.out.print("密码：");
        String pwd = input.next();
        if (user.equals("admin") && pwd.equals("123456")) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误");
        }
    }
}

