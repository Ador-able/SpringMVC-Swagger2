package com.lxy;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//Spring容器 根容器 扫描除Controller的组件
@ComponentScan("com.lxy")
public class RootConfig {

}