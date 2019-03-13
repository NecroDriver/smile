package com.smile.snow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author creator mafh 2019/3/13 14:15
 * @author updater
 * @version 1.0.0
 */
@Controller
@RequestMapping("/sunshine")
public class HelloController {

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(@RequestParam String name) {
        return "hello " + name + ", this is service-snow.HelloController.saveHello()";
    }
}
