package com.devsuperior.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplicacion {
	
	public static void main(String[] args) {
			SpringApplication.run(HrPayrollApplicacion.class, args);
	}

}
