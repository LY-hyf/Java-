package polymorphism;

/**
 * 租赁公司类，包含计算总租金方法
 * @author hyf
 * @date 2026/6/1
 */
public class RentCompany {
    private String name;

    public RentCompany(String name) {
        this.name = name;
    }

    // 计算总租金
    // 参数是父类 Vehicle 数组，可以接收任何类型的车辆子类
    public double calcTotalRent(Vehicle[] vehicles, int days) {
        double total = 0;

        System.out.println("\n" + name + " 租赁账单（租期 " + days + " 天）");
        System.out.println("=====================================");

        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) {
                double rent = vehicles[i].calcRent(days);  // 多态调用
                total += rent;

                System.out.print((i+1) + ". ");
                vehicles[i].showInfo();
                System.out.printf(" 租金：%.2f 元\n", rent);
            }
        }

        System.out.println("=====================================");
        System.out.printf("总租金：%.2f 元\n", total);
        return total;
    }

    // 扩展方法：从控制台选择车辆（满足提前做完的改进需求）
    public double calcTotalRentInteractive() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double total = 0;
        int vehicleCount = 0;

        System.out.print("请选择租赁方式（1-固定清单 2-自定义选择）：");
        int mode = scanner.nextInt();

        if (mode == 1) {
            // 固定清单：需求说明中的车辆
            Vehicle[] vehicles = getFixedVehicleList();
            System.out.print("请输入租赁天数：");
            int days = scanner.nextInt();
            return calcTotalRent(vehicles, days);
        } else {
            // 自定义模式（改进系统）
            System.out.print("请输入租赁天数：");
            int days = scanner.nextInt();

            System.out.print("请输入租赁车辆数量：");
            int count = scanner.nextInt();
            Vehicle[] vehicles = new Vehicle[count];

            for (int i = 0; i < count; i++) {
                System.out.println("\n--- 选择第 " + (i+1) + " 辆车 ---");
                System.out.println("车辆类型：1-轿车 2-巴士 3-卡车");
                int type = scanner.nextInt();

                switch (type) {
                    case 1:
                        System.out.print("品牌：");
                        String brand = scanner.next();
                        System.out.print("每日租金：");
                        double rent = scanner.nextDouble();
                        vehicles[i] = new Car(brand, "轿车", rent);
                        break;
                    case 2:
                        System.out.print("品牌：");
                        brand = scanner.next();
                        System.out.print("座位数：");
                        int seats = scanner.nextInt();
                        System.out.print("租金基数：");
                        double baseRent = scanner.nextDouble();
                        vehicles[i] = new Bus(brand, "巴士", seats, baseRent);
                        break;
                    case 3:
                        System.out.print("品牌：");
                        brand = scanner.next();
                        System.out.print("吨位：");
                        double ton = scanner.nextDouble();
                        vehicles[i] = new Truck(brand, "卡车", ton, 50);
                        break;
                }
            }
            return calcTotalRent(vehicles, days);
        }
    }

    // 固定车辆清单（需求说明）
    private Vehicle[] getFixedVehicleList() {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("宝马", "轿车", 500);      // 2辆宝马
        vehicles[1] = new Car("宝马", "轿车", 500);
        vehicles[2] = new Car("别克", "商务舱", 600);    // 1辆别克商务舱
        vehicles[3] = new Bus("金龙", "客车", 34, 80);   // 1辆金龙34座
        return vehicles;
    }
}
