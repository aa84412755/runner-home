package com.runner.model;

import com.runner.cons.RuunerCons;

import java.io.Serializable;

/**
 * @author 郭永江
 * @date 2019/9/9 9:43
 */
public class DataResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String msg;
    private Object data;
    private Object count;

    public Object getCount() {
        return this.count;
    }

    public void setCount(Object object) {
        this.count = object;
    }

    public DataResponse() {
        this.setCount(0);
        this.setCode(RuunerCons.CODE_SUCCESS);
        this.setMsg(RuunerCons.MSG_SUCCESS);
    }

    public String getCode() {
        return this.code;
    }

    public DataResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return this.msg;
    }

    public DataResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return this.data;
    }

    public DataResponse setData(Object data) {
        this.data = data;
        return this;
    }
}
