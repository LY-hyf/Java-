package exception;

import java.io.*;

public class ThrowsDemo {

    // 声明可能抛出 IOException 和 ClassNotFoundException
    public void readFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(path);  // 可能抛 IOException
        Class.forName("com.example.Demo");               // 可能抛 ClassNotFoundException
        System.out.println("文件读取成功");
    }

    // 调用者必须处理或继续声明
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        // 方式1：try-catch 处理
        try {
            demo.readFile("test.txt");
        } catch (IOException e) {
            System.out.println("IO异常：" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("类未找到：" + e.getMessage());
        }
    }
}