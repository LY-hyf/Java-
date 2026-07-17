package demo;

public class StringConcatDemo {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " ";
        String str3 = "World";
        String result2 = str1.concat(str2).concat(str3);
        System.out.println("使用concat拼接: " + result2);
    }
}
