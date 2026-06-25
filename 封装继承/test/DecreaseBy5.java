package test;

// 12. 从100每次递减5输出直至5
class DecreaseBy5 {
    public static void main(String[] args) {
        for (int i = 100; i >= 5; i -= 5) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}