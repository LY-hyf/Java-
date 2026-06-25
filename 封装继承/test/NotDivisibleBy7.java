package test;

class NotDivisibleBy7 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 != 0) {
                System.out.print(i + "\t");
                sum += i;
                count++;
                if (count % 4 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n总和：" + sum);
    }
}
