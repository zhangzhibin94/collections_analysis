package com.xiniunet.springframework.annotation;

import java.lang.annotation.*;

/**
 * Created by zzb on 2019/1/16.
 */
//@Target注解表示声明的注解@ZAutowired 的作用域，@ZAutowired可以作用在：1.构造函数，2.方法，3.（字段、枚举的常量）,4.注解
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
//@Retention表示声明的注解@ZAutowired 的保留位置：注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Retention(RetentionPolicy.RUNTIME)
@Documented//说明该注解将被包含在javadoc中
public @interface ZAutowired {

}
