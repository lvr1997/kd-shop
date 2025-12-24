package com.lvr.ihave.util;

import com.lvr.ihave.constant.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JSONResult {
    private int code;
    private String msg;
    private Object data;

    /**
     * 成功
     * @return
     */
    public static JSONResult success(String msg) {
        return new JSONResult(StatusEnum.SUCCESS.getCode(), msg,null);
    }

    public static JSONResult success(String message, Object obj) {
        return new JSONResult(StatusEnum.SUCCESS.getCode(), message, obj);
    }

    /**
     * 失败
     * @param message
     * @return
     */
    public static JSONResult fail(int code, String message) {
        return new JSONResult(code, message, null);
    }
    public static JSONResult fail(int code, String message, Object obj) {
        return new JSONResult(code, message, obj);
    }
}
