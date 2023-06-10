package com.yucelen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.branch.MyComponent;
import com.branch.MyService;

/*
 * ComponentScan : Belirtilen package(lar) altındaki component classların taranaraktespit edilme işlemini 
 * yönetebilmemizi sağlayan bir anotasyondur.
 * 
 * basePackages : Taranacak packageları String listesi olarak belirterek bu packagelar altındaki component classların
 * taranıp tespit edilmesini sağlar. Package listesi belirtilmezse ComponentScan in yazıldığı package basePAckage olur.
 * 
 * basePackageClasses : bunla belirtilen classların bulunduğu packagelar basePackage olur.
 */

@SpringBootApplication
//@ComponentScan(basePackages = {"com.branch" , "com"}) // com  en baştaki package olduğu için hepsini tarar comp scan
@ComponentScan(basePackageClasses = {MyComponent.class,MyController.class})//bu classlar hangi paketteyse onu basePackage yapar 
public class YucelenApplication {

	@Autowired
	private MyComponent myComponent;
	
	@Autowired
	private MyService myService;
	
	public static void main(String[] args) {
		SpringApplication.run(YucelenApplication.class, args);
	}

}
