package test;

// 34. 循环的实现方式及执行顺序
class LoopImplementation {
    public static void main(String[] args) {
        System.out.println("循环的三种实现方式：for、while、do-while\n");

        System.out.println("1. for循环（先判断后执行）");
        System.out.println("执行顺序：初始化 → 条件判断 → 循环体 → 更新变量 → 条件判断...");
        for (int i = 1; i <= 3; i++) {
            System.out.println("for循环第" + i + "次");
        }

        System.out.println("\n2. while循环（先判断后执行）");
        System.out.println("执行顺序：条件判断 → 循环体 → 条件判断...");
        int j = 1;
        while (j <= 3) {
            System.out.println("while循环第" + j + "次");
            j++;
        }

        System.out.println("\n3. do-while循环（先执行后判断）");
        System.out.println("执行顺序：循环体 → 条件判断 → 循环体...");
        int k = 1;
        do {
            System.out.println("do-while循环第" + k + "次");
            k++;
        } while (k <= 3);
    }
}
