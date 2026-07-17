package dao.util;

import java.io.File;
import java.util.Comparator;

/**
 * 文件名称降序比较器。
 * <p>按文件或目录的名称进行字典序降序排列。</p>
 */
public class NameDescComparator implements Comparator<File> {
    @Override
    public int compare(File a, File b) {
        return b.getName().compareTo(a.getName());
    }
}
