package com.yucelen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	/*Injection yöntemleri;
	   -Field Injection
	   -Setter Injection
	   -Constructor Injection
	 */
	
	//Field Injection (tavsiye edilmez, kullanma)
	//@Autowired
	//private FirstClass firstClass;
		
	private SecondClass secondClass;

	private ThirdClass thirdClass;
		
	private FirstClass firstClass;
	
	//Setter Injection (fazla uğraştırır)
	@Autowired
	public void setSecondClass(SecondClass secondClass) {
		this.secondClass = secondClass;
	}
	
	//Constructor Injection (tavsiye edilen)
	public MyController(ThirdClass thirdClass) {
		this.thirdClass = thirdClass;
	}

	//Birden fazla constructor olursa autowired anotasyonlu olan kullanılır. (üstteki kullanılmaz bu durumda)
	@Autowired 
	public MyController(ThirdClass thirdClass, FirstClass firstClass) {
		this.thirdClass = thirdClass;
		this.firstClass = firstClass;
	}

	@GetMapping("/names")
	private String getNameOfClasses() {
		return this.firstClass.getName() + " **** " +
				this.secondClass.getName()+ " **** " +
				this.thirdClass.getName(); 
	}
	
}
