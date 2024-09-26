package com.lvr.kdshop.business.service;

import com.lvr.kdshop.pojo.Roles;

import java.util.Collection;
import java.util.List;

public interface RoleService {

    List<Roles> findRolesByUserId();

}
