package interfacestudy;

// AMD CPU（扩展）
public class AMDCPU implements CPU {
    private String frequency;

    public AMDCPU(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String getBrand() {
        return "AMD";
    }

    @Override
    public String getFrequency() {
        return frequency;
    }
}
