package control;

import java.io.File;

/**
 * 递归列出当前工程下所有 .java 文件
 */
public class demo2 {

    /**
     * 递归遍历目录，列出所有 .java 文件
     * @param dir   当前目录
     */
    public static void listJavaFiles(File dir) {
        File[] files = dir.listFiles();
        if (files == null) return;
        for (File file : files) {
            if (file.isDirectory()) {
                String name = file.getName();
                if (name.startsWith(".") || name.equals("target")) {
                    continue;
                }
                listJavaFiles(file);
            } else if (file.getName().endsWith(".java")) {
                System.out.println(file.getAbsolutePath()
                        + " (" + file.length() + " bytes)");
            }
        }
    }

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        File projectDir = new File(projectPath);
        if (projectDir.exists() && projectDir.isDirectory()) {
            System.out.println("工程路径: " + projectDir.getAbsolutePath());
            System.out.println("所有 .java 文件");
            listJavaFiles(projectDir);
        } else {
            System.out.println("工程目录不存在！");
        }
    }
}
