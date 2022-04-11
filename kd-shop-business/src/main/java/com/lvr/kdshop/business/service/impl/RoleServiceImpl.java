package com.lvr.kdshop.business.service.impl;

import com.lvr.kdshop.business.mapper.RoleMapper;
import com.lvr.kdshop.business.service.RoleService;
import com.lvr.kdshop.pojo.Roles;
import com.lvr.kdshop.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Collection<? extends String> selectRolePermissionByUserId(String userId) {
        List<Roles> perms = roleMapper.selectRolePermissionByUserId(userId);
        Set<String> permsSet = new HashSet<>();
        for (Roles perm : perms)
        {
            if (StringUtils.isNotNull(perm))
            {
                permsSet.addAll(Arrays.asList(perm.getRoleId().trim().split(",")));
            }
        }
        return permsSet;
    }
}
