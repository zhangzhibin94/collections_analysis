package com.xiniunet.springframework.stereotype;

import java.lang.annotation.*;

/**
 * Created by zzb on 2019/1/16.
 */

@Target({ElementType.TYPE})
//@Retention表示声明的注解@ZAutowired 的保留位置：注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
}
