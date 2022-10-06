package ZeroCell_Library;
import java.io.File;
import java.util.List;

import com.creditdatamw.zerocell.Reader;


public final class testdatarunner {
	
	public static void main(String[] args) {
		
	

		List<testdatareader> data = Reader.of(testdatareader.class) // classname
				.from(new File("C:\\Users\\shrad\\.eclipse\\SDET_Essentials\\src\\test\\resources\\TestData\\TestData.xlsx")) // filepath
				.sheet("Test_Data_Sheet_1") // sheet name
				.skipHeaderRow(true) // skip first row of excel
				.list(); // return all the data in excel in the form of list


		data.forEach(System.out::println);
		
	
	}

}
