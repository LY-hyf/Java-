package test;

// 10. 摄氏度转换
class CelsiusToFahrenheit {
    public static void main(String[] args) {
        for (int c = 0; c <= 100; c += 10) {
            double f = c * 9.0 / 5 + 32;
            System.out.println(c + "℃ = " + f + "℉");
        }
    }
}
