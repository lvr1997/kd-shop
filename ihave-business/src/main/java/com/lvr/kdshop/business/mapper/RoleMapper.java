package com.lvr.ihave.business.mapper;

import com.lvr.ihave.pojo.Roles;

import java.util.List;

public interface RoleMapper {
    List<Roles> selectRolePermissionByUserId(String userId);
}
