package indi.mofan.common.annotation;

import org.mapstruct.Mapping;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author mofan 2021/2/2
 */
@Retention(RetentionPolicy.CLASS)
@Mapping(target = "id", ignore = true)
@Mapping(target = "createTime", expression = "java(new java.util.Date())")
@Mapping(source = "dept", target = "department")
public @interface FromUserInfo {
}
