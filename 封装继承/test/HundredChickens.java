package test;


class HundredChickens {
    public static void main(String[] args) {
        // 公鸡5元，母鸡3元，雏鸡1/3元（3只1元）
        for (int cock = 0; cock <= 20; cock++) {
            for (int hen = 0; hen <= 33; hen++) {
                int chick = 100 - cock - hen;
                if (chick >= 0 && chick % 3 == 0 && 5 * cock + 3 * hen + chick / 3 == 100) {
                    System.out.println("公鸡：" + cock + "只，母鸡：" + hen + "只，雏鸡：" + chick + "只");
                }
            }
        }
    }
}
