package com.lvr.kdshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdersExtend {
    private Goods good;
    private Orders orders;
    private List<Image> images;
    private User user;

}
