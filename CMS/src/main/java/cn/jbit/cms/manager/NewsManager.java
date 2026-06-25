package cn.jbit.cms.manager;

import cn.jbit.cms.dao.NewsDao;
import cn.jbit.cms.dao.impl.NewsDaoSQLServerImpl;
import cn.jbit.cms.entity.News;
import cn.jbit.cms.util.FileIO;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * 新闻业务管理类
 */
public class NewsManager {
    private NewsDao newsDao = new NewsDaoSQLServerImpl();
    private static final String TEMPLATE_PATH =
            "src/main/resources/news.template";
    /**
     * 生成所有新闻的HTML文件
     */
    public void generateHtmlFiles() {
        // 1. 从数据库获取所有新闻
        List<News> newsList = newsDao.findAll();
        // 2. 读取模板文件（GBK编码）
        String template = FileIO.readFile(TEMPLATE_PATH, "GBK");
        // 3. 遍历新闻，替换占位符，生成HTML文件
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (News news : newsList) {
            String html = template
                    .replace("{title}", news.getTitle())
                    .replace("{author}", news.getAuthor())
                    .replace("{createTime}", sdf.format(news.getCreateTime()))
                    .replace("{content}", news.getContent());
            // 4. 写入HTML文件（以新闻标题或ID命名）
            String fileName = "news_" + news.getId() + ".html";
            FileIO.writeFile(fileName, html);
            System.out.println("生成文件：" + fileName);
        }
        System.out.println("共生成 " + newsList.size() + " 个HTML文件。");
    }
}
