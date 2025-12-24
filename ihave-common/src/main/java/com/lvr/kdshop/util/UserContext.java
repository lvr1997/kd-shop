package com.lvr.kdshop.util;

public class UserContext {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static String getCurrentId(){
        return threadLocal.get();
    }

    public static void setCurrentId(String id) {
        threadLocal.set(id);
    }

    public static void removeCurrentId() {
        threadLocal.remove();
    }
}
