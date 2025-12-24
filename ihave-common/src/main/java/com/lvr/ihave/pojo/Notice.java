package com.lvr.ihave.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {

    private Integer id;

    private Integer userId;

    private String createAt;

    private Byte status;

    private String context;

    private String imgUrl;

}