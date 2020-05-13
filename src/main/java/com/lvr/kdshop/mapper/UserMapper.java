package com.lvr.kdshop.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lvr.kdshop.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lvr.kdshop.util.MyPage;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 查询： 根据state状态查询商品列表，分页显示
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param status 状态
     * @return分页对象
     */
    MyPage<User> selectUserByPage(Page<?> page, Integer status);
}
