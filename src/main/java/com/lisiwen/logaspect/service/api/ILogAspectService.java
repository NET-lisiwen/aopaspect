package com.lisiwen.logaspect.service.api;

/**
 * @ProjectName: logaspect
 * @ClassName: ILogAspectService
 * @Description: 日志测试接口
 * @Author: lisiwen
 * @Date: 2020/1/21 16:42
 **/
public interface ILogAspectService {
    /**
     * @Author lisiwen
     * @Description logaspect测试接口
     * @Date 2020/1/21 17:16
     * @param str
     * @Return java.lang.String
     **/
    String logAspectTest(String str);
    /**
     * @Author lisiwen
     * @Description logaspect异常测试接口
     * @Date 2020/1/21 17:16
     * @param str
     * @Return java.lang.String
     **/
    String logAspectThrowTest(String str);
}
