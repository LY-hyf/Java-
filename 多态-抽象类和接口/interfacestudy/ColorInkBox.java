package interfacestudy;

// 彩色墨盒
public class ColorInkBox implements InkBox {
    @Override
    public String getColor() {
        return "彩色";
    }

    @Override
    public int getCapacity() {
        return 80;   // 80ml
    }
}
