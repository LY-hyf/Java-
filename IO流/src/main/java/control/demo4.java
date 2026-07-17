package control;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 将字符串写入操作系统文件 Hello.txt
 */
public class demo4 {

    public static void main(String[] args) {
        String content = "HelloWorld";
        String filePath = "D:\\Hello.txt";

        try {
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                fos.write(content.getBytes(StandardCharsets.UTF_8));
            }
            System.out.println("写入成功: " + filePath);
            try (FileInputStream fis = new FileInputStream(filePath)) {
                byte[] buffer = new byte[1024];
                int len = fis.read(buffer);
                String readContent = new String(buffer, 0, len, StandardCharsets.UTF_8);
                System.out.println("读取: " + readContent);
            }
        } catch (IOException e) {
            System.out.println("操作失败: " + e.getMessage());
        }
    }
}
