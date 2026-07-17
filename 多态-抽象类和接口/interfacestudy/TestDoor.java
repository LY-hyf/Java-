package interfacestudy;

/**
 * 测试门类
 * @author hyf
 * @date 2026/6/1
 */
public class TestDoor {
    public static void main(String[] args) {
        TheftProofDoor door = new TheftProofDoor(true);
        door.closeDoor();
        door.lock();
        door.ring();
        door.takePhoto();
        door.unlock();
        door.openDoor();

    }
}
