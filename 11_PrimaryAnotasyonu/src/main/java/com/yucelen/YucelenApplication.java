package com.yucelen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YucelenApplication {

	public static void main(String[] args) {
		SpringApplication.run(YucelenApplication.class, args);
	}
	
	
	@Bean("Word")
	public WordFileReader getWordFileReader() {
		return new WordFileReader();
	}
	
}
