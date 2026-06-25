package test;

// 22. 既是3的倍数又是5的倍数
class MultipleOf3And5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + "既是3的倍数又是5的倍数");
            }
        }
    }
}
