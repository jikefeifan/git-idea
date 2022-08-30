import com.lagou.domain.Dept;
import com.lagou.mapper.DeptMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: CXB
 * @ClassName: MybatisTest
 * @Date: 2022/8/27 19:31
 * @Description: //TODO Mybatis 测试
 * @Version: V1.0
 **/
public class MybatisTest {
    SqlSession sqlSession = null;

    @Before
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

        sqlSession = sqlSessionFactory.openSession(true); //自动提交事务
    }

    @Test
    public void testFindAll() throws IOException {
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);

        List<Dept> all = mapper.findAll();

        for (Dept dept : all) {
            System.out.println(dept);
        }

    }

    @Test
    public void saveTest() {
        for (int i=0;i<5;i++) {
            Dept dept = new Dept();
//        dept.setDeptId(2);
            dept.setDeptName("技術部");
            dept.setEmail("34678@163.com");
            dept.setMajorName("拉钩教育");
            dept.setTelephone("34561265484845");
            DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
            mapper.save(dept);
        }
//sqlSession.commit(); //事务提交
    }
@Test
public  void updateTest(){
    Dept dept = new Dept();
    dept.setDeptId(2);
    dept.setDeptName("技術部");
    dept.setEmail("34678@163.com");
    dept.setMajorName("拉钩教育");
    dept.setTelephone("34561265484845");
    DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
    mapper.update(dept);
    sqlSession.commit();
}
@Test
public  void findByIdTest(){
    DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
    Dept dept = mapper.findById(2);
    System.out.println(dept);
}
@Test
public void testDelete(){
    DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
    mapper.delete(11);
    }
    @Test
    public void testDeleteBatch(){
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        mapper.deleteBatch(new Integer[]{19,20});
    }
    @After
    public void after() {
        sqlSession.close();

    }


}


