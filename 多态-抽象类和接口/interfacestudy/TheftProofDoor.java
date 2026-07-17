package interfacestudy;

/**
 * 防盗门,继承门抽象类，实现门铃接口和门锁接口
 * @author hyf
 * @date 2026/6/1
 */
public class TheftProofDoor extends Door implements Lock,DoorBell {
    private boolean isTheftProof;
    private boolean isOpen;
    private boolean isLocked;
    private boolean isRinging;
    private boolean isPhotoTaken;


    public TheftProofDoor(boolean isOpen) {
        super(isOpen);
        this.isTheftProof = true;
        this.isOpen = isOpen;
        this.isLocked = false;
        this.isRinging = false;
        this.isPhotoTaken = false;
    }

    public void closeDoor() {
        if (isOpen) {
            isOpen = false;
            System.out.println("轻轻拉门，门已关闭");
        } else {
            System.out.println("轻轻拉门，门已关闭");
        }
    }

    public void lock() {
        if (isOpen == true) {
            System.out.println("门未关闭，无法上锁");
        } else {
            isLocked = true;
            System.out.println("插进钥匙，向左旋转3圈，门已上锁，拔出钥匙");
        }
    }

    public void ring() {
        if (isLocked == true) {
            isRinging = true;
            System.out.print("呤-——————————————");
        } else {

        }
    }

    public void takePhoto() {
        if (isRinging == true) {
            isPhotoTaken = true;
            System.out.println("咔擦-————————————，照片已存档");
        } else {

        }
    }

    public void unlock() {
        System.out.println("插进钥匙，向右旋转3圈，门已解锁，拔出钥匙");
        isLocked = false;
    }

    public void openDoor() {
        if (isLocked == true) {
            System.out.println("门锁未解锁，无法打开,请先解锁");
        } else {
            isOpen = true;
            System.out.println("用力推，门已打开");
        }
    }
}
