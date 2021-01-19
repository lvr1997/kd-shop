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
import com.lvr.kdshop.domain.Report;
import com.lvr.kdshop.service.IReportService;
import com.lvr.common.utils.poi.ExcelUtil;
import com.lvr.common.core.page.TableDataInfo;

/**
 * 闲置举报Controller
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@RestController
@RequestMapping("/kdshop/report")
public class ReportController extends BaseController
{
    @Autowired
    private IReportService reportService;

    /**
     * 查询闲置举报列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:report:list')")
    @GetMapping("/list")
    public TableDataInfo list(Report report)
    {
        startPage();
        List<Report> list = reportService.selectReportList(report);
        return getDataTable(list);
    }

    /**
     * 导出闲置举报列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:report:export')")
    @Log(title = "闲置举报", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Report report)
    {
        List<Report> list = reportService.selectReportList(report);
        ExcelUtil<Report> util = new ExcelUtil<Report>(Report.class);
        return util.exportExcel(list, "report");
    }

    /**
     * 获取闲置举报详细信息
     */
    @PreAuthorize("@ss.hasPermi('kdshop:report:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(reportService.selectReportById(id));
    }

    /**
     * 新增闲置举报
     */
    @PreAuthorize("@ss.hasPermi('kdshop:report:add')")
    @Log(title = "闲置举报", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Report report)
    {
        return toAjax(reportService.insertReport(report));
    }

    /**
     * 修改闲置举报
     */
    @PreAuthorize("@ss.hasPermi('kdshop:report:edit')")
    @Log(title = "闲置举报", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Report report)
    {
        return toAjax(reportService.updateReport(report));
    }

    /**
     * 删除闲置举报
     */
    @PreAuthorize("@ss.hasPermi('kdshop:report:remove')")
    @Log(title = "闲置举报", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reportService.deleteReportByIds(ids));
    }
}
