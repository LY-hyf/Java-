package test;

class PeopleCount {
    public static void main(String[] args) {
        for (int people = 100; people <= 200; people++) {
            if (people % 3 == 1 && people % 4 == 2 && people % 5 == 3) {
                System.out.println("操场上共有：" + people + "人");
                break;
            }
        }
    }
}
