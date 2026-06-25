package encapsulation;

public class For {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i < 10; i ++){
            if (i % 2 == 0)
                continue;
            i = i + 1;
            if (i == 5)
                break;
            //System.out.println(i);
        }
        System.out.println(i);
    }
}


