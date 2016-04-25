package com.example;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SpringRestBootApplication {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(SpringRestBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringRestBootApplication.class, args);
	}

}
