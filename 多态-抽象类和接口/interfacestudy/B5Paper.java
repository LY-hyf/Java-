package interfacestudy;

// B5 纸
public class B5Paper implements Paper {
    @Override
    public String getSize() {
        return "B5";
    }

    @Override
    public int getThickness() {
        return 70;   // 70g
    }
}
