package com.lagou.dao;

import com.lagou.domain.Article;

import java.util.List;

/**
 * @Author: CXB
 * @ClassName: ArticleDao
 * @Date: 2022/8/26 22:45
 * @Description: //TODO
 * @Version: V1.0
 **/
public interface ArticleDao {
    List<Article> findAll();
}
