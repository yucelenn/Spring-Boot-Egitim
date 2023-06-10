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
	useDefaultFilters = false,
	includeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, 
	//verilen ASPECTJ ifadesine uygun olan classları component olmasını sağlar.
	pattern ="com.branch.*" ) ,  //bu package altındaki bütün classların component olarak görülmesini sağlar.
	//pattern ="com.branch.MyClass1" ) ) //sadece MyClass1 in component olarak görülmesini istiyorsan böyle yaz.
	excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,
	classes = MyClass2.class)) 	//MyClass2 hariç hepsi olsun demek .
	
public class MyConfiguration {

	@Autowired
	private MyClass1 class1; 
	
	//@Autowired 
	//private MyClass2 class2; //excludeFilters ile belirttiğimiz için bu hata verir.
	
	@Autowired 
	private MyClass3 class3; 
	
}
