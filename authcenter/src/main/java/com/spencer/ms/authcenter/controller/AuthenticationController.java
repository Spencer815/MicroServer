package com.spencer.ms.authcenter.controller;

import com.spencer.ms.authcenter.pojo.User;
import com.spencer.ms.authcenter.pojo.dto.Identify;
import com.spencer.ms.authcenter.util.RedisCache;
import com.spencer.ms.authcenter.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lichao
 * @date 2018/12/15
 **/

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private static Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
    private RedisCache redisCache;

    @Autowired
    public AuthenticationController(RedisCache redisCache) {
        this.redisCache = redisCache;
    }


    @PostMapping("/identify")
    public Map<String, Object> identify(@RequestBody Identify identify) {
        Map<String, Object> result = new HashMap<>(8);
        result.put("result", false);
        result.put("msg", "用户非法登陆");
        if (identify != null && identify.getToken() != null && !StringUtil.isEmpty(identify.getToken()) && !StringUtil.isEmpty(identify.getIp())) {
            logger.debug("鉴权中心收到的token的值是：{0} -- {1}", identify.getIp(), identify.getToken());
            User user = redisCache.getObject(identify.getIp() + "-" + identify.getToken(), User.class);
            if (user == null) {
                result.put("result", false);
                result.put("msg", "用户未登陆，请重新登陆以后再操作！");
                return result;
            }
            result.put("result", true);
            result.put("msg", "权限鉴定通过");
        }
        return result;
    }
}
