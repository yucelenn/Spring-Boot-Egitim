package com.yucelen;

import org.springframework.stereotype.Component;

@Component("Excel") // özel isim burada belirtildi.
public class ExcelFileReader implements Reader{

	@Override
	public String readFile() {
		return "Excel File";
	}

}
