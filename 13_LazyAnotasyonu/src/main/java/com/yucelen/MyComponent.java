package com.yucelen;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy  //Lazy anotasyonu sayesinde Component nesnesi ihtiyaç duyulana kadar IoC'ye eklenmez
public class MyComponent {
	//Injection yapılmadığı sürece bu Constructor çalışmayacaktır.
	public MyComponent() {
		System.out.println("MyComponent bean initialized"); //IoC'ye eklenen nesnelere bean denir.
	}

}
