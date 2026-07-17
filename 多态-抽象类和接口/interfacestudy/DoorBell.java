package interfacestudy;

/**
 * 门铃接口
 * @author hyf
 * @date 2026/6/1
 */
public interface DoorBell {
    boolean isRinging = false;

    // 抽象方法：响铃
    void ring();
    // 抽象方法：拍照存档（按门铃时自动拍照）
    void takePhoto();
}
