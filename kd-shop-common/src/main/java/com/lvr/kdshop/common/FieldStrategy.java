package com.lvr.kdshop.common;

/**
 * 字段策略枚举类
 * <p>
 * 如果字段是基本数据类型则最终效果等同于 {@link #IGNORED}
 *
 * @author hubin
 * @since 2016-09-09
 */
public enum FieldStrategy {
    /**
     * 忽略判断
     */
    IGNORED,
    /**
     * 非NULL判断
     */
    NOT_NULL,
    /**
     * 非空判断(只对字符串类型字段,其他类型字段依然为非NULL判断)
     */
    NOT_EMPTY,
    /**
     * 默认的,一般只用于注解里
     * <p>1. 在全局里代表 NOT_NULL</p>
     * <p>2. 在注解里代表 跟随全局</p>
     */
    DEFAULT,
    /**
     * 不加入 SQL
     */
    NEVER
}
