package com.smile.rain.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author creator mafh 2019/3/13 19:39
 * @author updater
 * @version 1.0.0
 * @RefreshScope 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
 */
@RestController
@RequestMapping("/rain")
@RefreshScope
public class ConfigController {

    @Value("${hello}")
    private String hello;

    @RequestMapping("/getHello")
    public String getHello() {
        return this.hello;
    }
}
