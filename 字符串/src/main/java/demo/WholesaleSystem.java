package demo;

import java.util.Scanner;

public class WholesaleSystem {
    private Goods[] goodsList = {
        new Goods(1, "电风扇", 124.23),
        new Goods(2, "洗衣机", 4500.0),
        new Goods(3, "电视机", 8800.9),
        new Goods(4, "冰箱", 5000.88),
        new Goods(5, "空调机", 4456.0)
    };
    /**
     * 将 double 格式化为带逗号的字符串（264027.0 -> 264,027.0）
     */
    public StringBuffer change(double d) {
        StringBuffer str = new StringBuffer(String.valueOf(d));
        for (int i = str.indexOf(".") - 3; i > 0; i = i - 3) {
            str.insert(i, ',');
        }
        return str;
    }
    /**
     * 显示商品列表
     */
    public void show() {
        System.out.println("*******欢迎进入商品批发城*******");
        System.out.println("\t编号\t商品\t价格");
        for (Goods goods : goodsList) {
            System.out.println("\t" + goods.getId() + "\t" + goods.getName() + "\t" + change(goods.getPrice()));
        }
        System.out.println("********************************");
    }
    /**
     * 登录验证
     */
    public boolean login(String username, String password) {
        return "TOM".equals(username) && "123".equals(password);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WholesaleSystem system = new WholesaleSystem();
        System.out.print("请输入用户名：");
        String username = scanner.nextLine();
        System.out.print("请输入密码：");
        String password = scanner.nextLine();
        if (!system.login(username, password)) {
            System.out.println("登录失败！");
            scanner.close();
            return;
        }
        System.out.println("登录成功！");
        system.show();
        System.out.print("请输入您批发的商品编号：");
        int goodsId = scanner.nextInt();
        System.out.print("请输入批发数量：");
        int quantity = scanner.nextInt();
        double total = 0;
        for (Goods goods : system.goodsList) {
            if (goods.getId() == goodsId) {
                total = goods.getPrice() * quantity;
                break;
            }
        }
        System.out.println("您需要付款：" + system.change(total));
        scanner.close();
    }
}
