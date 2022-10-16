package Data_Supplier_Test;


import Data_Supplier_Library.pojo_for_data_supplier;
import io.github.sskorol.data.CsvReader;

import one.util.streamex.StreamEx;
import org.testng.annotations.Test;
import io.github.sskorol.core.DataSupplier;
import static io.github.sskorol.data.TestDataReader.use;

public class data_supplier {

	
	@Test(dataProvider  = "getdata")
	public void demo(pojo_for_data_supplier data) {
		System.out.println(data);
	}
	
	
	
	@DataSupplier
	public StreamEx<pojo_for_data_supplier> getdata() {
		
		return use(CsvReader.class) // We can also use JsonReader if you want add read data from json file
				.withTarget(pojo_for_data_supplier.class) // Path of pojo class
				.withSource("Data_supplier.csv") // path of csv file, which is in the resources folder
				.read(); // read method from streamex
	}

}
