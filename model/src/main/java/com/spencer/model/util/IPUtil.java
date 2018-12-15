package com.spencer.model.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lichao
 * @date 2018/12/3
 **/
public class IPUtil {

    private static final String UNKNOWN_HOST = "unknown";
    /**
     * 获取真实的IP地址
     */
    public static String getIpAddress(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || UNKNOWN_HOST.equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN_HOST.equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || UNKNOWN_HOST.equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
