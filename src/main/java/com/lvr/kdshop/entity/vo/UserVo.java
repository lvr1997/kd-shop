package com.lvr.kdshop.entity.vo;

import com.lvr.kdshop.entity.Role;
import lombok.Data;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Administrator
 * @date: 2020/5/27
 */
@Data
public class UserVo {

    private Integer id;

    private String phone;

    private String username;

    private String password;

    private String create_at;

    private Integer goods_num;

    private Integer power;

    private String last_login;

    private Integer status;

    private String birthday;

    private String sex;

    private String img_url;

    private String residence;

    private String signature;

    private String roleName;

    private List<Role> roles;

}
