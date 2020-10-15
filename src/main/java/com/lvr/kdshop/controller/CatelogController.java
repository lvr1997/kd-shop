package com.lvr.kdshop.controller;


import com.lvr.kdshop.entity.Catelog;
import com.lvr.kdshop.service.ICatelogService;
import com.lvr.kdshop.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@Controller
@RequestMapping("/catelog")
public class CatelogController {

    @Autowired
    ICatelogService catelogService;

    @ResponseBody
    @GetMapping("/catelogList")
    public JSONResult catlog(){

        List<Catelog> catelogList = catelogService.list();
        return JSONResult.success(catelogList);
    }
}

