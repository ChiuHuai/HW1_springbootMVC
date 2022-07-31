package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.practice.Controller","com.practice.Service"})
public class SpringPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringPracticeApplication.class, args);
	}

}
