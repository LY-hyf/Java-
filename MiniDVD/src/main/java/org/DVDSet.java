package org;

/**
 * DVD数据实体类，封装一张DVD的完整信息。
 * <p>
 * 每张DVD包含三个属性：名称、状态（可借/已借出）、借出日期。
 * 状态字段：0 表示已借出，1 表示可借。
 *
 * @author hyf
 * @date 2026/6/3
 */
public class DVDSet {
    private int id;
    /** DVD名称 */
    private String name;
    /** 借出状态：0-已借出，1-可借 */
    private int status;
    /** 借出日期，格式为 yyyy-MM-dd，未借出时为空字符串 */
    private String borrowDate;
    /**
     * 全参构造方法，创建一张指定属性的DVD。
     *
     * @param name       DVD名称
     * @param status     借出状态（0-已借出，1-可借）
     * @param borrowDate 借出日期
     */
    public DVDSet(int id, String name, int status, String borrowDate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.borrowDate = borrowDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * 无参构造方法，创建一个属性均为默认值的DVD对象。
     */
    public DVDSet() {
    }

    /**
     * 获取DVD名称。
     *
     * @return DVD名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置DVD名称。
     *
     * @param name DVD名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取DVD借出状态。
     *
     * @return 借出状态（0-已借出，1-可借）
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置DVD借出状态。
     *
     * @param status 借出状态（0-已借出，1-可借）
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 获取DVD借出日期。
     *
     * @return 借出日期字符串，未借出时为空字符串
     */
    public String getBorrowDate() {
        return borrowDate;
    }

    /**
     * 设置DVD借出日期。
     *
     * @param borrowDate 借出日期
     */
    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    /**
     * 重写Obiect的toString方法，返回DVD信息的字符串表示。
     * @return 格式为 {@code DVD{name='xxx', status='x', borrowDate='xxx'}} 的字符串
     */
    @Override
    public String toString() {
        // %s字符串占位符
        return String.format("DVD{name='%s', status='%s', borrowDate='%s'}",
                name, status, borrowDate);
    }

}
