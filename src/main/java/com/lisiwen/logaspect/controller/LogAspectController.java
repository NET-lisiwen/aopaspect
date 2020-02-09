package com.lisiwen.logaspect.controller;

import com.lisiwen.logaspect.service.api.ILogAspectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ProjectName: logaspect
 * @ClassName: LogAspestController
 * @Description: 日志测试controller
 * @Author: lisiwen
 * @Date: 2020/1/21 16:37
 **/
@RestController
public class LogAspectController {

    @Resource
    ILogAspectService logAspectService;

    /**
     * @param
     * @Author lisiwen
     * @Description 日志测试接口
     * @Date 2020/1/21 16:39
     * @Return void
     **/
    @GetMapping("logaspecttest/{str}")
    public String Test(@PathVariable String str) {
        return logAspectService.logAspectTest(str);
    }
    /**
     * @param
     * @Author lisiwen
     * @Description 日志测试接口
     * @Date 2020/1/21 16:39
     * @Return void
     **/
    @GetMapping("logaspecttest/throw/{str}")
    public String ThrowTest(@PathVariable String str) {
        return logAspectService.logAspectThrowTest(str);
    }
}
