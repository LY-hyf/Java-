package control;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * 验证码小程序 + 文件读写
 */
public class demo9 {
    private static final String PROJECT_DIR = System.getProperty("user.dir");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("验证码小程序");
        System.out.println("输入验证码存入 data.txt（输入 '#' 结束）：");
        List<String> codes = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            if ("#".equals(input)) break;
            codes.add(input);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PROJECT_DIR + "\\data.txt"))) {
            for (String code : codes) {
                bw.write(code);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("写入 data.txt 失败: " + e.getMessage());
        }
        System.out.println("输入需要校验的验证码：");
        String check = sc.nextLine();
        boolean found = false;
        try (BufferedReader br = new BufferedReader(new FileReader(PROJECT_DIR + "\\data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(check)) {
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("读取 data.txt 失败: " + e.getMessage());
        }
        System.out.println(found ? "验证成功" : "验证失败");
        System.out.println("\nGBK 编码读写");
        String text05 = PROJECT_DIR + "\\text05.txt";
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(text05), "GBK")) {
            osw.write("我爱Java");
        } catch (IOException e) {
            System.out.println("写入 text05.txt 失败: " + e.getMessage());
        }
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(text05), "GBK")) {
            char[] buf = new char[1024];
            int len = isr.read(buf);
            System.out.println("text05.txt 内容: " + new String(buf, 0, len));
        } catch (IOException e) {
            System.out.println("读取 text05.txt 失败: " + e.getMessage());
        }
        System.out.println("\n打印流");
        System.out.println("输入一行字符串（将保存到 d.txt）：");
        sc.nextLine(); // 消费换行
        String lineToPrint = sc.nextLine();
        try (PrintStream ps = new PrintStream(PROJECT_DIR + "\\d.txt")) {
            ps.println(lineToPrint);
        } catch (IOException e) {
            System.out.println("写入 d.txt 失败: " + e.getMessage());
        }
        System.out.println("已保存到 d.txt");
        System.out.println("\n反转内容");
        String textTxt = PROJECT_DIR + "\\text.txt";
        String text1Txt = PROJECT_DIR + "\\text1.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(textTxt))) {
            bw.write("123456");
            bw.newLine();
            bw.write("我爱java");
        } catch (IOException e) {
            System.out.println("创建 text.txt 失败: " + e.getMessage());
        }
        try {
            List<String> allLines = Files.readAllLines(Paths.get(textTxt));
            Collections.reverse(allLines);
            Files.write(Paths.get(text1Txt), allLines);
            System.out.println("反转写入完成，text1.txt 内容：");
            Files.readAllLines(Paths.get(text1Txt)).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("反转操作失败: " + e.getMessage());
        }
        System.out.println("\n学生对象存储");
        List<Student> students = Arrays.asList(
                new Student("张三", 20, "男"),
                new Student("李四", 22, "女"),
                new Student("王五", 21, "男")
        );
        String stusFile = PROJECT_DIR + "\\stus.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(stusFile))) {
            for (Student s : students) {
                bw.write(s.getName() + "," + s.getAge() + "," + s.getGender());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("写入 stus.txt 失败: " + e.getMessage());
        }
        System.out.println("学生信息已保存到 stus.txt");
        try {
            Files.readAllLines(Paths.get(stusFile)).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("读取 stus.txt 失败: " + e.getMessage());
        }
        System.out.println("\n效率对比");
        String src = PROJECT_DIR + "\\compare_src.dat";
        String dst1 = PROJECT_DIR + "\\compare_dst1.dat";
        String dst2 = PROJECT_DIR + "\\compare_dst2.dat";
        try (FileOutputStream fos = new FileOutputStream(src)) {
            byte[] chunk = new byte[1024 * 1024]; // 1MB
            Arrays.fill(chunk, (byte) 65);
            for (int i = 0; i < 10; i++) {
                fos.write(chunk);
            }
        } catch (IOException e) {
            System.out.println("创建测试文件失败: " + e.getMessage());
        }
        long t1 = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dst1)) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = fis.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
        } catch (IOException e) {
            System.out.println("普通流拷贝失败: " + e.getMessage());
        }
        long t2 = System.currentTimeMillis();
        System.out.println("普通字节流 (FileInputStream/FileOutputStream): " + (t2 - t1) + "ms");

        long t3 = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dst2))) {
            byte[] buf = new byte[1024];
            int len;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf, 0, len);
            }
        } catch (IOException e) {
            System.out.println("缓冲流拷贝失败: " + e.getMessage());
        }
        long t4 = System.currentTimeMillis();
        System.out.println("缓冲字节流 (BufferedInputStream/BufferedOutputStream): " + (t4 - t3) + "ms");

        sc.close();
    }
    static class Student {
        private String name;
        private int age;
        private String gender;

        public Student(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }
        public String getGender() { return gender; }
        public void setGender(String gender) { this.gender = gender; }
    }
}
