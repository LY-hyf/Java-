package control;

public class Table {
    public static void main(String[] args) {
        int i;
        int j = 0;
        for (i = 1; i < 10; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
//        System.out.println(i + "*" + j + "=" + i * j);
    }
}
