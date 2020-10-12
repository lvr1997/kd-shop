package com.lvr.kdshop.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lvr.kdshop.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lvr.kdshop.entity.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
public interface UserMapper extends BaseMapper<User> {


    List<UserVo> getUsersList(Page<?> page, @Param("username") String username);

}
