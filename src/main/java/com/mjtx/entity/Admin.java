package com.mjtx.entity;

/**
 * @author 徐彪 xubiao.anxin@gmail.com
 * @version V1.0 2021/2/24 22:23
 * 管理员账户实体类
 */
public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
