package control.test;

public class Demo001 {

    public static final int DAYS_IN_YEAR = 365;
    public static final int DAYS_IN_LEAP_YEAR = 366;
    public static final int MONTHS_IN_YEAR = 12;
    public static final int DAYS_IN_FEBRUARY = 28;
    public static final int LEAP_YEAR_ADJUSTMENT = 1;

    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("---------------------boolean（布尔类型）---------------------");
        System.out.println("基本数据类型 boolean idJavaFun = "+isJavaFun);
        System.out.println("基本数据类型 boolean isFishTasty = "+isFishTasty);

        System.out.println("---------------------char（字符类型）---------------------");
        char myGrade = 'A';
        char myGrade2 = '中';
        //unicode码   A
        char unicode = '\u0041';
        //ASCII码 A
        char c2 = 65;
        System.out.println("基本数据类型 char myGrade = "+myGrade);
        System.out.println("基本数据类型 char myGrade2 = "+myGrade2);
        System.out.println("基本数据类型 char unicode = "+unicode);
        System.out.println("基本数据类型 char c2 = "+c2);

        System.out.println("---------------------byte（字节类型）---------------------");
        byte myByte = 12;
        byte myByte2 = 127;
        System.out.println("基本数据类型 byte myByte = "+myByte);
        System.out.println("基本数据类型 byte myByte2 = "+myByte2);

        System.out.println("---------------------short（短整型）---------------------");
        short myShort = 22;
        System.out.println("基本数据类型 short myShort = "+myShort);

        System.out.println("---------------------int（整型）---------------------");
        int myInt = 123;
        System.out.println("基本数据类型 int myInt = "+myInt);

        System.out.println("---------------------long（长整型）---------------------");
        long myLong = 12345678L;   //long类型后面要写上大写的L或者小写的l
        System.out.println("基本数据类型 long myLong = "+myLong);


        System.out.println("---------------------float（单精度浮点型）---------------------");
        float myFloat = 3.14F;   //用小写的f或者大写的F标识这是float类型
        System.out.println("基本数据类型 float myFloat = "+myFloat);


        System.out.println("---------------------double（双精度浮点型）---------------------");
        double myDouble = 3.14;
        System.out.println("基本数据类型 double myDouble = "+myDouble);
    }
}
