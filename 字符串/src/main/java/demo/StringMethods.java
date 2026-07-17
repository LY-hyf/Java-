package demo;

/**
 * String 类常用方法的含义及使用（代码体现）
 */
public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";
        System.out.println("原始字符串: \"" + str + "\"");
        // 1. length() —— 获取字符串长度
        System.out.println("\n1. length() —— 获取字符串长度");
        System.out.println("  字符串长度: " + str.length());
        // 2. trim() —— 去除字符串首尾空格
        System.out.println("\n2. trim() —— 去除字符串首尾空格");
        String trimmed = str.trim();
        System.out.println("  trim()后: \"" + trimmed + "\"");
        // 3. charAt(int index) —— 获取指定索引位置的字符
        System.out.println("\n3. charAt(int index) —— 获取指定索引位置的字符");
        System.out.println("  索引0: " + str.charAt(0) + ", 索引3: " + str.charAt(3));
        // 4. toUpperCase() / toLowerCase() —— 大小写转换
        System.out.println("\n4. toUpperCase() / toLowerCase() —— 大小写转换");
        System.out.println("  转大写: " + str.toUpperCase());
        System.out.println("  转小写: " + str.toLowerCase());
        // 5. equals(Object obj) —— 比较字符串内容是否相等（区分大小写）
        System.out.println("\n5. equals(Object obj) —— 比较字符串内容是否相等");
        System.out.println("  equals(\"hello java world\"): " + str.equals("hello java world"));
        // 6. equalsIgnoreCase(String str) —— 比较字符串内容是否相等（忽略大小写）
        System.out.println("\n6. equalsIgnoreCase(String str) —— 忽略大小写比较");
        System.out.println("  equalsIgnoreCase(\"  hello java world  \"): " + str.equalsIgnoreCase("  hello java world  "));
        // 7. indexOf(String/char) —— 返回第一次出现的索引位置
        System.out.println("\n7. indexOf(String/char) —— 返回第一次出现的索引位置");
        System.out.println("  indexOf('a'): " + str.indexOf('a'));
        System.out.println("  indexOf(\"Java\"): " + str.indexOf("Java"));
        System.out.println("  indexOf('a', 10): " + str.indexOf('a', 10));
        // 8. lastIndexOf(String/char) —— 返回最后一次出现的索引位置
        System.out.println("\n8. lastIndexOf(String/char) —— 返回最后一次出现的索引位置");
        System.out.println("  lastIndexOf('a'): " + str.lastIndexOf('a'));
        // 9. substring(int beginIndex) —— 从指定位置截取到末尾
        System.out.println("\n9. substring(int beginIndex) —— 从指定位置截取到末尾");
        System.out.println("  substring(7): \"" + str.substring(7) + "\"");
        // 10. substring(int begin, int end) —— 截取 [begin, end) 范围的子串
        System.out.println("\n10. substring(int begin, int end) —— 截取指定范围");
        System.out.println("  substring(2, 7): \"" + str.substring(2, 7) + "\"");
        // 11. replace(char old, char new) —— 替换所有指定字符
        System.out.println("\n11. replace(char old, char new) —— 替换所有指定字符");
        System.out.println("  replace('a', '*'): " + str.replace('a', '*'));
        // 12. replace(CharSequence target, CharSequence replacement) —— 替换字符串
        System.out.println("\n12. replace(CharSequence target, CharSequence replacement) —— 替换字符串");
        System.out.println("  replace(\"Java\", \"Python\"): " + str.replace("Java", "Python"));
        // 13. split(String regex) —— 按指定分隔符拆分为字符串数组
        System.out.println("\n13. split(String regex) —— 按指定分隔符拆分");
        String[] parts = trimmed.split(" ");
        System.out.println("  按空格拆分结果:");
        for (int i = 0; i < parts.length; i++) {
            System.out.println("    第" + (i + 1) + "个: \"" + parts[i] + "\"");
        }
        // 14. concat(String str) —— 拼接字符串
        System.out.println("\n14. concat(String str) —— 拼接字符串");
        System.out.println("  \"Hello\".concat(\" World\"): " + "Hello".concat(" World"));
        // 15. contains(CharSequence s) —— 判断是否包含指定内容
        System.out.println("\n15. contains(CharSequence s) —— 判断是否包含指定内容");
        System.out.println("  contains(\"Java\"): " + str.contains("Java"));
        System.out.println("  contains(\"Python\"): " + str.contains("Python"));
        // 16. startsWith(String prefix) / endsWith(String suffix) —— 判断前缀/后缀
        System.out.println("\n16. startsWith() / endsWith() —— 判断前缀/后缀");
        System.out.println("  startsWith(\"  \"): " + str.startsWith("  "));
        System.out.println("  endsWith(\"  \"): " + str.endsWith("  "));
        // 17. isEmpty() —— 判断是否为空字符串
        System.out.println("\n17. isEmpty() —— 判断是否为空字符串");
        System.out.println("  isEmpty(): " + str.isEmpty());
        System.out.println("  \"\".isEmpty(): " + "".isEmpty());
        // 18. toCharArray() —— 将字符串转换为字符数组
        System.out.println("\n18. toCharArray() —— 转换为字符数组");
        char[] chars = trimmed.toCharArray();
        System.out.print("  字符数组: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
