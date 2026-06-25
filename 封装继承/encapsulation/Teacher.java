package encapsulation;

/**
 * 教师类
 * @author 韩永发
 * @since 2026-5-30
 */
public class Teacher {
    String name;
    String professional;
    String course;
    int teachingExperience;

    public void showTeacher(){
        System.out.println(name + "\n" + "教龄：" + teachingExperience + "\n" + "专业方向：" + professional + "\n" + "教授课程：" + course);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "王老师";
        teacher.professional = "计算机";
        teacher.course = "使用JAVA语言理解程序逻辑";
        teacher.teachingExperience = 5;
        teacher.showTeacher();
    }
}
