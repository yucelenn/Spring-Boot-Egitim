package com.yucelen;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PdfFileReader implements Reader{

	@Override
	public String readFile() {
		return "Pdf file";
	}

}
