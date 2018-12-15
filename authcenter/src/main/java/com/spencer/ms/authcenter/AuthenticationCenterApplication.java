package com.spencer.ms.authcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lichao
 * @date 2018/12/15 09:45
 */
@SpringBootApplication
@EnableEurekaClient
public class AuthenticationCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationCenterApplication.class, args);
    }

}

