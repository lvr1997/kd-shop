package com.lvr.kdshop.controller;

import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lvr.common.annotation.Log;
import com.lvr.common.core.controller.BaseController;
import com.lvr.common.core.domain.AjaxResult;
import com.lvr.common.enums.BusinessType;
import com.lvr.kdshop.domain.Wanted;
import com.lvr.kdshop.service.IWantedService;
import com.lvr.common.utils.poi.ExcelUtil;
import com.lvr.common.core.page.TableDataInfo;

/**
 * 闲置收藏Controller
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@RestController
@RequestMapping("/kdshop/wanted")
public class WantedController extends BaseController
{
    @Autowired
    private IWantedService wantedService;

    /**
     * 查询闲置收藏列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:wanted:list')")
    @GetMapping("/list")
    public TableDataInfo list(Wanted wanted)
    {
        startPage();
        List<Wanted> list = wantedService.selectWantedList(wanted);
        return getDataTable(list);
    }

    /**
     * 导出闲置收藏列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:wanted:export')")
    @Log(title = "闲置收藏", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Wanted wanted)
    {
        List<Wanted> list = wantedService.selectWantedList(wanted);
        ExcelUtil<Wanted> util = new ExcelUtil<Wanted>(Wanted.class);
        return util.exportExcel(list, "wanted");
    }

    /**
     * 获取闲置收藏详细信息
     */
    @PreAuthorize("@ss.hasPermi('kdshop:wanted:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wantedService.selectWantedById(id));
    }

    /**
     * 新增闲置收藏
     */
    @PreAuthorize("@ss.hasPermi('kdshop:wanted:add')")
    @Log(title = "闲置收藏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Wanted wanted)
    {
        return toAjax(wantedService.insertWanted(wanted));
    }

    /**
     * 修改闲置收藏
     */
    @PreAuthorize("@ss.hasPermi('kdshop:wanted:edit')")
    @Log(title = "闲置收藏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Wanted wanted)
    {
        return toAjax(wantedService.updateWanted(wanted));
    }

    /**
     * 删除闲置收藏
     */
    @PreAuthorize("@ss.hasPermi('kdshop:wanted:remove')")
    @Log(title = "闲置收藏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wantedService.deleteWantedByIds(ids));
    }
}
