package com.jap.demo.C12S4CHSPRINGBOOT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import service.MassageService;

@SpringBootApplication
public class C12S4ChSpringbootApplication {
	public static MassageService massageService;


	public static void main(String[] args) {

		ApplicationContext context =	SpringApplication.run(C12S4ChSpringbootApplication.class, args);
		massageService =context.getBean("massageService",MassageService.class);
		String massage = massageService.goodDayToYou();
		System.out.println(massage);
	}

}
