package com.spencer.ms.authcenter.pojo.dto;

/**
 * @author lichao
 * @date 2018/12/15
 **/
public class Identify {
    /**
     * 登陆token
     */

    private String token;
    /**
     * 当前用户登陆的IP
     */
    private String ip;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
