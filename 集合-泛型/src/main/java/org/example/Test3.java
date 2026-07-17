package org.example;

public class Test3 {
    public static void main(String[] args){
        int numberOne = 10;
        int numberTwo = 0;
        try{
            int c = numberOne/numberTwo;
        }
        catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }
        catch (Exception e){
            System.out.println("出现异常");
        }
        finally{
            System.out.println("这是finally");
        }
    }
}
