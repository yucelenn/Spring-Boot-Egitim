package com.yucelen;

import java.awt.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.branch.MyClass1;
import com.branch.MyClass2;
import com.branch.MyClass3;
import com.branch.YucelenAnotasyonu;

@Configuration//tanımladığımız filtreye uyan classlar component class olur.(Component anotasyonu olmasa dahi)
@ComponentScan(basePackages = "com.branch", //taraması için paketi belirttik.
	useDefaultFilters = false,  //default filtreler kullanılmasın
	includeFilters = @ComponentScan.Filter(type = FilterType.CUSTOM, //kendimiz filtre oluşturmak için
	classes = MyCustomFilter.class)) 	//kendi oluşturduğumuz filtre classını verdik.
	
public class MyConfiguration {

	@Autowired
	private MyClass1 class1; 
	
	//@Autowired 
	//private MyClass2 class2; 
	
	//@Autowired 
	//private MyClass3 class3; 
	
}
