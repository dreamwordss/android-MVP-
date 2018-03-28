package com.lbl.codek3demo.blnetwork;

/**
 * author：libilang
 * time: 17/10/30 18:31
 * 邮箱：libi_lang@163.com
 */

public class RequestParameter {
    private String key;
    private Object obj;

    public RequestParameter(String key, Object obj) {
        this.key = key;
        this.obj = obj;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}