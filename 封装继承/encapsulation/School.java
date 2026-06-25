package encapsulation;

public class School {
    String schoolName;
    int classNumber;
    int labNumber;

    private void showCenter() {
        System.out.println(schoolName + "培训学院\n" + "配备: " + classNumber + "教" + labNumber + "机");
    }
    public static void main(String[] args) {
        School center = new School();
        System.out.println("***初始化成员变量前***");
        center.showCenter();

        center.schoolName = "北京中心";
        center.classNumber = 10;
        center.labNumber = 10;

        System.out.println("\n***初始化成员变量后***");
        center.showCenter();
    }

}
