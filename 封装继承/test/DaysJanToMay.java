package test;

// 28. 统计1月-5月的总天数
class DaysJanToMay {
    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31};
        int sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        System.out.println("1月-5月的总天数：" + sum);
    }
}
