package com.lvr.kdshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
@Data
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

    private Integer view_count;

    private String describle;

    private Integer status;

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
        ", view_count=" + view_count +
        ", describle=" + describle +
        ", status=" + status +
        "}";
    }
}
