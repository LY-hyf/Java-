package test;

// 31. 四位数问题
class FourDigitNumber {
    public static void main(String[] args) {
        for (int num = 1000; num <= 9999; num++) {
            int lastThree = num % 1000;
            if (num == lastThree * 3) {
                System.out.println("这个四位数是：" + num);
                break;
            }
        }
    }
}
