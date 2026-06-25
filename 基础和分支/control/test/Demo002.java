package control.test;

public class Demo002 {
    public static void main(String[] args) {

        System.out.println("-----------隐式的自动类型转换(byte、short、int) start -----------");
        byte a = 12;
        short s = a;//隐式的自动类型转换；
        int i = s;
        System.out.println("a:" + a);
        System.out.println("s:" + s);
        System.out.println("i:" + i);
        System.out.println("-----------隐式的自动类型转换(byte、short、int) shop -----------");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *   分割线    * * * * * * * * * * * * * * * * * * * * * * *");

        System.out.println("-----------强制类型转换（int、byte）start  -----------");
        //强制类型转换：会有数据溢出
        int i2 = 12;
        byte b2 = (byte) i2; //强制类型转换：会有数据溢出
        System.out.println("b2:" + b2);
        int i3 = 1290;  //强制类型转换：会有数据溢出
        byte b3 = (byte) i3;
        System.out.println("b3:" + b3);
        System.out.println("-----------强制类型转换（int、byte）shop  -----------");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *   分割线    * * * * * * * * * * * * * * * * * * * * * * *");

        System.out.println("-----------强制类型转换（double、int）start  -----------");
        //强转 后，数据溢出，会从溢出位置开始
        double d1 = 6.7f;
        System.out.println("d1:" + d1);
        int i4 = (int) d1;
        System.out.println("i4:" + i4);
        System.out.println("-----------强制类型转换（double、int）shop  -----------");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *   分割线    * * * * * * * * * * * * * * * * * * * * * * *");

        System.out.println("-----------自动类型转换(char、int) start -----------");
        char ch = 'A';   //ASCII码表 2的ASCII码是50
        //char---->int
        int i5 = ch;
        System.out.println("i5:" + i5);
        System.out.println("-----------自动类型转换(char、int) shop -----------");

        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * *   分割线    * * * * * * * * * * * * * * * * * * * * * * *");

        System.out.println("-----------自动类型转换(int、long) start -----------");
        long l1 = 100L;
        long l2 = 100;//int---->long自动类型转换
        System.out.println("l1:" + l1);
        System.out.println("l2:" + l2);
        System.out.println("-----------自动类型转换(int、long) shop -----------");
    }
}
