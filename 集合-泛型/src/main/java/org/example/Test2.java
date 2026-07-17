package org.example;

public class Test2 {
    public static void main(String[] args){
        int[] array = {0,1,2,3,4};
        int sum = 0;
        try{
            for(int i=0;i<=6;i++){
                sum += array[i];
            }
            System.out.println("sum = " + sum);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        }
        finally{
            System.out.println("程序结束");
        }
    }
}
