package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
    private static void readFile(String path){
        try {
            FileInputStream fis = new FileInputStream(path);  // 可能抛 IOException
            Class.forName("com.example.Demo");               // 可能抛 ClassNotFoundException
            System.out.println("文件读取成功");
        }
        catch (IOException e1){
            System.out.println("IO异常" + e1.getMessage());
        }
        catch (ClassNotFoundException e2){
            System.out.println("类未找到" + e2.getMessage());
        }
        finally {
            System.out.println("执行到finally块");
        }
    }

    public static void test (){
        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException e1) {
            System.out.println("空指针异常" + e1.getMessage());
        }
        finally{
            System.out.println("执行到finally块");
        }
    }

    public static void main(String[] args){
        test();
        readFile("test.txt");
    }
}
