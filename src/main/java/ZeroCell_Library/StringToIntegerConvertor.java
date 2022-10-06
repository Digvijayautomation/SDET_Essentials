package ZeroCell_Library;

import com.creditdatamw.zerocell.converter.Converter;

public class StringToIntegerConvertor implements Converter<Integer> {

	public Integer convert(String value, String columnName, int row) {
		
		return Integer.parseInt(value);
	}

}
