package com.lagou;

import com.lagou.dao.ArticleDao;
import com.lagou.domain.Article;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: CXB
 * @ClassName: Test
 * @Date: 2022/8/26 0:36
 * @Description: //TODO
 * @Version: V1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class Test {
    @Autowired
    ArticleDao articleDao;
    @org.junit.Test
public void testFindAll(){
   /* ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    Object dataSource = classPathXmlApplicationContext.getBean("dataSource");
    System.out.println(dataSource);*/
    List<Article> all = articleDao.findAll();
    for (Article article : all) {
        System.out.println(article);
    }
}

}
