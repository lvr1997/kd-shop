package com.lvr.kdshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles {

    private Integer id;
    private String roleId;
    private String roleName;
    private String commet;
    private LocalDateTime createDate;

}
