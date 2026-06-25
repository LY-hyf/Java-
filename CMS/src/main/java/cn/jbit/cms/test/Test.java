package cn.jbit.cms.test;

import cn.jbit.cms.manager.NewsManager;

/**
 * 测试类：生成新闻静态页面
 */
public class Test {
    public static void main(String[] args) {
        NewsManager manager = new NewsManager();
        manager.generateHtmlFiles();
    }
}
