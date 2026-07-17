package org.example;

public class Test1 {
    public void add(int i) throws NullPointerException{
        if (i == 0) {
            System.out.println("add出现异常");
            throw new NullPointerException();
        }
    }

    public static void main(String[] args){
        Test1 test1 = new Test1();
        try{
            test1.add(0);
            System.out.println("add方法返回");
        }
        catch (Exception e){
            System.out.println("捕获异常");
        }
    }
}
