package interfacestudy;

/**
 * 对Handset类的测试
 * @author hyf
 * @date 2026/6/1
 */
public class HandsetTest {
    public static void main(String[] args) {

        // ========== 测试索尼爱立信手机 ==========
        SonyEricssonPhone sony = new SonyEricssonPhone("索尼爱立信", "G502c");
        sony.showInfo();

        // 原始功能
        sony.sendMessage();
        sony.call();

        // 扩展功能（音频播放）
        sony.playAudio();

        System.out.println("\n==================================================");

        // ========== 测试 HTC 手机 ==========
        HTCMobilePhone htc = new HTCMobilePhone("HTC", "I9100");
        htc.showInfo();

        // 扩展功能（上网 - 先上网才能发带图信息）
        htc.browseInternet();

        // 扩展功能（视频播放）
        htc.playVideo();

        // 扩展功能（拍照）
        htc.takePhoto();

        // 增强的短信功能
        htc.sendMessage();

        // 增强的通话功能（视频通话）
        htc.call();

        System.out.println("\n==================================================");

        // ========== 演示多态 ==========
        System.out.println("\n【多态演示】面向接口编程：");

        // 只要是支持基础功能的手机，都可以调用 sendMessage 和 playAudio
        PhoneFeature phoneDevice = sony;
        phoneDevice.playAudio();

        // 只要是支持新功能的手机，都可以调用 takePhoto 和 browseInternet
        PhoneNewFeature newFeatureDevice = htc;
        newFeatureDevice.takePhoto();
        newFeatureDevice.browseInternet();

        System.out.println("\n==================================================");

        // ========== 演示手机功能对比 ==========
        System.out.println("\n【功能对比】");

        System.out.println("\n索尼爱立信 G502c 支持的功能：");
        System.out.println("  ✓ 发短信");
        System.out.println("  ✓ 通电话");
        System.out.println("  ✓ 音频播放");
        System.out.println("  ✗ 视频播放");
        System.out.println("  ✗ 拍照");
        System.out.println("  ✗ 上网");

        System.out.println("\nHTC I9100 支持的功能：");
        System.out.println("  ✓ 发短信（支持图片）");
        System.out.println("  ✓ 视频通话");
        System.out.println("  ✓ 音频播放（需安装软件）");
        System.out.println("  ✓ 视频播放");
        System.out.println("  ✓ 拍照");
        System.out.println("  ✓ 上网");
    }
}