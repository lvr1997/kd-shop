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
public class Address extends Model<Address> {

    private static final long serialVersionUID=1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private String recv_name;

    private String recv_province;

    private String recv_city;

    private String recv_area;

    private String recv_district;

    private String recv_addr;

    private String recv_phone;

    private String recv_tel;

    private String recv_zip;

    private String recv_tag;

    private Integer is_default;

    private String created_user;

    private String created_time;

    private String modified_user;

    private String modified_time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRecv_name() {
        return recv_name;
    }

    public void setRecv_name(String recv_name) {
        this.recv_name = recv_name;
    }

    public String getRecv_province() {
        return recv_province;
    }

    public void setRecv_province(String recv_province) {
        this.recv_province = recv_province;
    }

    public String getRecv_city() {
        return recv_city;
    }

    public void setRecv_city(String recv_city) {
        this.recv_city = recv_city;
    }

    public String getRecv_area() {
        return recv_area;
    }

    public void setRecv_area(String recv_area) {
        this.recv_area = recv_area;
    }

    public String getRecv_district() {
        return recv_district;
    }

    public void setRecv_district(String recv_district) {
        this.recv_district = recv_district;
    }

    public String getRecv_addr() {
        return recv_addr;
    }

    public void setRecv_addr(String recv_addr) {
        this.recv_addr = recv_addr;
    }

    public String getRecv_phone() {
        return recv_phone;
    }

    public void setRecv_phone(String recv_phone) {
        this.recv_phone = recv_phone;
    }

    public String getRecv_tel() {
        return recv_tel;
    }

    public void setRecv_tel(String recv_tel) {
        this.recv_tel = recv_tel;
    }

    public String getRecv_zip() {
        return recv_zip;
    }

    public void setRecv_zip(String recv_zip) {
        this.recv_zip = recv_zip;
    }

    public String getRecv_tag() {
        return recv_tag;
    }

    public void setRecv_tag(String recv_tag) {
        this.recv_tag = recv_tag;
    }

    public Integer getIs_default() {
        return is_default;
    }

    public void setIs_default(Integer is_default) {
        this.is_default = is_default;
    }

    public String getCreated_user() {
        return created_user;
    }

    public void setCreated_user(String created_user) {
        this.created_user = created_user;
    }

    public String getCreated_time() {
        return created_time;
    }

    public void setCreated_time(String created_time) {
        this.created_time = created_time;
    }

    public String getModified_user() {
        return modified_user;
    }

    public void setModified_user(String modified_user) {
        this.modified_user = modified_user;
    }

    public String getModified_time() {
        return modified_time;
    }

    public void setModified_time(String modified_time) {
        this.modified_time = modified_time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Address{" +
        "id=" + id +
        ", uid=" + uid +
        ", recv_name=" + recv_name +
        ", recv_province=" + recv_province +
        ", recv_city=" + recv_city +
        ", recv_area=" + recv_area +
        ", recv_district=" + recv_district +
        ", recv_addr=" + recv_addr +
        ", recv_phone=" + recv_phone +
        ", recv_tel=" + recv_tel +
        ", recv_zip=" + recv_zip +
        ", recv_tag=" + recv_tag +
        ", is_default=" + is_default +
        ", created_user=" + created_user +
        ", created_time=" + created_time +
        ", modified_user=" + modified_user +
        ", modified_time=" + modified_time +
        "}";
    }
}
