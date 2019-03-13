package com.smile.rain.controller;

import com.smile.rain.feign.SunshineFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author creator mafh 2019/3/13 15:08
 * @author updater
 * @version 1.0.0
 */
@RestController
@RequestMapping("/rain")
public class HelloController {

    @Autowired
    private SunshineFeign sunshineFeign;

    @RequestMapping("/sayHello/{name}")
    public String feignHello(@PathVariable("name") String name) {
        return sunshineFeign.helloRemote(name);
    }
}
