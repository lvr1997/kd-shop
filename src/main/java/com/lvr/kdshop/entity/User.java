package com.lvr.kdshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@Data
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", phone=" + phone +
        ", username=" + username +
        ", password=" + password +
        ", create_at=" + create_at +
        ", goods_num=" + goods_num +
        ", power=" + power +
        ", last_login=" + last_login +
        ", status=" + status +
        ", birthday=" + birthday +
        ", sex=" + sex +
        ", img_url=" + img_url +
        ", residence=" + residence +
        ", signature=" + signature +
        "}";
    }
}
