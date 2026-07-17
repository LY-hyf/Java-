package interfacestudy;

/**
 * HTC 手机：支持视频播放、拍照、上网、增强短信,支持视频通话、语音通话、发送带图片与文字的信息
 * @author hyf
 * @date 2026/6/1
 */
public class HTCMobilePhone extends Handset implements PhoneNewFeature {

    public HTCMobilePhone(String brand, String model) {
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
    public void sendMessagePhotoText() {
        System.out.println("发送带图片与文字的信息《》……");
    }

    @Override
    public void videoCall() {
        System.out.println("开始视频通话，号码：" + "……");
    }


    @Override
    public void playVideo() {
        System.out.println("开始播放视频《小时代》……");
    }

    @Override
    public void takePhoto() {
        System.out.println("咔嗒……拍照成功");
    }

    @Override
    public void browseInternet() {
        System.out.println("已经启动移动网络……");
    }

    @Override
    public void playAudio() {
        System.out.println("开始播放音频……");
    }

    public static void main(String[] args) {
        HTCMobilePhone htcMobilePhone = new HTCMobilePhone("HTC", "9000");
        htcMobilePhone.showInfo();
        htcMobilePhone.sendMessage();
        htcMobilePhone.call();
        htcMobilePhone.sendMessagePhotoText();
        htcMobilePhone.videoCall();
        htcMobilePhone.playVideo();
        htcMobilePhone.takePhoto();
        htcMobilePhone.browseInternet();
        htcMobilePhone.playAudio();
    }
}
