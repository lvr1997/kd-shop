package com.lvr.ihave.business.mapper;

import com.lvr.ihave.pojo.Roles;

import java.util.List;

public interface RoleMapper {
    
    /**
     * 获取所有角色列表
     * @return 角色列表
     */
    List<Roles> selectAllRoles();
}