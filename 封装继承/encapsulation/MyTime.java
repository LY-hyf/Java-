package encapsulation;

import java.time.LocalDateTime;

/**
 * 时间类
 * @author hyf
 * @date 2025/5/30
 */
public class MyTime {
    private int hour, minute, second;

    public MyTime() {
        LocalDateTime now = LocalDateTime.now();
        this.hour = now.getHour();
        this.minute = now.getMinute();
        this.second = now.getSecond();
    }

    public void showTime() {
        System.out.printf("当前时间：%02d:%02d:%02d\n", hour, minute, second);
    }
}
