package abstrct;

/**
 * 汽车类（封装）,定义汽车的款式和编号
 * @author hyf
 * @date 2025/6/1
 */
public class Car {
    private final String style;  // 款式，不可修改
    private final String id;     // 编号，不可修改

    public Car(String style, String id) {
        this.style = style;
        this.id = id;
    }

    public String getStyle() {
        return style;
    }

    public String getId() {
        return id;
    }

    public void showInfo() {
        System.out.println("汽车款式：" + style + "，编号：" + id);
    }
}

