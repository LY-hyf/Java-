package org.example;

/**
 * 商品信息类
 */
public class Product {
    private final String productId;
    private final String productName;
    private int stock;

    public Product(String productId, String productName, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.stock = stock;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void decreaseStock() {
        this.stock--;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", stock=" + stock +
                '}';
    }
}
