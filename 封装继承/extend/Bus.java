package extend;

/**
 * 公交车类，继承车类
 * @author hyf
 * @date 2025/6/1
 */
public class Bus extends CarCopy {
    Bus(int site){
        setSite(site);
    }
    public static void main(String[] args) {
        Bus bus = new Bus(20);
        bus.print();
    }
}

