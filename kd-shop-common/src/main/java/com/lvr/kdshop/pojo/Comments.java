package com.lvr.kdshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comments {

    private Integer id;

    private String userId;

    private Integer goodsId;

    private String createAt;

    private String content;

}