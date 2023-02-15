package com.incometax.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IncomeTaxCalculationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncomeTaxCalculationApplication.class, args);
	}

}
