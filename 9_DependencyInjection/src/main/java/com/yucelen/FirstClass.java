package com.yucelen;

import org.springframework.stereotype.Component;

@Component
public class FirstClass {

	//Component temel anotasyonlardan. Class seviyesinde kullanılır. Component anotasyonlu classların nesnesi  IoC'ye eklenir.
	//Bean anotasyonu metod seviyesinde kullanılır. Kullanıldığında metodun nesnesi IoC'ye eklenir.
	//Bean anotasyonunu kendin yazmadığın metodlarda kullanabilirsin.
	
	public String getName() {
		return "First class";
	}
}
