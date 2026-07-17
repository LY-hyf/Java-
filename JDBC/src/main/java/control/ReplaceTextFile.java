package control;

import java.io.*;

/**
 * 替换文本文件内容
 * 读取模板文件，替换{name}、{type}、{master}占位符，写入新文件
 */
public class ReplaceTextFile {
    public static void main(String[] args) {
        String sourceFile = "template.txt";  // 模板文件
        String destFile = "output.txt";      // 输出文件
        String name = "欧欧";
        String type = "狗狗";
        String master = "函数";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(sourceFile));
            writer = new BufferedWriter(new FileWriter(destFile));
            StringBuffer sbf = new StringBuffer();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sbf.append(line);
                sbf.append(System.lineSeparator());
            }
            String newString = sbf.toString();
            newString = newString.replace("{name}", name);
            newString = newString.replace("{type}", type);
            newString = newString.replace("{master}", master);
            System.out.println("替换前：" + sbf.toString().trim());
            System.out.println("替换后：" + newString.trim());
            writer.write(newString);
            writer.flush();
            System.out.println("文件替换成功！已保存到：" + destFile);
        } catch (FileNotFoundException e) {
            System.out.println("文件未找到：" + e.getMessage());
        } catch (IOException e) {
            System.out.println("读写文件时发生错误：" + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("关闭流时发生错误：" + e.getMessage());
            }
        }
    }
}
