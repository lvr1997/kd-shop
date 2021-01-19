package com.lvr.kdshop.domain;

import lombok.Data;

import java.util.List;

@Data
public class GoodAndImage {

    private Goods good;
    private List<Image> images;

}
