package demo;

public class Demo8 {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println("字符串获取函数");
        System.out.println(s.length());
        System.out.println(s.substring(0, 5));
        System.out.println("遍历charAT");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println("索引 " + i + ": " + c);
        }
        // 2. 增强for循环（需要先转数组）
        System.out.println("\n方法2：增强for循环");
        for (char c : s.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println(s.startsWith("H"));
        System.out.println(s.endsWith("!"));
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("l", 3));
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.lastIndexOf("l", 5));
        System.out.println("字符串判断函数");
        System.out.println(s.contains("Hello"));
        System.out.println(s.isEmpty());
        System.out.println("字符串比较函数");
        System.out.println(s.equals("Hello, World!"));
        System.out.println(s.compareTo("World!"));
        System.out.println(s.equalsIgnoreCase("hello, world!"));
        System.out.println("字符串替换函数");
        System.out.println(s.replace("Hello", "Hi"));
        System.out.println("字符串分割函数");
        String[] strings = s.split(",");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("字符串拼接函数");
        System.out.println(s.concat("你好"));
        System.out.println("字符串转换函数");
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.trim());
        int num = 123;
        System.out.println(s.valueOf(num));
        char[] chars = s.toCharArray();
        for (char c1 : chars) {
            System.out.print(c1);
        }
        byte[] bytes1 = s.getBytes();
        System.out.println("默认字符集编码：");
        for (byte b : bytes1) {
            System.out.print(b + " ");
        }
    }
}
