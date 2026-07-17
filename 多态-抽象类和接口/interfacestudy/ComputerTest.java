package interfacestudy;

public class ComputerTest {
    public static void main(String[] args) {
        System.out.println("========== 组装一台计算机 ==========");

        // 需求：CPU品牌Intel，主频3.8GHz，硬盘3000GB，内存4GB
        Computer myComputer = new Computer("DIY兼容机");

        // 选择组件（面向接口编程）
        CPU cpu = new IntelCPU("3.8GHz");           // Intel CPU
        EMS memory = new KingstonMemory(4);          // 4GB 内存
        HardDisk hardDisk = new SeagateHardDisk(3000); // 3000GB 硬盘

        // 组装计算机
        myComputer.setCpu(cpu);
        myComputer.setMemory(memory);
        myComputer.setHardDisk(hardDisk);

        // 显示配置
        myComputer.showInfo();

        // 启动计算机
        myComputer.start();

        // 演示多态和扩展性
        System.out.println("\n========== 多态演示 ==========");
        CPU cpuRef = new IntelCPU("4.0GHz");     // 接口引用指向实现类
        EMS memoryRef = new KingstonMemory(16);   // 接口引用指向实现类
        HardDisk hdRef = new SeagateHardDisk(1000);

        System.out.println("CPU品牌：" + cpuRef.getBrand());
        System.out.println("内存容量：" + memoryRef.getCapacity() + "GB");
        System.out.println("硬盘容量：" + hdRef.getCapacity() + "GB");

        // 演示扩展性：可以更换不同厂商的组件
        System.out.println("\n========== 扩展性演示 ==========");
        System.out.println("可以轻松更换为AMD CPU：");
        CPU amdCpu = new AMDCPU("4.2GHz");
        System.out.println("新CPU品牌：" + amdCpu.getBrand() + "，主频：" + amdCpu.getFrequency());

        System.out.println("\n可以升级内存：");
        EMS newMemory = new KingstonMemory(32);
        System.out.println("新内存容量：" + newMemory.getCapacity() + "GB");

        System.out.println("\n可以更换硬盘：");
        HardDisk newDisk = new SeagateHardDisk(4000);
        System.out.println("新硬盘容量：" + newDisk.getCapacity() + "GB");

        System.out.println("\n无需修改Computer类，即可兼容所有符合标准的组件！");
    }
}
