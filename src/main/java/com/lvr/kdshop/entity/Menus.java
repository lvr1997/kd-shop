package com.lvr.kdshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lvr
 * @version 1.0 2020/5/18
 */
@Data
public class Menus extends Model<User> {

    private static final long serialVersionUID = -8159006179501509247L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer pid;
    private String menuName;
    private String menuPath;
    private String menuIcon;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
