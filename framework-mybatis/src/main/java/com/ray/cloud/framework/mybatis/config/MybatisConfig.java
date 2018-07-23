package com.ray.cloud.framework.mybatis.config;

import com.ray.cloud.framework.mybatis.mapper.BaseMapper;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author ZhangRui
 */
@Component
@ComponentScan("com.ray.cloud.framework.mybatis")
public class MybatisConfig {

    @Bean
    protected MapperScannerConfigurer configurer() {
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage(BaseMapper.class.getPackage().getName());
        return configurer;
    }
}
