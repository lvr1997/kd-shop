package com.lvr.kdshop.shiro;

import lombok.Data;

/**
 * 登录成功之后返回的一个用户信息的载体
 * @author lvr
 * @version 1.0 2020/5/30
 */
@Data
public class AccountProfile {

    private Integer id;
    private String username;
    private String img_url;

}
