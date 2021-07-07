package com.devsuperior.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HrWorkerApplicacion {
	
	public static void main(String[] args) {
			SpringApplication.run(HrWorkerApplicacion.class, args);
	}

}
