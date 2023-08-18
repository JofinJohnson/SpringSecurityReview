package com.review.spring.springsecuritythree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringSecurityThreeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityThreeApplication.class, args);
	}

}
