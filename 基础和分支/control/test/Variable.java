package control.test;

public class Variable{
    public static void main(String args[]) {
        byte a = 65;
        char b = (char) a;
        int c = b;
        System.out.println(a); // 65
        System.out.println(b); // 'A'
        System.out.println(c); // 65
    }
}

class Variable1 extends Variable{
    public static void main(String args[]) {
        int a = 8;
        byte b = (byte)a;
        double c = a;
        System.out.println(a); // 8
        System.out.println(b); // 8
        System.out.println(c); // 8.0
    }
}