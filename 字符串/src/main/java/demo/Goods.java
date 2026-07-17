package demo;

public class Goods {
    private int id;           // 商品编号
    private String name;      // 商品名称
    private double price;     // 商品价格
    
    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}
