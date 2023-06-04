package com.yucelen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YucelenApplication {

	public static void main(String[] args) {
		SpringApplication.run(YucelenApplication.class, args);
	}
	
	@Bean
	public SecondClass getSecondClass() { //Bean anotasyonuyla SecondClass nesnesi IoC'ye eklendi.
		return new SecondClass();
	}
}
