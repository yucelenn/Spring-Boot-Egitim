package com.yucelen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	//ApplicationContext Interface'i SpringIoC container'ı temsil eder.
	//Nesnelerin(bean) oluşturulması, konfigüre edilmesi, ınjectionla sorumludur. Yani bean yönetimini yapar.
	@Autowired
	private ApplicationContext applicationContext;
	
	@GetMapping("/e1")
	public void example1() { //bean lerin sayısını verir
		int beanDefinitionCount = applicationContext.getBeanDefinitionCount();
		System.out.println(beanDefinitionCount);
	}
	
	@GetMapping("/e2")
	public void example2() { //bean lerin isimlerini verir
		String [] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for(String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}
	}
	
	@GetMapping("/e3")
	public void example3() { //spesifik bir bean'i çekmek için
		MyComponent myComponent = (MyComponent) applicationContext.getBean("myComponent");
		//MyComponent myComponent = (MyComponent) applicationContext.getBean(MyComponent.class); 
		System.out.println(myComponent.getName());
	}
	
	@GetMapping("/e4")
	public void example4() { //ismi verilen  bir bean'in type'ını verir
		Class<?> myComponentClass = applicationContext.getType("myComponent");
		System.out.println(myComponentClass);
		System.out.println(myComponentClass.getSimpleName());
	}
	
	@GetMapping("/e5")
	public void example5() { //ismi verilen  bir bean'in IoC'de olup olmadığını döner.
		boolean myComponent = applicationContext.containsBean("myComponent");
		System.out.println(myComponent);
	}
}
