package control.test;

public class WeeklyPlan {
    public static void main(String[] args) {
        for (int day = 1; day <= 7; day++) {
            System.out.print("星期" + day + "：");
            switch (day) {
                case 1:
                    System.out.println("Java基础语法");
                    break;
                case 2:
                    System.out.println("分支结构（if/switch）");
                    break;
                case 3:
                    System.out.println("循环结构（for/while）");
                    break;
                case 4:
                    System.out.println("数组");
                    break;
                case 5:
                    System.out.println("方法");
                    break;
                case 6:
                    System.out.println("实战练习");
                    break;
                case 7:
                    System.out.println("复习与总结");
                    break;
            }
        }
    }
}