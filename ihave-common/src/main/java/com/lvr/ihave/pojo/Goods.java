package com.lvr.ihave.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {
    private Integer id;

    private Integer catelogId;

    private String userId;

    private String name;

    private Float price;

    private Float realPrice;

    private String startTime;

    private String polishTime;

    private String endTime;

    private String firstImage;

    private String phoneNumber;

    private String goodBuyMethod;

    private String goodAddress;

    private Integer viewCount;

    private String describle;

    private Byte status;

    private String sellerNote;

}