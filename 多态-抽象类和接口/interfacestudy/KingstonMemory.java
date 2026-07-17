package interfacestudy;

// 内存条
public class KingstonMemory implements EMS {
    private int capacity;

    public KingstonMemory(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }
}
