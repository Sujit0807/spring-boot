package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
	// this will scan both packages/classes, by default only it scan for demo (we created)
	scanBasePackages = {"com.example.demo", "com.example.util"} 
)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
