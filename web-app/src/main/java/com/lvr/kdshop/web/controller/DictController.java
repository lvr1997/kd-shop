package com.lvr.kdshop.web.controller;

import com.lvr.kdshop.annotation.PassToken;
import com.lvr.kdshop.business.service.DictService;

import com.lvr.kdshop.util.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/dict")
public class DictController {
	@Resource
	private DictService dictService;
	

}









