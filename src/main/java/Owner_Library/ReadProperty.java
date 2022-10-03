package Owner_Library;

import org.aeonbits.owner.Config;


//Using Owner libaray dependency we can read config properties files very easyly

          // value="File: path"
@Config.Sources(value="File:C:\\Users\\shrad\\.eclipse\\SDET_Essentials\\src\\test\\resources\\config.properties")

public interface ReadProperty extends Config {  // config is imported from owner class
	
	String browser();
	String link();
	
}