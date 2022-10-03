package Owner_Library_Test;

import org.aeonbits.owner.ConfigFactory;

import Owner_Library.ReadProperty;

public class read_properties {
	
public static void main(String[] args) {
	
	ReadProperty config=ConfigFactory.create(ReadProperty.class);// object of ReadProperty for geeting the data from config.properties

	
	System.out.println(config.browser());
	System.out.println(config.link());
	
}
	
}
