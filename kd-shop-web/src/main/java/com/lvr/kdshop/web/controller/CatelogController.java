package com.lvr.kdshop.web.controller;

import com.lvr.kdshop.annotation.UserLoginToken;
import com.lvr.kdshop.business.service.CatelogService;
import com.lvr.kdshop.constant.Constant;
import com.lvr.kdshop.pojo.Catelog;
import com.lvr.kdshop.util.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;

@Controller
@RequestMapping("/category")
public class CatelogController {

    @Resource
    private CatelogService catelogService;

    @RequestMapping("/list")
    public String list(Model model){
//        Collection<Catelog> employees = employeeDao.getEmployees();
//        model.addAttribute("emps",employees);
        return "category/list";
    }

    //get请求走这个添加方法
    @GetMapping("/add")
    public String toAdd(Model model){
        //查询部门列表
        //跳转到表单页面
        return "category/add";
    }

    //post请求走这个方法
    @PostMapping("/add")
    public String add(Catelog catelog){
//        employeeDao.save(employee);
        return "redirect:/category/list";
    }

    @GetMapping("/{id}")
    public String toEdit(@PathVariable("id") Integer id, Model model){
//        Employee employee = employeeDao.getEmployeeById(id);
        //查询部门列表
//        Collection<Department> departments = departmentDao.getDepartments();
//        model.addAttribute("depts",departments);
//        model.addAttribute("emp",employee);
        //转向编辑页面
        return "category/edit";
    }

    @PostMapping("/{id}")
    public String edit(@PathVariable("id") Integer id, Catelog catelog){
        //给employee设置id
//        employee.setId(id);
        //进行dao层的修改操作
//        employeeDao.updateEmployee(employee);
        return "redirect:/category/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
//        employeeDao.deleteEmployee(id);
        return "redirect:/category/list";
    }

//    @ResponseBody
//    @GetMapping(value = "/list")
//    public JSONResult publish(){
//
//        //用户登陆后，将分类信息获取出来
//        HashMap<Integer,String> categoryOptions = catelogService.getAllCatelogWithOptions();
//        //返回分类信息
//        return JSONResult.success(Constant.SUCCESS_DATA, categoryOptions);
//    }
}
