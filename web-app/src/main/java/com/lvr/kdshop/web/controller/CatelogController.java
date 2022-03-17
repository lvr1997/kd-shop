package com.lvr.kdshop.web.controller;

import com.lvr.kdshop.annotation.UserLoginToken;
import com.lvr.kdshop.business.service.CatelogService;
import com.lvr.kdshop.constant.Constant;
import com.lvr.kdshop.util.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.HashMap;

@Controller
@RequestMapping("/category")
public class CatelogController {

    @Resource
    private CatelogService catelogService;

    @UserLoginToken
    @GetMapping(value = "/list")
    public JSONResult publish(){

        //用户登陆后，将分类信息获取出来
        HashMap<Integer,String> categoryOptions = catelogService.getAllCatelogWithOptions();
        //返回分类信息
        return JSONResult.success(Constant.SUCCESS_DATA, categoryOptions);
    }
}
