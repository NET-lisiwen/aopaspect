package com.lisiwen.logaspect.annotation;


import java.lang.annotation.*;

/**
 * @ProjectName: aspect
 * @ClassName: LogAspect
 * @Description: 日志切面
 * @Author: lisiwen
 * @Date: 2020/1/21 15:59
 **/
@Documented
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {
    /**
     * 操作名称
     */
    String name() default "";

    /**
     * 说明
     */
    String description() default "";

}
