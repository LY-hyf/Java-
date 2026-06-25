package control.test;

public class BankInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate1y = 2.25 / 100;
        double rate2y = 2.7 / 100;
        double rate3y = 3.24 / 100;
        double rate5y = 3.6 / 100;

        double interest1 = principal * rate1y;
        double total1 = principal + interest1;
        System.out.println("存一年：利息=" + interest1 + "，本息=" + total1);

        double interest2 = principal * rate2y * 2;
        double total2 = principal + interest2;
        System.out.println("存两年：利息=" + interest2 + "，本息=" + total2);

        double interest3 = principal * rate3y * 3;
        double total3 = principal + interest3;
        System.out.println("存三年：利息=" + interest3 + "，本息=" + total3);

        double interest5 = principal * rate5y * 5;
        double total5 = principal + interest5;
        System.out.println("存五年：利息=" + interest5 + "，本息=" + total5);
    }
}

