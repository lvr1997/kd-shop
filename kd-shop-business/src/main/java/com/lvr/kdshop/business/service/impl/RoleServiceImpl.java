package com.lvr.kdshop.business.service.impl;

import com.lvr.kdshop.business.mapper.RoleMapper;
import com.lvr.kdshop.business.service.RoleService;
import com.lvr.kdshop.pojo.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Roles> findRolesByUserId() {
        return null;
    }
}
