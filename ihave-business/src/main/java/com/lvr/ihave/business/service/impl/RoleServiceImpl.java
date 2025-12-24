package com.lvr.ihave.business.service.impl;

import com.lvr.ihave.business.mapper.RoleMapper;
import com.lvr.ihave.business.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

}