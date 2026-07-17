package demo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("青春无悔");
        int num = 110;
        StringBuffer sb1 = sb.append("我心永恒");
        System.out.println(sb1);
        StringBuffer sb2 = sb1.append("啊");
        System.out.println(sb2);
        StringBuffer sb3 = sb2.append(num);
        System.out.println(sb3);
//        System.out.println("\nStringBuffer方法");
//        StringBuffer sbEmpty = new StringBuffer();
//        System.out.println("空 StringBuffer: [" + sbEmpty + "]");
//        // toString() 方法
//        String str = sb3.toString();
//        System.out.println("toString(): " + str);
//        // insert() 方法：在指定位置插入字符串
//        StringBuffer sbInsert = new StringBuffer("Hello World");
//        sbInsert.insert(5, " Java");
//        System.out.println("insert(5, \" Java\"): " + sbInsert);
    }
}
