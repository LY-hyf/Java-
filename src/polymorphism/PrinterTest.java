package polymorphism;

/**
 * 打印机测试类
 * @author hyf
 * @date 2026/6/1
 */
public class PrinterTest {
    public static void showAllPrinters(Printer[] printers) {
        for (Printer p : printers) {
            System.out.print(p.name + "：");
            p.print();
            p.showFeature();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Printer[] printers = {new DotMatrixPrinter(), new InkjetPrinter(), new LaserPrinter()};
        showAllPrinters(printers);
    }
}
