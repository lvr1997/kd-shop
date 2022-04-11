package com.lvr.kdshop.business.service;

import java.util.Collection;

public interface RoleService {

    Collection<? extends String> selectRolePermissionByUserId(String userId);

}
