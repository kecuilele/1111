package com.ruyuan2020.im.common.core.annotation;

import java.lang.annotation.*;

/**
 * @author zhonghuashishan
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GetApi {

    String value() default "";
}
