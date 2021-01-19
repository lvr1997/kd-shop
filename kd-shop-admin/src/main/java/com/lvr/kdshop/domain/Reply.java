package com.lvr.kdshop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lvr.common.annotation.Excel;
import com.lvr.common.core.domain.BaseEntity;

/**
 * 评论回复对象 kd_reply
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public class Reply extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 评论人 */
    @Excel(name = "评论人")
    private Long userId;

    /** 被评论人 */
    @Excel(name = "被评论人")
    private Long atuserId;

    /** 回复人 */
    @Excel(name = "回复人")
    private Long commetId;

    /** 回复时间 */
    @Excel(name = "回复时间")
    private String createAt;

    /** 回复内容 */
    @Excel(name = "回复内容")
    private String content;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setAtuserId(Long atuserId) 
    {
        this.atuserId = atuserId;
    }

    public Long getAtuserId() 
    {
        return atuserId;
    }
    public void setCommetId(Long commetId) 
    {
        this.commetId = commetId;
    }

    public Long getCommetId() 
    {
        return commetId;
    }
    public void setCreateAt(String createAt) 
    {
        this.createAt = createAt;
    }

    public String getCreateAt() 
    {
        return createAt;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("atuserId", getAtuserId())
            .append("commetId", getCommetId())
            .append("createAt", getCreateAt())
            .append("content", getContent())
            .toString();
    }
}
