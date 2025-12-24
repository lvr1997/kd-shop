package com.lvr.ihave.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles {

    private Integer id;
    private String roleId;
    private String roleName;
    private String commet;
    private String createDate;

}
