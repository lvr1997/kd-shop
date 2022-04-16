package com.lvr.kdshop.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 权限返回接口
 * @ClassName Msg
 * @Author lan
 * @Date 2022/4/15 14:25
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Msg {
    /**错误码*/
    int code;
    /**消息提示*/
    String message;
    /**数据*/
    Map<String,Object> data=new HashMap<String,Object>();

    /**无权访问*/
    public static Msg denyAccess(String message){
        Msg result=new Msg();
        result.setCode(300);
        result.setMessage(message);
        return result;
    }
    /**操作成功*/
    public static Msg success(String message){
        Msg result=new Msg();
        result.setCode(200);
        result.setMessage(message);
        return result;
    }
    /**客户端操作失败*/
    public static Msg fail(String message){
        Msg result=new Msg();
        result.setCode(400);
        result.setMessage(message);
        return result;
    }
    public Msg add(String key,Object value){
        this.data.put(key,value);
        return this;
    }
}