package array;

/**
 * 计算班级平均分
 * @author 韩永发
 * @date 2026/5/28
 * @version 1.0
 * @param classSize 班级人数
 * @param score 分数数组
 * @param sumScore 分数总和
 * @param classAverageScore 班级平均分
 * return 班级平均分
 */
public class ClassAverageScore {
    public static void main(String[] args){
        int classSize = 30;
        double[] score = new double[classSize];
        double sumScore = 0;
        for (int i = 0;i < score.length;i++){
            score[i] = Math.round(Math.random() * 100 * 10)/10.0;
            sumScore += score[i];
        }
        double classAverageScore = sumScore / score.length;
        System.out.printf("班级平均分是: %.1f\n",classAverageScore);
    }
}

/**
 * 企业写法，使用DecimalFormat格式化输出
 */
//import java.text.DecimalFormat;
//DecimalFormat df = new DecimalFormat("#.0");
//System.out.println("班级平均分是:" + df.format(classAverageScore));