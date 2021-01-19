package com.lvr.kdshop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lvr.common.annotation.Excel;
import com.lvr.common.core.domain.BaseEntity;

/**
 * 闲置举报对象 kd_report
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public class Report extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 举报的闲置 */
    @Excel(name = "举报的闲置")
    private Long goodId;

    /** 举报人 */
    @Excel(name = "举报人")
    private Long userId;

    /** 举报内容 */
    @Excel(name = "举报内容")
    private String content;

    /** 状态1：待审核2：已审核 */
    @Excel(name = "状态1：待审核2：已审核")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGoodId(Long goodId) 
    {
        this.goodId = goodId;
    }

    public Long getGoodId() 
    {
        return goodId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("goodId", getGoodId())
            .append("userId", getUserId())
            .append("content", getContent())
            .append("status", getStatus())
            .toString();
    }
}
