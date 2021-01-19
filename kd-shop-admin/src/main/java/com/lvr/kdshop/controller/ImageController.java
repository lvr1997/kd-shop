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
import com.lvr.kdshop.domain.Image;
import com.lvr.kdshop.service.IImageService;
import com.lvr.common.utils.poi.ExcelUtil;
import com.lvr.common.core.page.TableDataInfo;

/**
 * 闲置图片Controller
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@RestController
@RequestMapping("/kdshop/image")
public class ImageController extends BaseController
{
    @Autowired
    private IImageService imageService;

    /**
     * 查询闲置图片列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:image:list')")
    @GetMapping("/list")
    public TableDataInfo list(Image image)
    {
        startPage();
        List<Image> list = imageService.selectImageList(image);
        return getDataTable(list);
    }

    /**
     * 导出闲置图片列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:image:export')")
    @Log(title = "闲置图片", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Image image)
    {
        List<Image> list = imageService.selectImageList(image);
        ExcelUtil<Image> util = new ExcelUtil<Image>(Image.class);
        return util.exportExcel(list, "image");
    }

    /**
     * 获取闲置图片详细信息
     */
    @PreAuthorize("@ss.hasPermi('kdshop:image:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(imageService.selectImageById(id));
    }

    /**
     * 新增闲置图片
     */
    @PreAuthorize("@ss.hasPermi('kdshop:image:add')")
    @Log(title = "闲置图片", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Image image)
    {
        return toAjax(imageService.insertImage(image));
    }

    /**
     * 修改闲置图片
     */
    @PreAuthorize("@ss.hasPermi('kdshop:image:edit')")
    @Log(title = "闲置图片", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Image image)
    {
        return toAjax(imageService.updateImage(image));
    }

    /**
     * 删除闲置图片
     */
    @PreAuthorize("@ss.hasPermi('kdshop:image:remove')")
    @Log(title = "闲置图片", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(imageService.deleteImageByIds(ids));
    }
}
