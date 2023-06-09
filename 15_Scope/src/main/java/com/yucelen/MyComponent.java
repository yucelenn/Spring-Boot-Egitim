package com.yucelen;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)   // 1 nesne 2 controllerda da inject edilir.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // her controllera farklı nesne inject edilir.
@RequestScope    // api'ı her dürttüğümüzde bir nesne daha oluşturacak.
public class MyComponent {
	
	public MyComponent() {
		System.out.println("MyComponent created at "+LocalDateTime.now());
	}

	public String getName() {
		return "MyComponent";
	}
}
