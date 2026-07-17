package interfacestudy;

// Intel CPU
public class IntelCPU implements CPU {
    private String frequency;

    public IntelCPU(String frequency) {
        this.frequency = frequency;
    }

    @Override
    public String getBrand() {
        return "Intel";
    }

    @Override
    public String getFrequency() {
        return frequency;
    }
}

