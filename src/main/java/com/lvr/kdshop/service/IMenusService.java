package com.lvr.kdshop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lvr.kdshop.entity.Menus;
import com.lvr.kdshop.entity.vo.MenusVo;

import java.util.List;

/**
 * @author lvr
 * @version 1.0 2020/5/18
 */
public interface IMenusService extends IService<Menus> {

    /**
     * 根据父id查询子菜单
     * @param pid
     * @return
     */
    List<Menus> getMenusByPid(Integer pid);

}
