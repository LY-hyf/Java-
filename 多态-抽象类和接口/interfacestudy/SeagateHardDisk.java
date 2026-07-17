package interfacestudy;

// 硬盘
public class SeagateHardDisk implements HardDisk {
    private int capacity;

    public SeagateHardDisk(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
