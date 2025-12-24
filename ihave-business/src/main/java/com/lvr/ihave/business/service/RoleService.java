package com.lvr.ihave.business.service;

import com.lvr.ihave.pojo.Roles;

import java.util.List;

public interface RoleService {
    
    /**
     * 获取所有角色列表
     * @return 角色列表
     */
    List<Roles> getAllRoles();
}