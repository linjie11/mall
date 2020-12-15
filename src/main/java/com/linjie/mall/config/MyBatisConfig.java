package com.linjie.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.linjie.mall.mbg.mapper")
public class MyBatisConfig {
}
