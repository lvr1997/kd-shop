package com.lvr.kdshop.web.controller;

import com.lvr.kdshop.business.service.CategoryService;
import com.lvr.kdshop.business.utils.PageRequest;
import com.lvr.kdshop.business.utils.PageResult;
import com.lvr.kdshop.pojo.Catelog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "keyword",required = false) String keyword, 
                        @RequestParam(value = "pageNum",required = false, defaultValue = "1") Integer pageNum,
                        @RequestParam(value = "pageSize",required = false, defaultValue = "10") Integer pageSize,
     Model model){
        PageRequest pageRequest = new PageRequest(pageNum, pageSize);
        PageResult catelogs = categoryService.findPage(keyword, pageRequest);
        model.addAttribute("list",catelogs);
        return "category/list";
    }

    //get请求走这个添加方法
    @GetMapping("/add")
    public String toAdd(Model model){
        //跳转到表单页面
        return "category/add";
    }

    //post请求走这个方法
    @PostMapping("/add")
    public String add(Catelog catelog){
        categoryService.insert(catelog);
        return "redirect:/category/list";
    }

    @GetMapping("/{id}")
    public String toEdit(@PathVariable("id") Integer id, Model model){
        //根据id查询分类信息
        Catelog catelog = categoryService.selectByPrimaryKey(id);
        //将分类信息添加到模型中
        model.addAttribute("catelog",catelog);
        //转向编辑页面
        return "category/edit";
    }

    @PostMapping("/{id}")
    public String edit(@PathVariable("id") Integer id, Catelog catelog){
        //给分类设置id
        catelog.setId(id);
        //进行dao层的修改操作
        categoryService.updateByPrimaryKey(catelog); 
        return "redirect:/category/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        categoryService.deleteByPrimaryKey(id);
        return "redirect:/category/list";
    }
}