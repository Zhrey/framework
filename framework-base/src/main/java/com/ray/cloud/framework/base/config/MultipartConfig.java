package com.ray.cloud.framework.base.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.MultipartConfigElement;


@Component
public class MultipartConfig {

    @Bean
    protected MultipartConfigElement element() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize(10 * 1024L * 1024L);
        factory.setMaxRequestSize(10 * 1024L * 1024L);
        return factory.createMultipartConfig();
    }
}
