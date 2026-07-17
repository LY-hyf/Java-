package demo;
import java.util.Scanner;

/**
 * 作业提交系统：验证Java文件名和邮箱格式
 */
public class Demo6 {
    /**
     * 验证文件名是否以.java结尾
     */
    public static boolean isValidJavaFile(String filename) {
        return filename.endsWith(".java");
    }

    /**
     * 验证邮箱格式：包含@和.，且@在.之前
     */
    public static boolean isValidEmail(String email) {
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");
        if (atIndex == -1 || dotIndex == -1) {
            return false;
        }
        return atIndex < dotIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---欢迎进入作业提交系统---");
        System.out.print("请输入Java文件名：");
        String filename = input.nextLine();
        System.out.print("请输入你的邮箱：");
        String email = input.nextLine();
        if (!isValidJavaFile(filename)) {
            System.out.println("文件名无效。");
            System.out.println("作业提交失败！");
            input.close();
            return;
        }
        if (!isValidEmail(email)) {
            System.out.println("E-mail无效。");
            System.out.println("作业提交失败！");
            input.close();
            return;
        }
        System.out.println("作业提交成功！");
        input.close();
    }
}
