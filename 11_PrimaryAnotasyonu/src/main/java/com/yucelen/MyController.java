package com.yucelen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	//IoC'den kullanılacak olan instance'ı belirlemek için kullanılır 
	//Bean anotasyonlu metodda ya da Component class
	//Primary anotasyonlu classın instance'ı diğerlerine göre öncelikli olur.Sadece 1 instance için kullanılır
	
	@Autowired
	//@Qualifier("pdfFileReader") //özel isim belirtmezsen sınıfın baş harfi küçük şekilde yazılır.
	//@Qualifier("excelFileReader")
	//@Qualifier("Excel") // özel isim belirtildiği için isim buraya eklendi.
	//@Qualifier("getWordFileReader") // WordFileReader sınıfı Component olmadığı için Bean ile belirtilen metod ismi eklendi.
	//@Qualifier("Word") // Bean anotasyonunda özel isim belirtildiği için isim buraya eklendi.
	private Reader reader;
	
	@Autowired
	@Qualifier("Word")
	private Reader reader2;
	
	@GetMapping("/read")
	public String read() {        //öncelik Primary anotasyonludadır.
		return this.reader.readFile() + " " + this.reader2.readFile();
	}
}
