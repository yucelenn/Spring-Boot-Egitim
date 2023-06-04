package com.yucelen;

import org.springframework.stereotype.Component;

@Component
public class PdfFileReader implements Reader{

	@Override
	public String readFile() {
		return "Pdf file";
	}

}
