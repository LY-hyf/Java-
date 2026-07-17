package interfacestudy;

// 打印机：遵守墨盒和纸张的标准
public class Printer {
    private String brand;
    private String model;

    public Printer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // 打印方法：使用墨盒接口和纸张接口
    public void print(InkBox inkBox, Paper paper, String content) {
        System.out.println("\n打印机：" + brand + " " + model);
        System.out.println("使用" + inkBox.getColor() + "墨盒在" + paper.getSize() + "纸张上打印。");
        System.out.println("打印内容：" + content);
        System.out.println("墨水剩余：" + inkBox.getCapacity() + "ml，纸张厚度：" + paper.getThickness() + "g");
        System.out.println("打印完成！");
    }

    // 打印状态（无参数，使用默认配置）
    public void print(InkBox inkBox, Paper paper) {
        System.out.println("使用" + inkBox.getColor() + "墨盒在" + paper.getSize() + "纸张上打印。");
    }
}
