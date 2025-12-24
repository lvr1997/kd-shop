package com.lvr.ihave.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    private Integer id;
    private Integer type;
    private Integer goodId;
    private String userId;
    private String content;
    private Byte status;
}
