package com.lyon.entity;


import java.io.Serializable;
import java.util.Date;

/**
 * 区域分组 - 实体定义
 * 开发人员: lyon
 * 修订日期: 2018-11-07 17:46:13
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;

    
    /** "用户名" */
    private String username;

    /** "密码" */
    private String password;

    /** "状态" */
    private int status;

    /** "备注" */
    private String summary;


    //region getter & setter

    /**
     * 获取唯一标识。
     */
    public String getId() {
        return id;
    }

    /**
     *设置唯一标识。
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名。
     */
    public String getUsername() {
        return username;
    }

    /**
     *设置用户名。
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码。
     */
    public String getPassword() {
        return password;
    }

    /**
     *设置密码。
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取状态。
     */
    public int getStatus() {
        return status;
    }

    /**
     *设置状态。
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 获取备注。
     */
    public String getSummary() {
        return summary;
    }

    /**
     *设置备注。
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    //endregion
}

