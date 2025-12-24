package com.lvr.ihave.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    private Integer id;

    private String orderId;

    private String userId;

    private Integer sellerId;

    private Integer goodId;

    private String address;

    private String payId;

    private String createAt;

    private Byte status;

}