package control;

import java.io.File;
import java.io.IOException;

/**
 * 使用 File 类操作文件和目录属性，创建文件和文件夹，打印创建成功信息
 */
public class demo11 {
    public static void main(String[] args) {
        String basePath = "D:\\FileDemo";
        File dir = new File(basePath);
        if (dir.mkdirs()) {
            System.out.println("创建目录成功: " + dir.getAbsolutePath());
        } else {
            System.out.println("目录已存在: " + dir.getAbsolutePath());
        }
        File file = new File(basePath + "\\test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("创建文件成功: " + file.getAbsolutePath());
            } else {
                System.out.println("文件已存在: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("创建文件失败: " + e.getMessage());
        }
        System.out.println("\n文件属性");
        System.out.println("文件名: " + file.getName());
        System.out.println("绝对路径: " + file.getAbsolutePath());
        System.out.println("是否是文件: " + file.isFile());
        System.out.println("是否是目录: " + file.isDirectory());
        System.out.println("是否可读: " + file.canRead());
        System.out.println("是否可写: " + file.canWrite());
        System.out.println("是否隐藏: " + file.isHidden());
        System.out.println("文件大小: " + file.length() + " bytes");
        System.out.println("最后修改时间: " + file.lastModified());

        System.out.println("\n 目录属性");
        System.out.println("目录名: " + dir.getName());
        System.out.println("父路径: " + dir.getParent());
        System.out.println("是否是目录: " + dir.isDirectory());
        System.out.println("是否可读: " + dir.canRead());
        System.out.println("是否可写: " + dir.canWrite());

        System.out.println("\n目录内容");
        String[] list = dir.list();
        if (list != null) {
            for (String name : list) {
                File sub = new File(dir, name);
                String type = sub.isDirectory() ? "[目录]" : "[文件]";
                System.out.println("  " + type + " " + name);
            }
        }
        File newFile = new File(basePath + "\\renamed.txt");
        if (file.renameTo(newFile)) {
            System.out.println("\n重命名成功: test.txt -> renamed.txt");
        } else {
            System.out.println("\n重命名失败");
        }
        if (newFile.delete()) {
            System.out.println("删除文件成功: " + newFile.getName());
        }
        if (dir.delete()) {
            System.out.println("删除目录成功: " + dir.getName());
        } else {
            System.out.println("删除目录失败（目录可能非空）");
        }
    }
}
