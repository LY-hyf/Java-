package polymorphism;

/**
 * 针式打印机，继承自Printer类，实现打印方式和特点
 * @author hyf
 * @date 2026/6/1
 */
public class DotMatrixPrinter extends Printer {
    public DotMatrixPrinter() { super("针式打印机"); }

    @Override
    public void print() { System.out.println("针式打印：通过打印针撞击色带"); }

    @Override
    public void showFeature() {
        System.out.println("特点：可复写打印、耗材便宜、噪音大");
    }
}
