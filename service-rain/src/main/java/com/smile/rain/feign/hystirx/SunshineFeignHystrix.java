package com.smile.rain.feign.hystirx;

import com.smile.rain.feign.SunshineFeign;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author creator mafh 2019/3/13 15:47
 * @author updater
 * @version 1.0.0
 */
@Component
public class SunshineFeignHystrix implements SunshineFeign {

    @Override
    public String helloRemote(@RequestParam String name) {
        return "hello " + name + ", sorry! The service is not available now!";
    }
}
