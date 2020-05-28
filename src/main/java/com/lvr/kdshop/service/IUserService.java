package com.lvr.kdshop.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lvr.kdshop.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lvr.kdshop.entity.vo.UserVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
public interface IUserService extends IService<User> {

    Page<UserVo> getUsersList(Page<UserVo> page, String username);

}
