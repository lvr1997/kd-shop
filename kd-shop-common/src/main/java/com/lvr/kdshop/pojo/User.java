package com.lvr.kdshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

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

    public String getPhone() {
        if(this.phone != null && this.phone != ""){
            this.phone = this.phone.replaceAll("(\\w{3})\\w*(\\w{4})", "$1****$2");
        }
        return this.phone;
    }

}