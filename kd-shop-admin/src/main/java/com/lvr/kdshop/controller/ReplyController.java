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
import com.lvr.kdshop.domain.Reply;
import com.lvr.kdshop.service.IReplyService;
import com.lvr.common.utils.poi.ExcelUtil;
import com.lvr.common.core.page.TableDataInfo;

/**
 * 评论回复Controller
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
@RestController
@RequestMapping("/kdshop/reply")
public class ReplyController extends BaseController
{
    @Autowired
    private IReplyService replyService;

    /**
     * 查询评论回复列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:reply:list')")
    @GetMapping("/list")
    public TableDataInfo list(Reply reply)
    {
        startPage();
        List<Reply> list = replyService.selectReplyList(reply);
        return getDataTable(list);
    }

    /**
     * 导出评论回复列表
     */
    @PreAuthorize("@ss.hasPermi('kdshop:reply:export')")
    @Log(title = "评论回复", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Reply reply)
    {
        List<Reply> list = replyService.selectReplyList(reply);
        ExcelUtil<Reply> util = new ExcelUtil<Reply>(Reply.class);
        return util.exportExcel(list, "reply");
    }

    /**
     * 获取评论回复详细信息
     */
    @PreAuthorize("@ss.hasPermi('kdshop:reply:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(replyService.selectReplyById(id));
    }

    /**
     * 新增评论回复
     */
    @PreAuthorize("@ss.hasPermi('kdshop:reply:add')")
    @Log(title = "评论回复", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Reply reply)
    {
        return toAjax(replyService.insertReply(reply));
    }

    /**
     * 修改评论回复
     */
    @PreAuthorize("@ss.hasPermi('kdshop:reply:edit')")
    @Log(title = "评论回复", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Reply reply)
    {
        return toAjax(replyService.updateReply(reply));
    }

    /**
     * 删除评论回复
     */
    @PreAuthorize("@ss.hasPermi('kdshop:reply:remove')")
    @Log(title = "评论回复", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(replyService.deleteReplyByIds(ids));
    }
}
