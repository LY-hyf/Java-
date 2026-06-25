package encapsulation;

/**
 * 榨汁机类，定义榨汁方法
 * @author hyf
 * @date 2025/5/30
 */
public class ZhazhiJi {
    // 带一个参数的方法
    public String zhazhi(String fruit) {
        String juice = fruit + "汁";
        return juice;
    }

    public static void main(String[] args) {
        ZhazhiJi myZhazhiji = new ZhazhiJi();
        String myFruit = "苹果";
        String myJuice = myZhazhiji.zhazhi(myFruit);  // 实参"苹果"传递给形参fruit
        System.out.println(myJuice);  // 输出：苹果汁
    }
}
