package com.lvr.kdshop.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lvr
 * @since 2020-05-13
 */
public class Reply extends Model<Reply> {

    private static final long serialVersionUID=1L;

      private Integer id;

    private Integer user_id;

    private Integer atuser_id;

    private Integer commet_id;

    private String create_at;

    private String content;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getAtuser_id() {
        return atuser_id;
    }

    public void setAtuser_id(Integer atuser_id) {
        this.atuser_id = atuser_id;
    }

    public Integer getCommet_id() {
        return commet_id;
    }

    public void setCommet_id(Integer commet_id) {
        this.commet_id = commet_id;
    }

    public String getCreate_at() {
        return create_at;
    }

    public void setCreate_at(String create_at) {
        this.create_at = create_at;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Reply{" +
        "id=" + id +
        ", user_id=" + user_id +
        ", atuser_id=" + atuser_id +
        ", commet_id=" + commet_id +
        ", create_at=" + create_at +
        ", content=" + content +
        "}";
    }
}
