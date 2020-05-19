package com.lvr.kdshop.entity.vo;

import com.lvr.kdshop.entity.Menus;
import lombok.Data;

import java.util.List;

/**
 * @author lvr
 * @version 1.0 2020/5/18
 */
@Data
public class MenusVo extends Menus {

    private Integer id;
    private Integer pid;
    private String menuName;
    private String menuPath;
    private String menuIcon;
    private List children;

}
