package cn.jbit.cms.dao;

import cn.jbit.cms.entity.News;
import java.util.List;

/**
 * 新闻数据访问接口
 */
public interface NewsDao {
    /**
     * 查询所有新闻
     */
    List<News> findAll();
}
