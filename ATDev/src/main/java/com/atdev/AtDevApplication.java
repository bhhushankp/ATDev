package com.atdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class AtDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtDevApplication.class, args);
	}

}
