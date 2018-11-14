package com.lyon.common;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class LYResultVO {

    private Object obj;

    /** 0 表示成功 1 是失败*/
    private int state;

    private String msg;

    public LYResultVO() {
        super();
    }
    public LYResultVO(Object obj, int state, String msg) {
        super();
        this.obj = obj;
        this.state = state;
        this.msg = msg;
    }

    public LYResultVO(int state, String msg) {
        super();
        this.state = state;
        this.msg = msg;
    }
    public LYResultVO(int state, Object obj) {
        this.state = state;
        this.obj = obj;
    }
    public static LYResultVO error(String msg){
        return new LYResultVO(1,msg);
    }

    public static LYResultVO success(Object obj,String msg){
        return new LYResultVO(obj,0,msg);
    }

    /**
     * 请求成功
     * @param msg 提示信息
     * @return
     */
    public static LYResultVO success(String msg){
        return new LYResultVO(0,msg);
    }

    /**
     * 请求成功
     * @param obj 返回数据
     * @return
     */
    public static LYResultVO success(Object obj){
        return new LYResultVO(0,obj);
    }
}
