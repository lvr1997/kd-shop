package com.lvr.kdshop.business.service.impl;

import com.lvr.kdshop.business.mapper.UserMapper;
import com.lvr.kdshop.business.service.UserService;
import com.lvr.kdshop.ex.PhoneNotFoundException;
import com.lvr.kdshop.ex.UsernameTakenException;
import com.lvr.kdshop.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    public int deleteByPrimaryKey(String id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    public int insert(User record) {
        User user = userMapper.getUserByPhone(record.getPhone());
        if(user == null){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            record.setId(UUID.randomUUID().toString());
            record.setCreateAt(sdf.format(new Date()));
            return userMapper.insert(record);
        }else{
            throw new UsernameTakenException("手机号已注册");
        }
    }

    public User selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    public int updateLastLoginByPrimaryKey(User record) {
        return userMapper.updateLastLoginByPrimaryKey(record);
    }

    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    public User getUserByPhone(String phone) {
        User user = userMapper.getUserByPhone(phone);
        if(user == null){
            throw new PhoneNotFoundException("手机号未注册");
        }else{
            return user;
        }
    }

    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    public int updateGoodsNum(String id, Integer goodsNum) {
        return userMapper.updateGoodsNum(id,goodsNum);
    }

    public int updateImgUrl(String id, String url) {
        return userMapper.updateImgUrl(id,url);
    }

    @Override
    public Integer checkUserByPhone(String phone) {
        return userMapper.checkUserByPhone(phone);
    }

    @Override
    public int updatePasswordByPrimaryKey(String uid, String password) {
        return userMapper.updatePasswordByPrimaryKey(uid,password);
    }

    @Override
    public List<User> searchUserByNameOrPhone(String name, String phone) {
        return userMapper.searchUserByNameOrPhone(name,phone);
    }
}
