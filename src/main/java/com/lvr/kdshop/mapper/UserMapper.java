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

    @Select({"<script>",
                "select user.*, role.role_name as roleName from user ",
                "left join user_role on user.id=user_role.user_id ",
                "left join role on role.id=user_role.role_id ",
                "<when test='username != null'>",
                   "where username=#{username}",
                "</when>",
             "</script>"
            })
    List<UserVo> getUsersList(Page<?> page, @Param("username") String username);

}
