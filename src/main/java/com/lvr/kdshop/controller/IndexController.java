package com.lvr.kdshop.controller;

import com.lvr.kdshop.entity.Carousel;
import com.lvr.kdshop.entity.Catelog;
import com.lvr.kdshop.entity.Goods;
import com.lvr.kdshop.service.ICarouselService;
import com.lvr.kdshop.service.ICatelogService;
import com.lvr.kdshop.service.IGoodsService;
import com.lvr.kdshop.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    IGoodsService goodsService;

    @Autowired
    ICatelogService iCatelogService;

    @Autowired
    ICarouselService iCarouselService;

    @ResponseBody
    @RequestMapping("/getIndexData")
    public JSONResult getIndexData(){

        Map map = new HashMap<>();
        List<Goods> goods = goodsService.list();
        List<Catelog> catelogs = iCatelogService.list();
        List<Carousel> carousels = iCarouselService.list();

        map.put("goods", goods);
        map.put("catelogs", catelogs);
        map.put("carousels", carousels);

        return JSONResult.success(map);
    }
}
