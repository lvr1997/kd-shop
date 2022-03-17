package com.lvr.kdshop.web.controller;

import com.lvr.kdshop.annotation.PassToken;
import com.lvr.kdshop.annotation.UserLoginToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
@RequestMapping("/")
public class PageController {

    @PassToken
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("viewPath", "login/login");
        model.addAttribute("view", "loginPage");
        return "index";
    }

    @PassToken
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("viewPath", "register/register");
        model.addAttribute("view", "registerPage");
        return "index";
    }

    //首页
    @PassToken
    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("viewPath", "home/home");
        model.addAttribute("view", "main");
        return "index";
    }

    //闲置列表页
    @PassToken
    @GetMapping("/product/list")
    public String productList(Model model) {
        model.addAttribute("viewPath", "product/list");
        model.addAttribute("view", "productList");
        return "index";
    }

    //闲置详情
    @PassToken
    @GetMapping("/product/detail/{productId}")
    public String productDetail(@PathVariable Integer productId, Model model) {
        model.addAttribute("viewPath", "product/detail");
        model.addAttribute("view", "detail");
        return "index";
    }

    //闲置发布页
//    @UserLoginToken
    @GetMapping("/product/publish")
    public String publish(Model model) {
        model.addAttribute("viewPath", "product/publish");
        model.addAttribute("view", "publish");
        return "index";
    }

    //小铺
//    @UserLoginToken
    @GetMapping("/shop")
    public String shop(Model model) {
        model.addAttribute("viewPath", "shop/my-shop");
        model.addAttribute("view", "shop");
        return "index";
    }

    @PassToken
    @GetMapping("/news/list")
    public String newsList(Model model) {
        model.addAttribute("viewPath", "news/list");
        model.addAttribute("view", "newsList");
        return "index";
    }

    @PassToken
    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("viewPath", "contact/contact");
        model.addAttribute("view", "contactUs");
        return "index";
    }

//    @UserLoginToken
    @GetMapping("/checkout")
    public String checkout(Model model){
        model.addAttribute("viewPath", "checkout/checkout");
        model.addAttribute("view", "checkout");
        return "index";
    }

//    @UserLoginToken
    @GetMapping("/wishlist")
    public String wishlist(Model model){
        model.addAttribute("viewPath", "wishlist/wishlist");
        model.addAttribute("view", "myWish");
        return "index";
    }
}
