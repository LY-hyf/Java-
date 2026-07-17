package control;

import java.io.*;

/**
 * 拷贝图片文件从一个目录到另一个目录
 */
public class demo5 {
    public static void main(String[] args) {
        String sourcePath = "D:\\method.png";
        String destPath = "D:\\dest.png";
        File source = new File(sourcePath);
        if (!source.exists() || !source.isFile()) {
            System.out.println("源文件不存在: " + sourcePath);
            return;
        }
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(source));
            bos = new BufferedOutputStream(new FileOutputStream(destPath));
            byte[] buffer = new byte[8192];
            int len;
            long total = 0;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
                total += len;
            }
            bos.flush();
            File dest = new File(destPath);
            long sourceSize = source.length();
            long destSize = dest.length();
            System.out.println("源文件: " + source.getAbsolutePath() + " (" + sourceSize + " bytes)");
            System.out.println("目标文件: " + dest.getAbsolutePath() + " (" + destSize + " bytes)");
            System.out.println("拷贝字节数: " + total + " bytes");
            if (sourceSize == destSize) {
                System.out.println("图片拷贝成功！");
            } else {
                System.out.println("图片拷贝失败：文件大小不一致");
            }
        } catch (IOException e) {
            System.out.println("拷贝失败: " + e.getMessage());
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    System.out.println("关闭输入流失败: " + e.getMessage());
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    System.out.println("关闭输出流失败: " + e.getMessage());
                }
            }
        }
    }
}
