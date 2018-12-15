package com.spencer.ms.authcenter.util;

/**
 * @author lichao
 * @date 2018/12/15
 **/
public class StringUtil {

    public static boolean isEmpty(String str) {
        if (null == str || str.trim().length() <= 0) {
            return true;
        }
        return false;
    }
}
