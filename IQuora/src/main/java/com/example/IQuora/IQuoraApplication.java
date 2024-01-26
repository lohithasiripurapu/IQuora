package com.example.IQuora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@ComponentScan("com.example")
@EnableMongoRepositories("com.example")
public class IQuoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(IQuoraApplication.class, args);
	}
	
	

}
