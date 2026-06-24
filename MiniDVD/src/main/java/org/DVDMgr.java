package org;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * DVD管理器，负责DVD的增删查改与借还操作。
 * <p>
 * 内部使用固定容量为 50 的 {@link DVDSet} 数组存储DVD数据。
 * 状态码约定：0-已借出，1-可借。
 *
 * @author hyf
 * @date 2026/6/31
 */
public class DVDMgr {

    /** DVD存储数组，最大容量为 50 */
    private DVDSet[] dvdArray = new DVDSet[50];

    /** 控制台输入扫描器 */
    Scanner scanner = new Scanner(System.in);

    /** 每日租金（元/天） */
    private static final double DAILY_RENT = 2.0;

    /**
     * 无参构造方法。
     */
    public DVDMgr() {

    }

    /**
     * 初始化DVD库，预置三条示例数据。
     * <ul>
     *   <li>罗马假日 — 已借出（状态0），借出日期 2013-07-01</li>
     *   <li>风声鹤唳 — 可借（状态1）</li>
     *   <li>浪漫满屋 — 可借（状态1）</li>
     * </ul>
     */
    public void initial() {
        dvdArray[0] = new DVDSet(1,"罗马假日", 0, "2026-06-01");
        dvdArray[1] = new DVDSet(2,"风声鹤唳", 1, "");
        dvdArray[2] = new DVDSet(3,"浪漫满屋", 1, "");
    }

