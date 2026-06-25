package encapsulation;

/**
 * 手机类输出手机信息
 * @author hyf
 * @date 2025/5/30
 */
public class Phone {
    Cell battery;  // 组合电池对象
    String[] musicList = new String[10];  // 音乐列表
    int musicCount = 0;

    // 下载音乐
    public void download(String musicName) {
        if (musicCount < musicList.length) {
            musicList[musicCount] = musicName;
            musicCount++;
            System.out.println("正在下载：《" + musicName + "》");
        } else {
            System.out.println("音乐存储已满！");
        }
    }

    // 播放音乐
    public void playMusic() {
        if (musicCount == 0) {
            System.out.println("没有可播放的音乐，请先下载！");
            return;
        }
        System.out.println("正在播放：《" + musicList[0] + "》");
    }

    // 充电（重用电池类方法）
    public void charge(Cell cell) {
        cell.charge();
    }
}
