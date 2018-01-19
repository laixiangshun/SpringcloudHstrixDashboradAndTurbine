package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 使用hystrix turbine 聚合所有服务的hystrix dashboard数据
 * Hystrix Turbine的使用非常简单，只需要引入相应的依赖和加上注解和配置就可以了。
 */
@SpringBootApplication
@EnableTurbine  //开启turbine
//@EnableEurekaClient
public class ServiceTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTurbineApplication.class, args);
	}
}
