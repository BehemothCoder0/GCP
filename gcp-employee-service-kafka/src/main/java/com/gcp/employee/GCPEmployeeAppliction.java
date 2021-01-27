package com.gcp.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.gcp.employee")
public class GCPEmployeeAppliction {

	public static void main(String[] args) {
		SpringApplication.run(GCPEmployeeAppliction.class, args);
	}

}
