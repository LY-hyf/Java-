package control;

import dao.pojo.Student;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * IO流操作演示类，展示了Java中各种常用IO流的使用方式。
 * 包括字节流、字符流、缓冲流、转换流、打印流和对象流。
 *
 * @author hyf
 * @version 1.0
 * @since 2026-06-10
 */
public class StreamDemo {
    /**
     * 字节流演示：使用 FileOutputStream 写入文件，使用 FileInputStream 读取文件内容。
     * 演示了字节流对二进制数据的读写操作。
     * @throws IOException 如果文件读写过程中发生I/O错误
     */
    public static void byteStreamDemo() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\byte.txt");
            fos.write("Hello World".getBytes(StandardCharsets.UTF_8));
            FileInputStream fis = new FileInputStream("D:\\byte.txt");
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }
        }
        catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }

    /**
     * 字符流演示：使用 FileWriter 写入文本文件，使用 FileReader 读取文本文件内容。
     * 字符流适用于处理文本数据，自动处理字符编码。
     */
    public static void charStreamDemo() throws IOException {
        try  {
            FileWriter fw = new FileWriter("D:\\char.txt");
            fw.write("sfsfs");
            fw.flush();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try  {
            FileReader fr = new FileReader("D:\\char.txt");
            char[] buffer = new char[1024];
            int len;
            while ((len = fr.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * 缓冲流演示：使用 BufferedInputStream/BufferedOutputStream 复制图片文件，
     * 使用 BufferedReader/BufferedWriter 逐行读写文本文件。
     * 缓冲流通过内部缓冲区提高了读写效率。
     */
    public static void bufferedStreamDemo() throws IOException {
        // 图片文件拷贝
        try (
             FileInputStream fis = new FileInputStream("D:\\method.png");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(
                     new FileOutputStream("D:\\dest.png"))) {
            byte[] buffer = new byte[8192];
            int len, total = 0;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
                total += len;
            }
            bos.flush();
           //比较源文件和目标文件大小是否一致
           File srcFile = new File("D:\\method.png");
           File destFile = new File("D:\\dest.png");
           if (destFile.exists() && srcFile.length() == destFile.length()) {
              System.out.println("图片拷贝成功，共 " + total + " 字节");
           } else {
              System.out.println("图片拷贝失败：文件大小不一致");
            }
        }
        //文本文件逐行拷贝
        try {
            FileReader fr = new FileReader("D:\\input.txt");
            BufferedReader br = new BufferedReader(fr);
             BufferedWriter bw = new BufferedWriter(
                     new FileWriter("D:\\output.txt"));
            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                lineCount++;
            }
            bw.flush();
            if (lineCount > 0) {
                System.out.println("文本拷贝成功，共 " + lineCount + " 行");
            } else {
                System.out.println("文本拷贝成功，源文件为空");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * 转换流演示：使用 OutputStreamWriter/InputStreamReader 指定字符编码（GBK）
     * 进行文本文件的读写操作。转换流是字节流到字符流的桥梁。
     */
    public static void conversionStreamDemo() throws IOException {
        try (OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("D:\\gbk.txt"), "GBK")) {
            osw.write("你好世界");
        }
        try (InputStreamReader isr = new InputStreamReader(
                new FileInputStream("D:\\gbk.txt"), "GBK")) {
            char[] buffer = new char[1024];
            int len;
            while ((len = isr.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("字节流演示");
        byteStreamDemo();
        System.out.println("字符流演示");
        charStreamDemo();
        try {
            System.out.println("转换流演示");
            conversionStreamDemo();
        } catch (IOException e) {
            System.err.println("转换流演示失败: " + e.getMessage());
        }
    }
}
