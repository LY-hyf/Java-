package exception;

/**
 * 自定义数组下标越界异常
 * @author hyf
 * @date 2026/6/3
 */
public class MyArrayIndexOutOfBoundsException extends Exception {
    // 带消息的构造器
    public MyArrayIndexOutOfBoundsException(String message) {
        super(message);
    }

}
