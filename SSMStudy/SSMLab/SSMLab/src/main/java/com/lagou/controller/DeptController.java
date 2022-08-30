package com.lagou.controller;

import com.lagou.domain.Dept;
import com.lagou.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: CXB
 * @ClassName: DeptController
 * @Date: 2022/8/27 21:18
 * @Description: //TODO
 * @Version: V1.0
 **/
@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptService deptService;


    @GetMapping("/list")
    public String getAll(Model model){
        List<Dept> list = deptService.findAll();
        model.addAttribute("list",list);
        System.out.println(list);
        return "list";
    }
    @RequestMapping("/delete")
    public  String delete(Integer id){
        deptService.delete(id);
        return "list";
    }
    @RequestMapping(value = "/deleteBatch",method = RequestMethod.POST)
    public  String deleteBatch(Integer[] ids){
        deptService.deleteBatch(ids);
        return "redirect:/dept/list";
    }
}
