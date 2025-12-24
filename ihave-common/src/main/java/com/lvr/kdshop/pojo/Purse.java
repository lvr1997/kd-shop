package com.lvr.kdshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Purse {
    private Integer id;
    private String userId;
    private Double balance;
    private byte state;
}
