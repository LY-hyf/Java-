package reflect;

// 自定义产品类
public class Product {
    private String name;
    private double price;

    // 无参构造
    public Product() {
        System.out.println("方式1：通过无参构造创建对象");
        this.name = "默认商品";
        this.price = 0.0;
    }

    // 有参构造
    public Product(String name, double price) {
        System.out.println("方式2：通过有参构造创建对象");
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("商品名称：" + name + "，价格：" + price);
    }
}
