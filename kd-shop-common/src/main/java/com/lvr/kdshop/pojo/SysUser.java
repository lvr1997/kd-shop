package com.lvr.kdshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {

    private Integer id;

    private String userId;

    private String phone;

    private String username;

    private String password;

    private String createAt;

    private String lastLogin;

    private Byte status;

    private String birthday;

    private String sex;

    private String imgUrl;

    private String residence;

    private String signature;

    private String roleId;

    /** 角色对象 */
    private List<Roles> roles;

    public SysUser(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public String getPhone() {
        if(this.phone != null && this.phone != ""){
            this.phone = this.phone.replaceAll("(\\w{3})\\w*(\\w{4})", "$1****$2");
        }
        return this.phone;
    }

}