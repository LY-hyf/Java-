package demo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // 1. append()追加内容
        sb.append(" ");
        sb.append("World");
        sb.append("!");
        System.out.println("append后: " + sb);
        sb.append(" Java").append(" is").append(" great");
        System.out.println("链式追加: " + sb);
        // 2. insert()在指定位置插入
        sb.insert(6, "Beautiful ");
        System.out.println("insert后: " + sb);
        // 3. delete()删除指定范围的字符
        sb.delete(6, 16);
        System.out.println("delete后: " + sb);
        // 4. deleteCharAt()删除指定位置的字符
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt后: " + sb);
        // 5. replace()替换指定范围的字符
        sb.replace(0, 5, "Hi");
        System.out.println("replace后: " + sb);
        // 6. reverse()反转字符串
        sb.reverse();
        System.out.println("reverse后: " + sb);  // taerg si avaJ !dlroW iH
        sb.reverse();
        // 7. toString()转换为String
        String result = sb.toString();
        System.out.println("toString: " + result);
        // 8. length()获取长度
        System.out.println("长度: " + sb.length());  // 24
        // 9. charAt()获取指定位置字符
        System.out.println("索引3的字符: " + sb.charAt(3));  // ' '
        // 10. setCharAt()修改指定位置字符
        sb.setCharAt(0, 'h');
        System.out.println("setCharAt后: " + sb);  // hi World! Java is great
        // 11. substring()截取子串
        String sub = sb.substring(3, 8);
        System.out.println("substring(3,8): " + sub);  // "World"
        // 12. indexOf()查找子串位置
        int index = sb.indexOf("Java");
        System.out.println("'Java'的位置: " + index);  // 11
        // 13. lastIndexOf()从后查找
        int lastIndex = sb.lastIndexOf("a");
        System.out.println("最后一个'a'的位置: " + lastIndex);  // 14
        // 14. capacity()获取容量
        System.out.println("当前容量: " + sb.capacity());  // 默认16+字符串长度
        // 15. setLength()设置长度
        sb.setLength(10);
        System.out.println("setLength(10): " + sb);  // 只保留前10个字符
    }
}
