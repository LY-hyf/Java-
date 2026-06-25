package test;

// 32. 不包含4的自然数
class NoDigit4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (!String.valueOf(i).contains("4")) {
                System.out.print(i + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n共有：" + count + "个");
    }
}