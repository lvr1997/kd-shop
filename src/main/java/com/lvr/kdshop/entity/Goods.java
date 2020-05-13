package com.lvr.kdshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
public class Goods extends Model<Goods> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer catelog_id;

    private Integer user_id;

    private String name;

    private Double price;

    private Double real_price;

    private String start_time;

    private String polish_time;

    private String end_time;

    private Integer commet_num;

    private String phone_number;

    private String qq_number;

    private String wx_number;

    private String good_city;

    private String good_buy_method;

    private String good_address;

    private Integer viewCount;

    private String describle;

    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCatelog_id() {
        return catelog_id;
    }

    public void setCatelog_id(Integer catelog_id) {
        this.catelog_id = catelog_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getReal_price() {
        return real_price;
    }

    public void setReal_price(Double real_price) {
        this.real_price = real_price;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getPolish_time() {
        return polish_time;
    }

    public void setPolish_time(String polish_time) {
        this.polish_time = polish_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public Integer getCommet_num() {
        return commet_num;
    }

    public void setCommet_num(Integer commet_num) {
        this.commet_num = commet_num;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getQq_number() {
        return qq_number;
    }

    public void setQq_number(String qq_number) {
        this.qq_number = qq_number;
    }

    public String getWx_number() {
        return wx_number;
    }

    public void setWx_number(String wx_number) {
        this.wx_number = wx_number;
    }

    public String getGood_city() {
        return good_city;
    }

    public void setGood_city(String good_city) {
        this.good_city = good_city;
    }

    public String getGood_buy_method() {
        return good_buy_method;
    }

    public void setGood_buy_method(String good_buy_method) {
        this.good_buy_method = good_buy_method;
    }

    public String getGood_address() {
        return good_address;
    }

    public void setGood_address(String good_address) {
        this.good_address = good_address;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Goods{" +
        "id=" + id +
        ", catelog_id=" + catelog_id +
        ", user_id=" + user_id +
        ", name=" + name +
        ", price=" + price +
        ", real_price=" + real_price +
        ", start_time=" + start_time +
        ", polish_time=" + polish_time +
        ", end_time=" + end_time +
        ", commet_num=" + commet_num +
        ", phone_number=" + phone_number +
        ", qq_number=" + qq_number +
        ", wx_number=" + wx_number +
        ", good_city=" + good_city +
        ", good_buy_method=" + good_buy_method +
        ", good_address=" + good_address +
        ", viewCount=" + viewCount +
        ", describle=" + describle +
        ", status=" + status +
        "}";
    }
}
