package org.spring.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"org.spring.controller","org.spring.models"})
public class MailApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(MailApplication.class, args);
	}
}
