package com.ray.cloud.framework.jetty;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class JettyFrameWorkServer extends SpringBootServletInitializer {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    @Primary
    public JettyFrameWorkServer server() {
        JettyFrameWorkServer server = new JettyFrameWorkServer();
        SpringApplicationBuilder builder = new SpringApplicationBuilder();
        server.configure(builder);
        return server;
    }
}
