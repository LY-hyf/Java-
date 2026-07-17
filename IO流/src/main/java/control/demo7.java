package control;

import java.io.*;

/**
 * 利用高效字节输出流往 D 盘下的 d.txt 文件输出一个字节数
 */
public class demo7 {
    public static void main(String[] args) {
        String filePath = "D:\\d.txt";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            int value = 65;
            bos.write(value);
            bos.flush();
            System.out.println("写入完成，字节值: " + value + " (对应字符: " + (char) value + ")");
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
                int readValue = bis.read();
                System.out.println("进行读取，字节值: " + readValue + " (对应字符: " + (char) readValue + ")");
            }
        } catch (IOException e) {
            System.out.println("操作失败: " + e.getMessage());
        }
    }
}
