package com.lisiwen.logaspect.service.impl;

import com.lisiwen.logaspect.annotation.LogAnnotation;
import com.lisiwen.logaspect.service.api.ILogAspectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: logaspect
 * @ClassName: LogAspectServiceImpl
 * @Description: 日志测试接口实现类
 * @Author: lisiwen
 * @Date: 2020/1/21 16:43
 **/
@Service
public class LogAspectServiceImpl implements ILogAspectService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    @LogAnnotation(name = "logAspectTest", description = "进入日志注解切点")
    public String logAspectTest(String str) {
        log.info("进入service，str内容为：{}", str);
        return "service返回值";
    }

    @Override
    @LogAnnotation(name = "logAspectThrowTest", description = "进入异常日志注解切点")
    public String logAspectThrowTest(String str) {
        return String.valueOf(1 / 0);
    }
}
