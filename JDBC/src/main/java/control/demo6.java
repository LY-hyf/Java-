package control;

import java.io.File;
import java.util.Arrays;
import dao.util.FolderFirstComparator;
import dao.util.FolderLastComparator;
import dao.util.NameAscComparator;
import dao.util.NameDescComparator;
import dao.util.SizeAscComparator;
import dao.util.SizeDescComparator;

/**
 * 查看D盘中所有的文件和文件夹名称，支持多种排序方式
 * 使用 Comparator 封装类 + if 语句实现，不采用 Lambda
 */
public class demo6 {
    public static void main(String[] args) {
        String path = "D:\\";
        File dir = new File(path);
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("目录不存在: " + path);
            return;
        }
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("目录为空");
            return;
        }
        System.out.println("原始顺序");
        printFiles(files);
        System.out.println("\n名称升序");
        File[] byNameAsc = files.clone();
        Arrays.sort(byNameAsc, new NameAscComparator());
        printFiles(byNameAsc);
        System.out.println("\n名称降序");
        File[] byNameDesc = files.clone();
        Arrays.sort(byNameDesc, new NameDescComparator());
        printFiles(byNameDesc);
        System.out.println("\n文件夹在前");
        File[] folderFirst = files.clone();
        Arrays.sort(folderFirst, new FolderFirstComparator());
        printFiles(folderFirst);
        System.out.println("\n文件夹在后");
        File[] folderLast = files.clone();
        Arrays.sort(folderLast, new FolderLastComparator());
        printFiles(folderLast);
        System.out.println("\n文件大小升序");
        File[] bySizeAsc = files.clone();
        Arrays.sort(bySizeAsc, new SizeAscComparator());
        printFiles(bySizeAsc);
        System.out.println("\n文件大小降序");
        File[] bySizeDesc = files.clone();
        Arrays.sort(bySizeDesc, new SizeDescComparator());
        printFiles(bySizeDesc);
    }
    /**
     * 打印文件列表，显示名称、类型、大小
     */
    private static void printFiles(File[] files) {
        for (File f : files) {
            String type = f.isDirectory() ? "[目录]" : "[文件]";
            String size = f.isDirectory()
                    ? String.format("%-10s", "-")
                    : String.format("%,10d", f.length());
            System.out.println(type + " " + size + "  " + f.getName());
        }
    }
}
