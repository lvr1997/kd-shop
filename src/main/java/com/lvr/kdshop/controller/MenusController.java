package com.lvr.kdshop.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lvr.kdshop.entity.Menus;
import com.lvr.kdshop.entity.vo.MenusVo;
import com.lvr.kdshop.service.IMenusService;
import com.lvr.kdshop.util.JSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lvr
 * @version 1.0 2020/5/18
 */
@RestController
@RequestMapping("/menus")
public class MenusController {

    @Resource
    private IMenusService menusService;

    /**
     * 获取左侧菜单
     * @return
     */
    @RequestMapping("/list")
    public JSONResult getMenusList() {
        JSONResult result = new JSONResult();

        //根据用户id查询左侧菜单权限
        // user user_role role 查询出当前用户有哪些角色
        // + menus + role_menus 查询出当前用户可以查看的菜单
        //查询一级菜单
        List<Menus> menusLevel1 = menusService.getMenusByPid(0);
        List<MenusVo> menus = new ArrayList<>();
        //根据一级菜单的id查询对应的二级菜单
        for (int i = 0; i < menusLevel1.size(); i++) {
            Integer parentId = menusLevel1.get(i).getId();
            List<Menus> menusLevel2 = menusService.getMenusByPid(parentId);
            Menus menu = menusLevel1.get(i);
            MenusVo menusVo = new MenusVo();
            menusVo.setId(menu.getId());
            menusVo.setPid(menu.getPid());
            menusVo.setMenuName(menu.getMenuName());
            menusVo.setMenuPath(menu.getMenuPath());
            menusVo.setMenuIcon(menu.getMenuIcon());
            menusVo.setChildren(menusLevel2);
            menus.add(menusVo);
        }

        result.setCode("200");
        result.setMessage("请求菜单数据成功");
        result.setData(menus);

        return result;
    }

}
