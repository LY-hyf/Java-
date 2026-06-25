package test;

// 29. 统计奇数月的总天数
class DaysOddMonths {
    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            if ((i + 1) % 2 == 1) {
                sum += days[i];
            }
        }
        System.out.println("奇数月的总天数：" + sum);
    }
}
