package com.example.demo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lailai on 2018/1/19.
 */
@RestController
@RequestMapping("/hi")
public class hiController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "hiError") //声明断路点
    public String home(@RequestParam String name){
        return "hi "+name+",i am from port:"+port;
    }

    //断路器出错回调方法
    public String hiError(String name){
        return "hi,"+name+",sorry,error";
    }
}
