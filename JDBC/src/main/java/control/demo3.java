package control;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 从磁盘读取文件到内存中，再打印到控制台
 */
public class demo3 {

    /**
     * 读取指定文件内容到字符串并打印
     * @param filePath 文件路径
     * @throws IOException 文件读取失败时抛出
     */
    public static void readAndPrint(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        File file = path.toFile();
        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在: " + filePath);
            return;
        }
        byte[] allBytes = Files.readAllBytes(path);
        String content = new String(allBytes);
        System.out.println("文件路径: " + file.getAbsolutePath());
        System.out.println("文件大小: " + file.length() + " bytes");
        System.out.println("文件内容");
        System.out.print(content);
        System.out.println("\n读取完毕");
    }

    public static void main(String[] args) {
        String filePath = "D:\\byte.txt";
        try {
            readAndPrint(filePath);
        } catch (IOException e) {
            System.out.println("读取失败: " + e.getMessage());
        }
    }
}
