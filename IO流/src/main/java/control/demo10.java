package control;

import java.io.File;

/**
 * 以树形的方式遍历指定目录下所有的文件以及文件夹
 */
public class demo10 {
    /**
     * 树形遍历目录
     * @param dir   当前目录
     * @param prefix 当前行前缀（用于绘制树形连线）
     */
    public static void treeTraverse(File dir, String prefix) {
        File[] files = dir.listFiles();
        if (files == null) return;
        for (int i = 0; i < files.length; i++) {
            boolean isLast = (i == files.length - 1);
            System.out.print(prefix);
            if (isLast) {
                System.out.print("└── ");
            } else {
                System.out.print("├── ");
            }
            File f = files[i];
            if (f.isDirectory()) {
                System.out.println(f.getName() + "\\");
                // 递归子目录：最后一个子项用空格，否则用竖线
                String childPrefix = prefix + (isLast ? "    " : "│   ");
                treeTraverse(f, childPrefix);
            } else {
                System.out.println(f.getName());
            }
        }
    }

    public static void main(String[] args) {
        String path = "D:\\IOTest";
        File dir = new File(path);

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("目录不存在: " + path);
            return;
        }
        System.out.println(dir.getAbsolutePath() + "\\");
        treeTraverse(dir, "");
    }
}
