package com.lvr.kdshop.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lvr.kdshop.entity.User;
import com.lvr.kdshop.service.IUserService;
import com.lvr.kdshop.util.JSONResult;
import com.lvr.kdshop.util.MD5;
import com.lvr.kdshop.util.TokenUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public JSONObject login(@RequestBody String params, HttpServletRequest request) {
        //用来返回结果的jsonObject对象
        JSONObject result = new JSONObject();
        if(StringUtils.isNotBlank(params)) {
            //获取用户名密码
            JSONObject obj = JSON.parseObject(params);
            String userName = obj.getString("userName");
            String password = obj.getString("password");

            //根据用户名密码查询用户
            QueryWrapper queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username", userName);
            queryWrapper.eq("password", MD5.md5(password));
            User user = userService.getOne(queryWrapper);

            //验证用户
            if(user != null) {
                //如果用户存在就生成token并将用户信息和token一起返回给前台
                String token = TokenUtil.sign(user);
                result.put("user", user);
                result.put("token", token);
                result.put("message", "登录成功！");
            } else {
                result.put("message", "登录失败，用户名或密码错误！");
            }

        } else {
            result.put("message", "参数不可以为空！");
        }

        return result;
    }

    /**
     * 查找用户接口
     * @param params
     * @return
     */
    @RequestMapping("/findUsers")
    public JSONResult selectUserByPage(@RequestBody String params) {
        JSONResult result=new JSONResult();
        if(StringUtils.isNotBlank(params)) {
            JSONObject obj = JSON.parseObject(params);
            Integer pageNum = obj.getInteger("pageNum");
            Integer pageSize = obj.getInteger("pageSize");
            String userName = obj.getString("userName");
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("username", userName);
            IPage<User> page = userService.page(new Page<>(pageNum, pageSize), queryWrapper);
            result.setData(page);
            result.setMessage("请求成功");
            result.setCode("200");

        }
        return result;
    }

}

