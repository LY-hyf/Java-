package demo;

public class ContainsDemo {
    public static void main(String[] args) {
        String str = "sfsfsfsfsfsfsfsfsvggg";
        boolean hasFox = str.contains("sf");
        System.out.println("是否包含'sf': " + hasFox);
        boolean hasCat = str.contains("jj");
        System.out.println("是否包含'jj': " + hasCat);
    }
}

