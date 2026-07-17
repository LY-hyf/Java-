package dao.util;

import java.io.File;
import java.util.Comparator;

/**
 * 文件名称升序比较器。
 * <p>按文件或目录的名称进行字典序升序排列。</p>
 */
public class NameAscComparator implements Comparator<File> {
    @Override
    public int compare(File a, File b) {
        return a.getName().compareTo(b.getName());
    }
}
