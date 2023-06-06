package com.yucelen;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	private MyComponent myComponent;
	//Lazy anotasyonu sayesinde Component nesnesi ihtiyaç duyulana kadar IoC'ye eklenmez
	//Constructor inj. yöntemiyle MyComponent nesnesi ihtiyacı oluşacak böylelikle IoCye Component instance eklenecek 
	public MyController(MyComponent myComponent) {
		this.myComponent = myComponent;
	}
	
}
