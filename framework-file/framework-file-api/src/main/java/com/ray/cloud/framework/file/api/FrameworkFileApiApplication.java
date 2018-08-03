package com.ray.cloud.framework.file.api;

import com.ray.cloud.framework.eureka.JettyFrameWorkServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrameworkFileApiApplication extends JettyFrameWorkServer{

	public static void main(String[] args) {
		SpringApplication.run(FrameworkFileApiApplication.class, args);
	}
}
