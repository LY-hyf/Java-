package encapsulation;

/**
 * 商品类
 * 包含商品名称和价格属性
 * @author hyf
 * @date 2026/5/30
 */
public class Product {
    /** 商品名称 */
    String name;
    /** 商品价格 */
    double price;

    /**
     * 构造方法 - 初始化商品信息
     * @param name 商品名称
     * @param price 商品价格
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * 显示商品信息
     */
    public void showInfo() {
        System.out.println("商品名称：" + name);
        System.out.println("商品价格：??? 元（猜猜看）");
    }
}