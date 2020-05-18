package com.lvr.kdshop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lvr.kdshop.entity.Menus;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lvr
 * @version 1.0 2020/5/18
 */
public interface MenusMapper extends BaseMapper<Menus> {
    List<Menus> getMenusByPid(Integer pid);
}
