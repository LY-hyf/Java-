package control;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class demo1 {
    public static void traverseDirectory(File dir) {
        if (dir == null || !dir.exists()) return;
        System.out.println(dir.getAbsolutePath());
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    traverseDirectory(file);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try{
            File file = new File("D:\\HelloWorld.txt");
            file.createNewFile();
            boolean attribute = file.isFile();
            if (attribute){
                System.out.println("HellWorld.txt 是文件");
            }
            else {
                System.out.println("HellWorld.txt 是目录");
            }
            File ioTestDir = new File("D:\\IOTest");
            ioTestDir.mkdirs();
            Path source = Paths.get("D:\\HelloWorld.txt");
            Path target = Paths.get("D:\\IOTest\\HelloWorld.txt");
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("文件移动成功！");
            System.out.println("\n遍历IOTest目录:");
            traverseDirectory(ioTestDir);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
