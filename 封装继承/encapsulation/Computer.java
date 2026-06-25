package encapsulation;

/**
 * 计算机类，输出计算机配置信息
 * @author hyf
 * @date 2025/5/30
 */
public class Computer {
    String motherboard;
    int memory;
    int hardDisk;
    String monitor;

    public Computer(String mb, int mem, int hd, String mon) {
        motherboard = mb;
        memory = mem;
        hardDisk = hd;
        monitor = mon;
    }

    public void showConfig() {
        System.out.println("主板：" + motherboard);
        System.out.println("内存：" + memory + "GB");
        System.out.println("硬盘：" + hardDisk + "GB");
        System.out.println("显示器：" + monitor);
    }
}

