package polymorphism;

/**
 * 激光打印机,继承自Printer类,实现打印方式和特点
 * @author hyf
 * @date 2026/6/1
 */
public class LaserPrinter extends Printer {
    public LaserPrinter() { super("激光打印机"); }

    @Override
    public void print() { System.out.println("激光打印：静电成像+碳粉定影"); }

    @Override
    public void showFeature() {
        System.out.println("特点：速度快、文字清晰、适合批量打印");
    }
}
