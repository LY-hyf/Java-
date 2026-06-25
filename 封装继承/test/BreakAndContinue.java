package test;

class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("break：终止整个循环");
        System.out.println("continue：跳过本次循环剩余语句，继续下一次循环");
        System.out.println("\nbreak示例：");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.print(i + " ");
        }
        System.out.println("\n\ncontinue示例：");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
