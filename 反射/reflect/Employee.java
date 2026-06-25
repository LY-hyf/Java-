package reflect;

// 自定义员工类
public class Employee {
    private String name;
    private double salary;

    // 无参构造（公有）
    public Employee() {
        System.out.println("调用了无参构造方法");
    }

    // 有参构造（公有）
    public Employee(String name) {
        this.name = name;
        System.out.println("调用了公有有参构造：" + name);
    }

    // 有参构造（私有）
    private Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("调用了私有构造方法：" + name + ", " + salary);
    }

    // 全参构造（受保护）
    protected Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        System.out.println("调用了受保护构造方法：" + name + ", " + salary + ", " + department);
    }

    public void display() {
        System.out.println("姓名：" + name + ", 工资：" + salary);
    }
}
