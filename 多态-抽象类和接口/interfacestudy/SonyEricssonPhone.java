package interfacestudy;

/**
 * 索尼爱立信手机，继承手机抽象类，实现手机功能接口
 * @author hyf
 * @date 2026/6/1
 */
public class SonyEricssonPhone extends Handset{
    private String brand = "索尼爱立信";
    private String model = "G502C";
    private boolean isOline = false;
    public SonyEricssonPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void sendMessage() {
        System.out.println("发送文字信息《》……");
    }

    @Override
    public void call() {
        System.out.println("开始语音通话，号码：" + "……");
    }

    @Override
    public void playAudio() {
        System.out.println("开始播放音乐《热雪》……");
    }

    public static void main(String[] args) {
        SonyEricssonPhone sonyEricssonPhone = new SonyEricssonPhone("索尼爱立信", "G502C");
        sonyEricssonPhone.showInfo();
        sonyEricssonPhone.sendMessage();
        sonyEricssonPhone.call();
        sonyEricssonPhone.playAudio();
    }
}