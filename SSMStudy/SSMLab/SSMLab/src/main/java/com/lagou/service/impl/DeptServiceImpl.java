package com.lagou.service.impl;

import com.lagou.domain.Dept;
import com.lagou.mapper.DeptMapper;
import com.lagou.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author CXB
 * @description 针对表【dept】的数据库操作Service实现
 * @createDate 2022-08-27 18:27:10
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper mapper;

    public List<Dept> findAll() {
        return mapper.findAll();
    }

    public void save(Dept dept) {
        mapper.save(dept);
    }

    public Dept findById(int id) {
        return mapper.findById(id);
    }

    public void update(Dept dept) {
        mapper.update(dept);
    }

    @Override
    public void delete(Integer id) {
        mapper.delete(id);
    }

    @Override
    public void deleteBatch(Integer[] ids) {
        mapper.deleteBatch(ids);
    }
}
