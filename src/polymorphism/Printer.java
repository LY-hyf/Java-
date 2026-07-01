package polymorphism;

/***
 * 打印机父类，定义抽象方法打印类型和实现方式
 * @author hyf
 * @date 2026/6/1
 */
public abstract class Printer {
    protected String name;

    public Printer(String name) {
        this.name = name;
    }

    public abstract void print();
    public abstract void showFeature();
}

