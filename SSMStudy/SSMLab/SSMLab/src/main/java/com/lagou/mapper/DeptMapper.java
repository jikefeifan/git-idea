package com.lagou.mapper;

import com.lagou.domain.Dept;

import java.util.List;

/**
* @author CXB
* @description 针对表【dept】的数据库操作Mapper
* @createDate 2022-08-27 18:27:10
* @Entity com.lagou.domain.Dept
*/
public interface DeptMapper  {
    List<Dept> findAll();
    void save( Dept dept);
    Dept findById( int id);
    void update(Dept dept);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}

