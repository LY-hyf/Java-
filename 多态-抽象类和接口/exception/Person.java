package exception;

/**
 * 用户类，定义设置年龄方法，对输入进行异常抛出
 * @author hyf
 * @date 2026/6/1
 */
public class Person {
    private int age;

    public void setAge(int age) throws Exception {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            throw new Exception("年龄必须在1到100之间！");
        }
    }
}
