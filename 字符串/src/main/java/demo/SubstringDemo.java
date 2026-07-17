package demo;

public class SubstringDemo {
    public static void main(String[] args) {
        String str = "HelloWorldJavadssdsdssds";
        String result = "";
        if (str.length() > 10) {
            result = str.substring(0, 5);
            System.out.println("原字符串: " + str);
            System.out.println("长度: " + str.length());
            System.out.println("截取前5个: " + result);
        } else {
            System.out.println("字符串长度不足10");
        }
    }
}
