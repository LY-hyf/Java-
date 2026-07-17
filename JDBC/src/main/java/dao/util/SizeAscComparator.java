package dao.util;

import java.io.File;
import java.util.Comparator;

/**
 * 文件大小升序比较器。
 * <p>按文件大小从小到大排列。目录的大小固定视为 0。</p>
 */
public class SizeAscComparator implements Comparator<File> {
    @Override
    public int compare(File a, File b) {
        return Long.compare(a.length(), b.length());
    }
}
