package interfacestudy;

public class PrinterTest {
    public static void main(String[] args) {
        // 创建打印机
        Printer printer = new Printer("HP", "LaserJet Pro");

        // 创建各种墨盒和纸张
        InkBox blackInk = new BlackInkBox();
        InkBox colorInk = new ColorInkBox();
        Paper a4Paper = new A4Paper();
        Paper b5Paper = new B5Paper();

        System.out.println("========== 打印机测试 ==========");

        // 测试1：黑白墨盒 + A4纸
        System.out.print("测试1：");
        printer.print(blackInk, a4Paper);

        // 测试2：彩色墨盒 + B5纸
        System.out.print("测试2：");
        printer.print(colorInk, b5Paper);

        // 测试3：彩色墨盒 + A4纸
        System.out.print("测试3：");
        printer.print(colorInk, a4Paper);

        // 测试4：完整打印
        System.out.println("\n========== 完整打印演示 ==========");
        printer.print(colorInk, a4Paper, "Hello, 面向接口编程！");

        // 演示多态
        System.out.println("\n========== 多态演示 ==========");
        InkBox inkBox = new ColorInkBox();      // 接口引用指向实现类
        Paper paper = new A4Paper();            // 接口引用指向实现类

        System.out.println("墨盒类型：" + inkBox.getColor());
        System.out.println("纸张类型：" + paper.getSize());

        // 展示兼容性
        System.out.println("\n========== 兼容性演示 ==========");
        System.out.println("打印机可以兼容任何符合标准的墨盒和纸张：");

        // 假设未来有新厂商生产新型墨盒
        InkBox newInkBox = new InkBox() {
            @Override
            public String getColor() {
                return "荧光";
            }

            @Override
            public int getCapacity() {
                return 120;
            }
        };

        Paper newPaper = new Paper() {
            @Override
            public String getSize() {
                return "A3";
            }

            @Override
            public int getThickness() {
                return 100;
            }
        };

        printer.print(newInkBox, newPaper);
    }
}
