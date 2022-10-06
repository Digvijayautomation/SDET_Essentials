package ZeroCell_Library;

import com.creditdatamw.zerocell.converter.Converter;

public class MobileNumberProcessor implements Converter<String> {

	public String convert(String value, String columnName, int row) {
		
		return 
				value.startsWith("+91") ? value : "+91"+value; // if number start with country code(+91) return number as it is, if not then append +91
	}

}
