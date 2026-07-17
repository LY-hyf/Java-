package interfacestudy;

// 普通燃油车
public class FuelCar implements Start, Stop, Accelerate, Brake {
    private String brand;
    private String model;
    private int speed;
    private boolean isRunning;

    public FuelCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
        this.isRunning = false;
    }

    @Override
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " " + model + " 引擎启动，轰隆隆~~~");
        } else {
            System.out.println("发动机已经启动");
        }
    }

    @Override
    public void stop() {
        if (isRunning) {
            isRunning = false;
            speed = 0;
            System.out.println(brand + " " + model + " 已熄火");
        } else {
            System.out.println("发动机已经关闭");
        }
    }

    @Override
    public void accelerate(int speed) {
        if (isRunning) {
            this.speed = speed;
            System.out.println(brand + " " + model + " 加速到 " + speed + " km/h");
        } else {
            System.out.println("请先启动发动机");
        }
    }

    @Override
    public void brake() {
        if (speed > 0) {
            System.out.println(brand + " " + model + " 刹车，速度从 " + speed + " 降到 0");
            speed = 0;
        } else {
            System.out.println("车辆已经静止");
        }
    }
    

    public void showStatus() {
        System.out.println("状态：" + (isRunning ? "运行中" : "停止") + "，速度：" + speed + " km/h");
    }
}
