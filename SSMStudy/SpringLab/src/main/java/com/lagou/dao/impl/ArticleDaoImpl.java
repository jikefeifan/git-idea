package com.lagou.dao.impl;

import com.lagou.dao.ArticleDao;
import com.lagou.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: CXB
 * @ClassName: ArticleDaoImpl
 * @Date: 2022/8/26 22:49
 * @Description: //TODO
 * @Version: V1.0
 **/
@Repository
public class ArticleDaoImpl implements ArticleDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public List<Article> findAll() {
        String sql = "select * from t_article";
        List<Article> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Article>(Article.class));
        return list;
    }
}
