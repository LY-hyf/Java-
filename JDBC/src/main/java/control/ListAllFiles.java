package control;

import java.io.File;

public class ListAllFiles {
    /**
     * 递归列出目录下所有文件和文件夹
     * @param dir 目录
     * @param level 层级（用于缩进）
     */
    public static void listAllFiles(File dir, int level) {
        StringBuilder indent = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indent.append("  ");
        }
        File[] files = dir.listFiles();
        if (files == null) return;
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println(indent + file.getName());
                listAllFiles(file, level + 1);
            } else {
                System.out.println(indent + file.getName()
                        + " (" + file.length() + " bytes)");
            }
        }
    }

    public static void main(String[] args) {
        String path = "D:\\MiNiDVD";
        File dir = new File(path);
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("目录: " + dir.getAbsolutePath());
            listAllFiles(dir, 0);
        } else {
            System.out.println("目录不存在或不是一个目录！");
        }
    }

}