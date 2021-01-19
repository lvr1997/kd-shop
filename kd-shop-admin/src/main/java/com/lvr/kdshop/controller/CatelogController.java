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
import com.lvr.kdshop.domain.Catelog;
import com.lvr.kdshop.service.ICatelogService;
import com.lvr.common.utils.poi.ExcelUtil;
import com.lvr.common.core.page.TableDataInfo;

/**
 * 闲置分类Controller
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@RestController
@RequestMapping("/kdshop/catelog")
public class CatelogController extends BaseController
{
    @Autowired
    private ICatelogService catelogService;

    /**
     * 查询闲置分类列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:catelog:list')")
    @GetMapping("/list")
    public TableDataInfo list(Catelog catelog)
    {
        startPage();
        List<Catelog> list = catelogService.selectCatelogList(catelog);
        return getDataTable(list);
    }

    /**
     * 导出闲置分类列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:catelog:export')")
    @Log(title = "闲置分类", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Catelog catelog)
    {
        List<Catelog> list = catelogService.selectCatelogList(catelog);
        ExcelUtil<Catelog> util = new ExcelUtil<Catelog>(Catelog.class);
        return util.exportExcel(list, "catelog");
    }

    /**
     * 获取闲置分类详细信息
     */
    @PreAuthorize("@ss.hasPermi('kdshop:catelog:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(catelogService.selectCatelogById(id));
    }

    /**
     * 新增闲置分类
     */
    @PreAuthorize("@ss.hasPermi('kdshop:catelog:add')")
    @Log(title = "闲置分类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Catelog catelog)
    {
        return toAjax(catelogService.insertCatelog(catelog));
    }

    /**
     * 修改闲置分类
     */
    @PreAuthorize("@ss.hasPermi('kdshop:catelog:edit')")
    @Log(title = "闲置分类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Catelog catelog)
    {
        return toAjax(catelogService.updateCatelog(catelog));
    }

    /**
     * 删除闲置分类
     */
    @PreAuthorize("@ss.hasPermi('kdshop:catelog:remove')")
    @Log(title = "闲置分类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(catelogService.deleteCatelogByIds(ids));
    }
}
