package com.lvr.kdshop.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.lvr.common.annotation.Excel;
import com.lvr.common.core.domain.BaseEntity;

/**
 * 闲置物品对象 kd_goods
 * 
 * @author lvr1997
 * @date 2021-01-06
 */
public class Goods extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 闲置id */
    private Long id;

    /** 分类id */
    @Excel(name = "分类id")
    private Long catelogId;

    /** 发布人 */
    @Excel(name = "发布人")
    private Long userId;

    /** 闲置名称 */
    @Excel(name = "闲置名称")
    private String name;

    /** 出售价格 */
    @Excel(name = "出售价格")
    private Long price;

    /** 原购买价格 */
    @Excel(name = "原购买价格")
    private Long realPrice;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date polishTime;

    /** 原购买链接 */
    @Excel(name = "原购买链接")
    private String buyUrl;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phoneNumber;

    /** qq号 */
    @Excel(name = "qq号")
    private String qqNumber;

    /** 微信号 */
    @Excel(name = "微信号")
    private String wxNumber;

    /** 购买方式1：在线交易2：线下交易3：线上/线下交易 */
    @Excel(name = "购买方式1：在线交易2：线下交易3：线上/线下交易")
    private Integer buyMethod;

    /** 交易地址 */
    @Excel(name = "交易地址")
    private String address;

    /** 显示数量 */
    @Excel(name = "显示数量")
    private Long viewCount;

    /** 闲置描述 */
    @Excel(name = "闲置描述")
    private String describle;

    /** 闲置状态1：发布成功2：未发布3：已出售4：发布待审核5：已下架6：已删除 */
    @Excel(name = "闲置状态1：发布成功2：未发布3：已出售4：发布待审核5：已下架6：已删除")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCatelogId(Long catelogId) 
    {
        this.catelogId = catelogId;
    }

    public Long getCatelogId() 
    {
        return catelogId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPrice(Long price) 
    {
        this.price = price;
    }

    public Long getPrice() 
    {
        return price;
    }
    public void setRealPrice(Long realPrice) 
    {
        this.realPrice = realPrice;
    }

    public Long getRealPrice() 
    {
        return realPrice;
    }
    public void setPolishTime(Date polishTime) 
    {
        this.polishTime = polishTime;
    }

    public Date getPolishTime() 
    {
        return polishTime;
    }
    public void setBuyUrl(String buyUrl) 
    {
        this.buyUrl = buyUrl;
    }

    public String getBuyUrl() 
    {
        return buyUrl;
    }
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setQqNumber(String qqNumber) 
    {
        this.qqNumber = qqNumber;
    }

    public String getQqNumber() 
    {
        return qqNumber;
    }
    public void setWxNumber(String wxNumber) 
    {
        this.wxNumber = wxNumber;
    }

    public String getWxNumber() 
    {
        return wxNumber;
    }
    public void setBuyMethod(Integer buyMethod) 
    {
        this.buyMethod = buyMethod;
    }

    public Integer getBuyMethod() 
    {
        return buyMethod;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setViewCount(Long viewCount) 
    {
        this.viewCount = viewCount;
    }

    public Long getViewCount() 
    {
        return viewCount;
    }
    public void setDescrible(String describle) 
    {
        this.describle = describle;
    }

    public String getDescrible() 
    {
        return describle;
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
            .append("catelogId", getCatelogId())
            .append("userId", getUserId())
            .append("name", getName())
            .append("price", getPrice())
            .append("realPrice", getRealPrice())
            .append("polishTime", getPolishTime())
            .append("buyUrl", getBuyUrl())
            .append("phoneNumber", getPhoneNumber())
            .append("qqNumber", getQqNumber())
            .append("wxNumber", getWxNumber())
            .append("buyMethod", getBuyMethod())
            .append("address", getAddress())
            .append("viewCount", getViewCount())
            .append("describle", getDescrible())
            .append("status", getStatus())
            .toString();
    }
}
