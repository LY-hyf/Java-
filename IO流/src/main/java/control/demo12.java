package control;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 复制文本文件
 * 将 D:\我的青春谁做主.txt 复制到 C:\myFile\my Prime.txt
 */
public class demo12 {
    public static void main(String[] args) {
        String sourcePath = "D:\\我的青春谁做主.txt";
        String destDir = "C:\\myFile";
        String destPath = destDir + "\\my Prime.txt";
        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("源文件不存在，正在创建并输入内容...");
            try {
                sourceFile.getParentFile().mkdirs();
                sourceFile.createNewFile();
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入文件内容（输入 '#' 结束）：");
                try (OutputStreamWriter fw = new OutputStreamWriter(
                        new FileOutputStream(sourceFile), StandardCharsets.UTF_8)) {
                    while (true) {
                        String line = sc.nextLine();
                        if ("#".equals(line)) break;
                        fw.write(line + "\n");
                    }
                }
                System.out.println("源文件创建完成: " + sourcePath);
            } catch (IOException e) {
                System.out.println("创建源文件失败: " + e.getMessage());
                return;
            }
        }
        File destDirFile = new File(destDir);
        if (!destDirFile.exists()) {
            if (destDirFile.mkdirs()) {
                System.out.println("创建目录成功: " + destDir);
            }
        }
        System.out.println("开始复制文件...");
        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            fos.flush();
            System.out.println("文件复制成功！");
            System.out.println("源文件: " + sourcePath);
            System.out.println("目标文件: " + destPath);
            System.out.println("\n目标文件内容");
            try (FileInputStream verifyFis = new FileInputStream(destPath)) {
                byte[] verifyBuffer = new byte[1024];
                int verifyLen = verifyFis.read(verifyBuffer);
                if (verifyLen != -1) {
                    System.out.println(new String(verifyBuffer, 0, verifyLen, StandardCharsets.UTF_8));
                }
            }
        } catch (IOException e) {
            System.out.println("复制文件失败: " + e.getMessage());
        }
    }
}
