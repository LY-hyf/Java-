package dao.util;

import java.io.File;
import java.util.Comparator;

/**
 * 文件夹优先比较器。
 * <p>排序规则：</p>
 * <ol>
 *   <li>文件夹始终排在文件前面</li>
 *   <li>同类型（都是文件夹或都是文件）时按名称字典序升序</li>
 * </ol>
 */
public class FolderFirstComparator implements Comparator<File> {
    @Override
    public int compare(File a, File b) {
        if (a.isDirectory() && !b.isDirectory()) {
            return -1;
        }
        if (!a.isDirectory() && b.isDirectory()) {
            return 1;
        }
        return a.getName().compareTo(b.getName());
    }
}
