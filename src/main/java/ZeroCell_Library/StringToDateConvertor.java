package ZeroCell_Library;

import java.time.LocalDate;


import com.creditdatamw.zerocell.converter.Converter;

public class StringToDateConvertor  implements Converter<LocalDate>{

	public LocalDate convert(String value, String columnName, int row) {
		
		return LocalDate.now();
	}

}