    /**
     * 查找数组中第一个为 {@code null} 的位置索引。
     *
     * @return 第一个空位索引，若数组已满则返回 -1
     */
    public int firstNullIndex() {
        for (int i = 0; i < dvdArray.length; i++) {
            if (dvdArray[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 新增一张DVD。
     * <p>
     * 从控制台读取用户输入的DVD名称，在第一个空位处插入新DVD。
     * 新DVD默认状态为 1（可借），借出日期为空。
     * 若DVD库已满（达到50张），则提示无法新增。
     */
    public void addDVD() {
        int index = firstNullIndex();
        if (index == -1) {
            System.out.println("DVD库已满，无法新增！");
            return;
        }
        System.out.println("-->新增DVD");
        System.out.print("请输入DVD名称：");
        String name = scanner.nextLine();
        // 新 DVD 默认状态为 1（可借），借出日期为空,创建对象时赋值
        DVDSet newDVD = new DVDSet(index+1,name,1,"");
        // 将新增书籍对象存入数组中
        dvdArray[index] = newDVD;
        System.out.println("新增《" + name + "》成功");
    }

    /**
     * 查看所有DVD信息。
     * <p>
     * 按序号、状态、名称、借出日期四列列表输出。
     */
    public void searchDVD() {
        System.out.println("-->查看DVD");
        System.out.println("序号\t状态\t名称\t借出日期");
        for (int i = 0; i < dvdArray.length; i++) {
            if (dvdArray[i] != null) {
                // 将状态码转换为状态描述，条件 ? 值1 : 值2；0-已借出，1-可借
                String statusStr = (dvdArray[i].getStatus() == 0) ? "已借出" : "可借";
                System.out.println(i + "\t" + statusStr + "\t" + dvdArray[i].getName() + "\t" + dvdArray[i].getBorrowDate());
            }
        }
    }

    /**
     * 根据名称查找DVD的索引位置（内部方法）。
     * @param name DVD名称
     * @return 索引位置，未找到返回 -1
     */
    private int findDVDIndexByName(String name) {
        for (int i = 0; i < dvdArray.length; i++) {
            if (dvdArray[i] != null && dvdArray[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 根据名称删除一张DVD。
     * <p>
     * 从控制台读取DVD名称，查找并删除对应DVD。
     * 删除时会将后续元素前移，保持数组连续。
     * 限制：不允许删除处于"已借出"状态（状态0）的DVD。
     */
    public void deleteDVD() {
        System.out.println("-->删除DVD");
        System.out.print("请输入DVD名称：");
        String name = scanner.nextLine();
        int index = findDVDIndexByName(name);
        if (index == -1) {
            System.out.println("未找到名为《" + name + "》的DVD，删除失败！");
            return;
        }
        if (dvdArray[index].getStatus() == 0) {
            System.out.println("《" + name + "》已被借出，无法删除！请先归还再删除。");
            return;
        }
        // 元素前移，dvdArray.length - 1 为最后一个元素的索引,i < dvdArray.length - 1 因为要访问i+1,保证不越界
        // 例如length=5,i=0,1,2,3,4;i<4,只能访问到i=3,dvaArray[3] = dvaArray[4]不越界;dvdArray[4] = dvdArray[5]越界
        for (int i = index; i < dvdArray.length - 1; i++) {
            // 将后续元素赋值给前一个元素，本质为连续覆盖
            dvdArray[i] = dvdArray[i + 1];
        }
        // 消除连续覆盖后最后位置重复的残留值
        dvdArray[dvdArray.length - 1] = null;

        System.out.println("删除《" + name + "》成功！");
    }

    /**
     * 校验日期字符串是否为合法的 yyyy-MM-dd 格式且是真实存在的日期。
     *
     * @param dateStr 待校验的日期字符串
     * @return {@code true} 格式正确且在有效日历范围内；{@code false} 非法日期
     */
    private boolean isValidDate(String dateStr) {
        if (dateStr == null || dateStr.trim().isEmpty()) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); // 严格模式，拒绝 2026-13-01 等非法日期
        try {
            sdf.parse(dateStr.trim());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * 借出一张DVD。
     * <p>
     * 从控制台读取DVD名称，将对应DVD状态置为 0（已借出），
     * 并记录当前日期作为借出日期。日期需通过格式与范围校验。
     */
    public void borrowDVD() {
        System.out.println("-->借出DVD");
        System.out.print("请输入DVD名称：");
        String name = scanner.nextLine();
        int index = findDVDIndexByName(name);
        if (index == -1) {
            System.out.println("未找到名为《" + name + "》的DVD，借出失败！");
            return;
        }
        if (dvdArray[index].getStatus() == 0) {
            System.out.println("《" + name + "》已被借出，无法再次借出！");
            return;
        }
        // 循环输入直到日期合法
        String borrowDate;
        while (true) {
            System.out.print("请输入借出日期（年-月-日）：");
            borrowDate = scanner.nextLine().trim();
            if (!isValidDate(borrowDate)) {
                System.out.println("日期格式错误或日期超出范围，请输入正确的日期（如 2026-06-11）！");
                continue;
            }
            break;
        }
        dvdArray[index].setStatus(0);
        dvdArray[index].setBorrowDate(borrowDate);  // 使用输入的日期
        System.out.println("借出《" + name + "》成功！借出日期：" + borrowDate);
    }

    /**
     * 计算两个日期之间的天数差。
     *
     * @param startDate 开始日期（格式：yyyy-MM-dd）
     * @param endDate   结束日期（格式：yyyy-MM-dd）
     * @return 天数差
     * @throws ParseException 日期格式错误时抛出
     */
    private long calculateDateDiff(String startDate, String endDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(startDate);
        Date d2 = sdf.parse(endDate);
        // 计算天数差：毫秒差 / (24小时 * 60分钟 * 60秒 * 1000毫秒)
        return (d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000);
    }

    /**
     * 计算租金。
     *
     * @param days 租赁天数
     * @return 租金金额
     */
    private double calculateRent(long days) {
        return days * DAILY_RENT;
    }

    /**
     * 归还一张DVD并计算租金。
     * <p>
     * 从控制台读取DVD名称和归还日期，计算租赁天数并生成租金。
     * <ul>
     *   <li>名称不存在 → 提示归还失败</li>
     *   <li>DVD未被借出 → 提示无法归还</li>
     *   <li>归还成功 → 状态改为1，清空借出日期，输出租借信息及租金</li>
     * </ul>
     */
    public void returnDVD() {
        System.out.println("-->归还DVD");
        System.out.print("请输入DVD名称：");
        String name = scanner.nextLine();
        // 1. 查找要归还的DVD
        int index = findDVDIndexByName(name);
        // 2. 判断DVD是否存在
        if (index == -1) {
            System.out.println("未找到名为《" + name + "》的DVD，归还失败！");
            return;
        }
        // 3. 判断是否已借出（状态为0表示已借出）
        if (dvdArray[index].getStatus() == 1) {
            System.out.println("《" + name + "》未被借出，无法归还！");
            return;
        }
        // 4. 获取借出日期
        String borrowDate = dvdArray[index].getBorrowDate();
        if (borrowDate == null || borrowDate.isEmpty()) {
            System.out.println("借出日期记录有误，无法计算租金！");
            return;
        }
        // 5. 循环输入归还日期直到合法
        String returnDate;
        while (true) {
            System.out.print("请输入归还日期（年-月-日）：");
            returnDate = scanner.nextLine().trim();
            if (!isValidDate(returnDate)) {
                System.out.println("日期格式错误或日期超出范围，请输入正确的日期（如 2026-06-11）！");
                continue;
            }
            try {
                // 6. 计算日期差
                long days = calculateDateDiff(borrowDate, returnDate);
                if (days < 0) {
                    System.out.println("归还日期不能早于借出日期（" + borrowDate + "），请重新输入！");
                    continue;
                }
                // 7. 计算租金
                double rent = calculateRent(days);
                // 8. 修改DVD状态
                dvdArray[index].setStatus(1);
                dvdArray[index].setBorrowDate("");
                // 9. 输出归还信息
                System.out.println("\n归还《" + name + "》成功！");
                System.out.println("借出日期为：" + borrowDate);
                System.out.println("归还日期为：" + returnDate);
                System.out.println("租赁天数：" + days + "天");
                System.out.println("应付租金（元）：" + (long)rent);
                break;
            } catch (ParseException e) {
                System.out.println("日期格式错误，请使用yyyy-MM-dd格式！");
            }
        }
    }
}