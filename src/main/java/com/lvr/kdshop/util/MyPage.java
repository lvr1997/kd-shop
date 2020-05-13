package com.lvr.kdshop.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author lvr
 * @version 1.0 2020/5/13
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class MyPage<T> extends Page<T> {

    private static final long serialVersionUID = -5544921550117456470L;

    private Integer selectInt;
    private String selectStr;
    private String name;

    public MyPage(long current, long size) {
        super(current, size);
    }

}
