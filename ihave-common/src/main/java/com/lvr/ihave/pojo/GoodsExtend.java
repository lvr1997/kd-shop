package com.lvr.ihave.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GoodsExtend {
    private Goods good;
    private Image firstImage; //首页显示的商品主图
    private List<Image> images = new ArrayList<Image>();
}