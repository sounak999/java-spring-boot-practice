package com.springboot.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootdiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdiApplication.class, args);
		Dev bean = context.getBean(Dev.class);
		bean.build();
	}

}
