package encapsulation;

/**
 * 电池类输出电池信息
 * @author hyf
 * @date 2025/5/30
 */
public class Cell {
    String brand;  // 品牌

    /* 续电行为 */
    public void charge() {
        System.out.println(brand + "电池正在续电中...");
    }
}


