package interfacestudy;

// 计算机：组装符合标准的组件
public class Computer {
    private String brand;
    private CPU cpu;
    private EMS memory;
    private HardDisk hardDisk;

    public Computer(String brand) {
        this.brand = brand;
    }

    // 组装CPU
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    // 组装内存
    public void setMemory(EMS memory) {
        this.memory = memory;
    }

    // 组装硬盘
    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    // 显示计算机配置信息
    public void showInfo() {
        System.out.println("\n========== 计算机配置信息 ==========");
        System.out.println("计算机品牌：" + brand);
        System.out.println("CPU品牌：" + cpu.getBrand() + "，主频：" + cpu.getFrequency());
        System.out.println("内存容量：" + memory.getCapacity() + "GB");
        System.out.println("硬盘容量：" + hardDisk.getCapacity() + "GB");
        System.out.println("=====================================");
    }

    // 启动计算机
    public void start() {
        System.out.println("\n计算机正在启动...");
        System.out.println("检测CPU：" + cpu.getBrand() + " " + cpu.getFrequency());
        System.out.println("检测内存：" + memory.getCapacity() + "GB");
        System.out.println("检测硬盘：" + hardDisk.getCapacity() + "GB");
        System.out.println("启动完成！");
    }
}
