package interfacestudy;

/**
 * 门抽象类
 * @author hyf
 * @date 2026/6/1
 */
public abstract class Door {
    protected boolean isOpen;

    public Door(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public abstract void openDoor();
    public abstract void closeDoor();
}
