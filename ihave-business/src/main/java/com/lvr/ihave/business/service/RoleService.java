package com.lvr.ihave.business.service;

import com.lvr.ihave.pojo.Roles;

import java.util.Collection;
import java.util.List;

public interface RoleService {

    List<Roles> findRolesByUserId();

}
