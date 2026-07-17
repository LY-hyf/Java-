package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) throws IOException {
        File file =new File("test.txt");
        if (file.exists()){
            System.out.println("文件已存在");
        }file.createNewFile();
        File dir = new File("testdir");
        if (file.isFile()){
            System.out.println("文件已存在");
        }file.mkdir();

        FileOutputStream fos = new FileOutputStream("test.txt");
        Scanner input = new Scanner(System.in);
        System.out.println("输入你要增加的内容：");
        String str = input.nextLine();
        fos.write(str.getBytes());
        fos.close();

        FileInputStream fis = new FileInputStream("text.txt");
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = fis.read(buffer)) != -1){
            System.out.println(new String(buffer,0,len));
        }
    }
}
