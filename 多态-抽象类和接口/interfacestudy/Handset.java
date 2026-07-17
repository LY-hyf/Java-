package interfacestudy;

// 原始手机：具有发短信和通电话的基础功能
public abstract class Handset implements PhoneFeature {
    protected String brand;      // 品牌
    protected String model;      // 型号

    public Handset(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // 发短信（所有手机都有）
    public abstract void sendMessage();

    // 通电话（所有手机都有）
    public abstract void call();

    // 播放音频（所有手机都有）
    public abstract void playAudio();

    // 显示手机信息
    public void showInfo() {
        System.out.println("\n这是一款型号为" + model + "的" + brand + "手机：");
    }
}
