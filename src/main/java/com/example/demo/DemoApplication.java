package com.example.demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public OpenAPI openAPI(){
		Info info = new Info()
				.description("student project management system")
				.title("Project Management API")
				.version("0.0.1");
		return new OpenAPI().info(info);
	}

}
