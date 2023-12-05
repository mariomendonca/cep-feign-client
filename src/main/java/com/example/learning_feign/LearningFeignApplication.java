package com.example.learning_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LearningFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningFeignApplication.class, args);
	}

}
