package com.lvr.kdshop.util;

import lombok.Data;

/**
 * @author lvr
 * @version 1.0 2020/5/15
 */
@Data
public class JSONResult {

    private String code;//结果编码
    private String message;//结果描述
    private Object data;

    public static JSONResult success(Object data) {
        JSONResult result = new JSONResult();
        result.setCode("200");
        result.setData(data);
        result.setMessage("success");
        return result;
    }

    public static JSONResult fail(String message) {
        JSONResult result = new JSONResult();
        result.setCode("-1");
        result.setData(null);
        result.setMessage(message);
        return result;
    }

    public static JSONResult fail(String code, String message) {
        JSONResult result = new JSONResult();
        result.setCode(code);
        result.setData(null);
        result.setMessage(message);
        return result;
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
