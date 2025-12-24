package com.lvr.kdshop.business.mapper;

import com.lvr.kdshop.pojo.Roles;

import java.util.List;

public interface RoleMapper {
    List<Roles> selectRolePermissionByUserId(String userId);
}
