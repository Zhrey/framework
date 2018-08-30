package com.ray.cloud.framework.file.api;

import com.ray.cloud.framework.jetty.JettyFrameWorkServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//用于启动Fegin功能
@EnableFeignClients
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class FrameworkFileApiApplication extends JettyFrameWorkServer{

	public static void main(String[] args) {
		SpringApplication.run(FrameworkFileApiApplication.class, args);
	}
}
