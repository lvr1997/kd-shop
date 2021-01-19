package com.lvr.kdshop.controller;

import com.alibaba.fastjson.JSONObject;
import com.lvr.common.core.controller.BaseController;
import com.lvr.common.core.domain.AjaxResult;
import com.lvr.common.utils.StringUtils;
import com.lvr.kdshop.domain.*;
import com.lvr.kdshop.service.ICarouselService;
import com.lvr.kdshop.service.ICatelogService;
import com.lvr.kdshop.service.IGoodsService;
import com.lvr.kdshop.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取科大商铺首页信息
 *
 * @author lvr1997
 * @date 2021/1/5
 */
@RestController
@RequestMapping("/")
public class HomeController extends BaseController {

    @Autowired
    private IGoodsService goodsService;

    @Autowired
    private ICatelogService catelogService;

    @Autowired
    private ICarouselService carouselService;

    @Autowired
    private IImageService imageService;

    @RequestMapping(value = "/getIndexData")
    public AjaxResult getIndexData(@RequestBody(required = false) Goods good) {
        // 第一次请求时不传参数，会报错，这里做下判断
        // 查询商品状态为 1 的
        Goods goods = null;
        if(good == null) {
            goods = new Goods();
            goods.setStatus(1);
        } else {
            good.setStatus(1);
        }
        // 查询分类状态为1的
        Catelog catelog = new Catelog();
        catelog.setStatus(1);
        // 查询轮播图状态为1的
        Carousel carousel = new Carousel();
        carousel.setStatus(1);
        // 根据条件查询闲置物品
        List<Goods> goodsList = goodsService.selectGoodsList(good == null ? goods: good);
        // 存放闲置物品和图片的集合
        List<GoodAndImage> goodAndImages = new ArrayList<>();
        // 根据闲置物品id获取对应图片信息
        for (Goods g : goodsList) {
            List<Image> goodImages = imageService.selectImagesByGoodId(g.getId());
            GoodAndImage goodAndImage = new GoodAndImage();
            goodAndImage.setGood(g);
            goodAndImage.setImages(goodImages);
            goodAndImages.add(goodAndImage);
        }
        // 查询闲置分类
        List<Catelog> catelogList = catelogService.selectCatelogList(catelog);
        // 查询首页轮播图
        List<Carousel> carouselList = carouselService.selectCarouselList(carousel);

        Map<String, Object> resultMap = new HashMap();
        // 把闲置物品和图片的集合统一返回给前端
        resultMap.put("goods", goodAndImages);
        resultMap.put("catelog", catelogList);
        resultMap.put("carousel", carouselList);

        return AjaxResult.success("请求成功", resultMap);
    }

}
