package com.lvr.kdshop.service.impl;

/**
 * @author lvr
 * @version 1.0 2020/5/18
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lvr.kdshop.entity.Menus;
import com.lvr.kdshop.entity.vo.MenusVo;
import com.lvr.kdshop.mapper.MenusMapper;
import com.lvr.kdshop.service.IMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenusServiceImpl extends ServiceImpl<MenusMapper, Menus> implements IMenusService {

    @Autowired
    private MenusMapper menusMapper;

    @Override
    public List<Menus> getMenusByPid(Integer pid) {
        return menusMapper.getMenusByPid(pid);
    }

}
