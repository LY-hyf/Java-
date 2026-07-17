package demo;

public class ReplaceDemo {
    public static void main(String[] args) {
        String str = "Java is a programming language. Java is powerful.";
        String result1 = str.replace('a', '*');
        System.out.println("替换字符a: " + result1);
    }
}