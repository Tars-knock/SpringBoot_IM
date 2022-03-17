package cn.tarsknock.helloboot.controller;

import cn.tarsknock.helloboot.service.RedisService;
import cn.tarsknock.helloboot.vo.RedisTestVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Tars
 */
@Controller
@Slf4j
public class HelloWorldController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(@RequestParam(required = false, defaultValue = " ") String name){
        log.info("{} open the hello page", name);
        return "Spring say hello to you! "+name;
    }
    @RequestMapping(value = "/redisTest")
    @ResponseBody
    public String testRedis(@RequestBody(required = false) RedisTestVo redisTestVo){
        redisService.testRedis();
        return "";
    }
}
