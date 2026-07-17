package interfacestudy;

// 黑白墨盒
public class BlackInkBox implements InkBox {
    @Override
    public String getColor() {
        return "黑白";
    }

    @Override
    public int getCapacity() {
        return 100;  // 100ml
    }
}

