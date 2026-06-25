package test;

class StudentGrowth {
    public static void main(String[] args) {
        int year = 2012;        // 起始年份
        double students = 25;   // 起始人数（万人）
        double target = 100;    // 目标人数（万人）
        double rate = 0.25;     // 年增长率25%

        // 使用while循环计算达到目标人数的年份
        while (students < target) {
            students = students * (1 + rate);  // 每年增长25%
            year++;                             // 年份增加
        }

        System.out.println("到" + year + "年培训学员人数将达到" + (int)students + "万人");
    }
}
