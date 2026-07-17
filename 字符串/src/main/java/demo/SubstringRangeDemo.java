package demo;

public class SubstringRangeDemo {
    public static void main(String[] args) {
        String str = "HelloWorldJava";
        System.out.println("原字符串: " + str);
        System.out.println("长度: " + str.length());
        if (str.length() >= 7) {
            String result = str.substring(2, 7);
            System.out.println("第3-7个字符: " + result);
        } else {
            System.out.println("字符串长度不足");
        }
    }
}
