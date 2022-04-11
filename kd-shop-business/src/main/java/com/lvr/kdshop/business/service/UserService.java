package com.lvr.kdshop.business.service;


import com.lvr.kdshop.pojo.SysUser;

import java.util.List;

public interface UserService {

    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(String id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);

    int updateLastLoginByPrimaryKey(SysUser record);

    int updateByPrimaryKeySelective(SysUser record);

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    public SysUser selectUserByUserName(String userName);

    SysUser getUserByPhone(String phone);

    List<SysUser> getUserList();

    int updateImgUrl(String id, String url);

    Integer checkUserByPhone(String phone);

    int updatePasswordByPrimaryKey(String uid, String password);

    List<SysUser> searchUserByNameOrPhone(String name, String phone);
}
