package org;

public class TestDVDMgr {
    public static void main(String[] args) {
        DVDMgr mgr = new DVDMgr();

        // 初始化DVD
        mgr.initial();

        // 添加 DVD
        mgr.addDVD();
        mgr.addDVD();

        // 查看所有 DVD
        mgr.searchDVD();

        // 删除 DVD
        mgr.deleteDVD();

        // 借出 DVD
        mgr.borrowDVD();

        // 再次查看
        mgr.searchDVD();

        // 归还 DVD
        mgr.returnDVD();

        // 最后查看
        mgr.searchDVD();
    }
}