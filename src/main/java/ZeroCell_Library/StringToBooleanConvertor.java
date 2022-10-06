package ZeroCell_Library;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToBooleanConvertor implements Converter<Boolean> { //import Convertor from zerocell

	public Boolean convert(String value, String columnName, int row) { 
		
		return value.equalsIgnoreCase("true"); // if value is true it will return true otherwise it will return false
	}

}
