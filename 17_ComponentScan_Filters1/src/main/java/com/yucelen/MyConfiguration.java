package com.yucelen;

import java.awt.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.branch.MyClass1;
import com.branch.MyClass2;
import com.branch.YucelenAnotasyonu;

@Configuration//tanımladığımız filtreye uyan classlar component class olur.(Component anotasyonu olmasa dahi)
@ComponentScan(basePackages = "com.branch", //taraması için paketi belirttik.
	//useDefaultFilters = false, MyClass2 örneği için dene bunu.
	includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, 
	classes = YucelenAnotasyonu.class) ) //YucelenAnotasyonu ile işaretlenen classlar component olarak görülecek.

public class MyConfiguration {

	@Autowired
	private MyClass1 class1; //inject edildiğine göre anotasyonum çalışır durumda. MyClass1 component oldu.
	
	@Autowired //bu da normal Component anotasyonulu sınıf. 	 yazarsam yukarı bu çalışmaz.
	private MyClass2 class2; // çünkü component anotasyonu default
}
