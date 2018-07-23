package com.ray.cloud.framework.jetty;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.ray.cloud.framework"})
public class JettyFrameWorkServer extends SpringBootServletInitializer {

    @Bean
    @Primary
    public JettyFrameWorkServer server() {
        JettyFrameWorkServer server = new JettyFrameWorkServer();
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        server.configure(builder);
        return server;
    }
}
