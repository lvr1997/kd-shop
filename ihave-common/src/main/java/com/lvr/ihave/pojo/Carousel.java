package com.lvr.ihave.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carousel {

    private Integer id;

    private String title;

    private String createAt;

    private Byte status;

    private String descript;

    private String imgUrl;

}