package cn.jbit.cms.dao.impl;

import cn.jbit.cms.dao.NewsDao;
import cn.jbit.cms.entity.News;
import cn.jbit.cms.util.BaseDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * SQL Server 新闻DAO实现类
 */
public class NewsDaoSQLServerImpl implements NewsDao {
    @Override
    public List<News> findAll() {
        List<News> newsList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = BaseDao.getConnection();
            String sql = "SELECT id, title, author, createTime, content FROM news";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                News news = new News();
                news.setId(rs.getInt("id"));
                news.setTitle(rs.getString("title"));
                news.setAuthor(rs.getString("author"));
                news.setCreateTime(rs.getTimestamp("createTime"));
                news.setContent(rs.getString("content"));
                newsList.add(news);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BaseDao.closeAll(conn, pstmt, rs);
        }
        return newsList;
    }
}
