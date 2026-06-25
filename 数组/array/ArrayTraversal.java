package array;

/**
 * 数组特价商品清单遍历
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param speciaLoffer 特价商品清单
 * @return 特价商品清单
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        String[] speciaLoffer = new String[]{"NIKE背包", "ADIDAS运动鞋", "李宁运动鞋","kappa外套","361腰包"};
        System.out.println("特价商品清单：");
        for (int i = 0; i < speciaLoffer.length; i++) {
            System.out.println(speciaLoffer[i]);
        }
    }
}
