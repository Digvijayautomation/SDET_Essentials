package Fixture_Factory_Test;

import Fixture_Factory_Library.Pojo;
import br.com.six2six.fixturefactory.*;



// Using fixture factory we can create different type of templates like valid data, invalid data.

public class Pojo_with_fixture_factory {

	public static void main(String[] args) {
		
	
	//this is simple we can create object for pojo class and access
	//Pojo emp=	new Pojo(20,"Digvijay","QA Lead","15-09-2022");



	// by using fixture factory we can do like below
	// We can create mutiple templates live valid template for positive testing, invalid template for negative testing
		// We have to set the rule as per our requirement
		
		
		Fixture.of(Pojo.class).addTemplate("Valid", new Rule() 
		{{
			add("id",random(Integer.class,range(1,1000))); // it will take any number between 1-1000
			add("name", random("Digvijay","Manoj","Suraj")); // it will take any name from given 3 names
			add("job",uniqueRandom("QA","Automation Tester","Manual Tester")); // Uniquerandom will pick unique value every time for every itration from given data
		
			
		}});
		
		
		Fixture.of(Pojo.class).addTemplate("InValid", new Rule() 
		{{
			add("id",random(Integer.class,range(-1,10))); // it will take any number between 1-1000
			add("name", random("Digvijay","Manoj","Suraj")); // it will take any name from given 3 names
			add("job",uniqueRandom("QA","Automation Tester","Manual Tester")); // Uniquerandom will pick unique value every time for every itration from given data
		
			
		}});
		
		
		// if you want to keep all the info as it is, and want to change only data for one filed
	    // We can use first template as base template 	
	
		Fixture.of(Pojo.class).addTemplate("InValidFirstname").inherits("Valid", new Rule() // We will use Valid template as base template and only change the required filed , no need to change for all the fileds
				
		{{
		
			add("name", random("Digvijay","Manoj","Suraj"));
			
			
		}});
		
		
		
		
		// After template is created we have create object of that so that we can use it
		
		Pojo valid_data=Fixture.from(Pojo.class).gimme("Valid"); // we can directly pass valid data to our restassured body
		//List<Object> valid_data1=Fixture.from(Pojo.class).gimme(4,"Valid"); // if we want mutiple quantity of valid data we just can mention the quantity
		Pojo invalid_data=Fixture.from(Pojo.class).gimme("InValid");
		Pojo invalid_data_name=Fixture.from(Pojo.class).gimme("InValidFirstname");
		
		
		
		System.out.println(valid_data);
		//System.out.println(valid_data1);
		System.out.println(invalid_data);
		System.out.println(invalid_data_name);
		
	

	}

}
