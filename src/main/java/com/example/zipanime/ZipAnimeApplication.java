package com.example.zipanime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ZipAnimeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipAnimeApplication.class, args);
	}

}
