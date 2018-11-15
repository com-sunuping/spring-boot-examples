package com.sunuping.banner.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {
    @RequestMapping("/")
    public String banner(){
        System.out.println("张晓云  张云杉");
        return "banner genterssss";}
}
