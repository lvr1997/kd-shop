package com.lvr.ihave.business.service.impl;

import com.lvr.ihave.business.mapper.RoleMapper;
import com.lvr.ihave.business.service.RoleService;
import com.lvr.ihave.pojo.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Roles> getAllRoles() {
        return roleMapper.selectAllRoles();
    }
}