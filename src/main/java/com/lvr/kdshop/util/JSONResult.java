package com.lvr.kdshop.util;

/**
 * @author lvr
 * @version 1.0 2020/5/15
 */
public class JSONResult {

    private String code;//结果编码
    private String message;//结果描述
    private Object data;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
        this.message = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

}
