package test;

// 27. 1-100中7的倍数
class MultiplesOf7 {
    public static void main(String[] args) {
        System.out.println("1-100中7的倍数：");
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
