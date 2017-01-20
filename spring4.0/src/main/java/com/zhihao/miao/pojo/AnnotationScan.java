package com.zhihao.miao.pojo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackages="com.zhihao.miao.pojo",excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={AppContext.class,UserController.class}))
@Configuration
public class AnnotationScan {

}
