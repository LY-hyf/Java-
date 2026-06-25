package test;

// 29. 鸡兔同笼
class ChickenRabbit {
    public static void main(String[] args) {
        int heads = 35;
        int feet = 94;
        for (int chicken = 0; chicken <= heads; chicken++) {
            int rabbit = heads - chicken;
            if (chicken * 2 + rabbit * 4 == feet) {
                System.out.println("鸡：" + chicken + "只，兔：" + rabbit + "只");
                break;
            }
        }
    }
}
