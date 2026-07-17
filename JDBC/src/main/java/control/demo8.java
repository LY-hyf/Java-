package control;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * 利用高效字节输出流往 D 盘下的 e.txt 文件写出一个字节数组数据
 */
public class demo8 {
    public static void main(String[] args) {
        String filePath = "D:\\e.txt";
        String content = "i love java";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
            byte[] data = content.getBytes(StandardCharsets.UTF_8);
            bos.write(data);
            bos.flush();
            System.out.println("写出字符串: \"" + content + "\"");
            System.out.println("字节数组长度: " + data.length + " bytes");
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
                byte[] buffer = new byte[1024];
                int len = bis.read(buffer);
                String readContent = new String(buffer, 0, len, StandardCharsets.UTF_8);
                System.out.println("读取: \"" + readContent + "\"");
            }
        } catch (IOException e) {
            System.out.println("操作失败: " + e.getMessage());
        }
    }
}
