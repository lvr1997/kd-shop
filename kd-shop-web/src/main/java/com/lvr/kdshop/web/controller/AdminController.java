package com.lvr.kdshop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("msg", "Hello 欢迎回来");
        return "/index";
    }
}
