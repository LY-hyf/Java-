package interfacestudy;

// A4 纸
public class A4Paper implements Paper {
    @Override
    public String getSize() {
        return "A4";
    }

    @Override
    public int getThickness() {
        return 80;   // 80g
    }
}

