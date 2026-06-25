package cn.jbit.cms.util;

import java.io.*;

/**
 * 文件读写工具类
 */
public class FileIO {
    /**
     * 读取文件内容，返回字符串（默认UTF-8）
     */
    public static String readFile(String filePath) {
        return readFile(filePath, "UTF-8");
    }
    /**
     * 读取文件内容，返回字符串（指定编码）
     */
    public static String readFile(String filePath, String charset) {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(filePath), charset));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
    /**
     * 写入文件内容
     */
    public static void writeFile(String filePath, String content) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(filePath), "UTF-8"));
            bw.write(content);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
