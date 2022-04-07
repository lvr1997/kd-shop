package com.lvr.kdshop.web.controller;

import com.lvr.kdshop.annotation.PassToken;
import com.lvr.kdshop.business.service.*;
import com.lvr.kdshop.constant.Constant;
import com.lvr.kdshop.pojo.*;
import com.lvr.kdshop.util.JSONResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/good")
public class GoodsController {
    @Resource
    private WantedService wantedService;

    @Resource
    private GoodsService goodsService;

    @Resource
    private ImageService imageService;

    @Resource
    private CatelogService catelogService;

    @Resource
    private UserService userService;

    /**
     * 根据商品id查询该商品详细信息
     * @param goodId
     * @return
     * @throws Exception
     */
    @PassToken
    @GetMapping(value = "/detail")
    public JSONResult getGoodsById(@RequestParam("goodId") Integer goodId,
                                   @RequestParam(value = "userId") String userId) throws Exception {
        Random random = new Random();

        //判断当前商品是否被当前登入用户收藏
        Wanted wanted = null;
        if(userId!=null && userId != ""){
            wanted = wantedService.selectWant(userId,goodId);
        }

        //找出当前闲置
        Goods goodsFind = goodsService.selectByPrimaryKey(goodId);
        goodsService.updateViewCountByPrimaryKey(goodId,goodsFind.getViewCount()+1);
        Goods goods = goodsService.selectByPrimaryKey(goodId);
        //找出当前商品的用户信息
        SysUser seller = userService.selectByPrimaryKey(goods.getUserId());
        //找出分类信息
        Catelog catelog = catelogService.selectByPrimaryKey(goods.getCatelogId());
        //找到闲置对应的图片信息
        GoodsExtend goodsExtend = new GoodsExtend();
        List<Image> imageList = imageService.selectByGoodsPrimaryKey(goodId);
        goodsExtend.setGood(goods);
        goodsExtend.setImages(imageList);
        //返回数据
        Map<String, Object> resultMap = new HashMap<>();

        resultMap.put("good", goodsExtend);
        resultMap.put("wanted",wanted);
        resultMap.put("seller", seller);
        resultMap.put("catelog", catelog);

        return JSONResult.success(Constant.SUCCESS_DATA, resultMap);
    }

}
