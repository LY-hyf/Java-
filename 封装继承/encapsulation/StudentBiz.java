package encapsulation;

/**
 * 学生业务类
 * 对象作为参数
 * @author hyf
 * @date 2025/5/30
 */
public class StudentBiz {
    Student[] students = new Student[30];
    int count = 0;

    /**
     * 添加学生（对象作为参数）
     * @param stu 学生对象
     */
    public void addStudent(Student stu) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = stu;
                count++;
                break;
            }
        }
    }

    /**
     * 显示所有学生信息
     */
    public void showStudents() {
        System.out.println("学号\t姓名\t年龄\t成绩");
        for (int i = 0; i < count; i++) {
            if (students[i] != null) {
                students[i].showInfo();
            }
        }
    }
}
