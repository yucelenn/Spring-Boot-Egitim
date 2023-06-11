package com.yucelen;

import java.io.IOException;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

public class MyCustomFilter implements TypeFilter {

	@Override //belirttiğimiz pakaetteki classların metadatalarını tek tek tarayacak readerda tutulacak
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		System.out.println(metadataReader.getClassMetadata().getClassName());
		if (metadataReader.getClassMetadata().getClassName().contains("MyClass1")) {
			return true;//isminde MyClass1 geçen sınıfları component olarak gör.
		}
		return false;
	}

}
