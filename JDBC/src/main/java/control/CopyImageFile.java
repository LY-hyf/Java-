package control;

import java.io.*;

/**
 * 复制图片文件
 * 将C:\top.bmp复制到D:\myDoc\myPicture.bmp
 */
public class CopyImageFile {
    public static void main(String[] args) {
        String sourcePath = "D:\\top.bmp";
        String destPath = "D:\\myDoc\\myPicture.bmp";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File destDir = new File("D:\\myDoc");
            if (!destDir.exists()) {
                destDir.mkdirs();
            }
            fis = new FileInputStream(sourcePath);
            fos = new FileOutputStream(destPath);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            fos.flush();
            System.out.println("图片复制成功！");
            System.out.println("源文件：" + sourcePath);
            System.out.println("目标文件：" + destPath);

        } catch (FileNotFoundException e) {
            System.out.println("文件未找到：" + e.getMessage());
        } catch (IOException e) {
            System.out.println("复制文件时发生错误：" + e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("关闭流时发生错误：" + e.getMessage());
            }
        }
    }
}
