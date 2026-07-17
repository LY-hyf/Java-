package dao.util;

import java.io.File;
import java.util.Comparator;

/**
 * 文件大小降序比较器。
 * <p>按文件大小从大到小排列。目录的大小固定视为 0。</p>
 */
public class SizeDescComparator implements Comparator<File> {
    @Override
    public int compare(File a, File b) {
        return Long.compare(b.length(), a.length());
    }
}
