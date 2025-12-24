package com.lvr.ihave.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Catelog {

    private Integer id;

    private String name;

    private Byte status;

}