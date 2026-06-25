package test;

// 24. 求1-100所有偶数的和
class SumEven1To100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1-100所有偶数的和：" + sum);
    }
}
