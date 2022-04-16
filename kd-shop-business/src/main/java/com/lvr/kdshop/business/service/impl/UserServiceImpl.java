package com.lvr.kdshop.business.service.impl;

import com.lvr.kdshop.business.mapper.UserMapper;
import com.lvr.kdshop.business.service.UserService;
import com.lvr.kdshop.ex.PhoneNotFoundException;
import com.lvr.kdshop.ex.UsernameTakenException;
import com.lvr.kdshop.pojo.Roles;
import com.lvr.kdshop.pojo.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Resource
    private UserMapper userMapper;


    public int deleteByPrimaryKey(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysUser record) {
        SysUser user = userMapper.getUserByPhone(record.getPhone());
        if(user == null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            record.setUserId(UUID.randomUUID().toString());
            record.setCreateAt(sdf.format(new Date()));
            return userMapper.insert(record);
        }else{
            throw new UsernameTakenException("手机号已注册");
        }
    }

    public SysUser selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<SysUser> selectAll() {
        return userMapper.selectAll();
    }

    public int updateByPrimaryKey(SysUser record) {
        return userMapper.updateByPrimaryKey(record);
    }

    public int updateLastLoginByPrimaryKey(SysUser record) {
        return userMapper.updateLastLoginByPrimaryKey(record);
    }

    public int updateByPrimaryKeySelective(SysUser record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public SysUser selectUserByUserName(String userName) {
        return userMapper.selectUserByUserName(userName);
    }

    public SysUser getUserByPhone(String phone) {
        SysUser user = userMapper.getUserByPhone(phone);
        if(user == null){
            throw new PhoneNotFoundException("手机号未注册");
        }else{
            return user;
        }
    }

    public List<SysUser> getUserList() {
        return userMapper.getUserList();
    }

    public int updateImgUrl(String id, String url) {
        return userMapper.updateImgUrl(id,url);
    }

    @Override
    public Integer checkUserByPhone(String phone) {
        return userMapper.checkUserByPhone(phone);
    }

    @Override
    public int updatePasswordByPrimaryKey(Integer uid, String password) {
        return userMapper.updatePasswordByPrimaryKey(uid,password);
    }

    @Override
    public List<SysUser> searchUserByNameOrPhone(String name, String phone) {
        return userMapper.searchUserByNameOrPhone(name,phone);
    }

    @Override
    public UserDetails loadUserByUsername(String userPhone) throws UsernameNotFoundException {
        //user即为查询结果
        SysUser user=userMapper.getUserByPhone(userPhone);
        if(user==null){
            throw new UsernameNotFoundException("用户名错误！！");
        }
        //获取用户权限，并把其添加到GrantedAuthority中
        List<GrantedAuthority> grantedAuthorities=new ArrayList<>();
        List<Roles> userRoles =  user.getRoles();
        GrantedAuthority grantedAuthority;
        for(Roles role : userRoles){
            grantedAuthority=new SimpleGrantedAuthority(role.getRoleId());
            grantedAuthorities.add(grantedAuthority);
        }
        return new org.springframework.security.core.userdetails.User(userPhone,user.getPassword(),grantedAuthorities);
    }

}
