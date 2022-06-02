package com.qa.hwamonstermaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class HwaMonstermakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HwaMonstermakerApplication.class, args);
	}

}
