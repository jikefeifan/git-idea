package com.lagou;

import com.lagou.domain.Article;
import com.lagou.mapper.ArticleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: CXB
 * @ClassName: Test
 * @Date: 2022/8/26 0:36
 * @Description: //TODO
 * @Version: V1.0
 **/

public class Test {
    @org.junit.Test
    public void testArticle() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ArticleMapper mapper = sqlSession.getMapper(ArticleMapper.class);
        List<Article> allArtics = mapper.getAllArtics();
        for (Article artic : allArtics) {
            artic.getComments();
            System.out.println(artic);
        }
        sqlSession.close();
    }

}
