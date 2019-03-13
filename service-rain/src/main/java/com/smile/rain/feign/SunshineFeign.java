package com.smile.rain.feign;

import com.smile.rain.feign.hystirx.SunshineFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author creator mafh 2019/3/13 15:04
 * @author updater
 * @version 1.0.0
 */
@FeignClient(name = "service-sunshine", fallback = SunshineFeignHystrix.class, primary = true)
public interface SunshineFeign {

    @RequestMapping("/sunshine/sayHello")
    public String helloRemote(@RequestParam String name);
}
