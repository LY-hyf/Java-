package polymorphism;
/**
 * 喷墨打印机,继承自Printer类，实现打印方式和特点
 * @author hyf
 * @date 2026/6/1
 */
public class InkjetPrinter extends Printer {
    public InkjetPrinter() { super("喷墨打印机"); }

    @Override
    public void print() { System.out.println("喷墨打印：喷射墨滴成像"); }

    @Override
    public void showFeature() {
        System.out.println("特点：彩色打印效果好、照片打印、耗材较贵");
    }
}
