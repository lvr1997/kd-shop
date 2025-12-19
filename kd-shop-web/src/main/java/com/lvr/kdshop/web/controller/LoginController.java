package com.lvr.kdshop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 登录
 */
@Controller
public class LoginController {

    /**
     * 登录验证
     * @param username
     * @param password
     * @param model
     * @param session
     * @return
     */
    @PostMapping("/admin/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session){
        //检查用户名和密码是否正确
        if("admin".equals(username) && "123456".equals(password)){
            //当用户名为admin且密码是123456的时候可以进入主页面
            session.setAttribute("LoginUser",username);
            return "redirect:/main.html";
        }else{
            //用户名或者密码错误的时候给出相应的错误提示,并且返回主页面
            model.addAttribute("msg","用户名或者密码输入错误");
            return "index";
        }
    }

    /**
     * 退出
     * @param request
     * @return
     */
    @RequestMapping("/admin/logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        //清除session，会清除session
//        session.invalidate();
        //也可以把用户登录的属性删除 也可以达到注销用户的功能
        session.removeAttribute("LoginUser");
        return "redirect:/index.html";
    }
}
