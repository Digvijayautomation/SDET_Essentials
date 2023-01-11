package Lombok_Test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import Lombok_Library_And_Jackson_Annoatations.Employee_POJO_with_Lombok;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class Restassured_Post3_Using_POJO_With_LOMBOK {
	
	

	@Test
	public void pojotest() {
	
			System.out.println("Passing JSON Body Using POJO With Lombok");
			
			
			// Creating object of Employee_POJO Class and passing it as body
			// datatypes for the data we are passing passing in this emp object is already fixed in pojo class
			Employee_POJO_with_Lombok emp=	new Employee_POJO_with_Lombok();
			
			
			         Response response= given()
					.header("Content-Type",ContentType.JSON)
					.body(emp)

					.post("https://reqres.in/api/users");

					 response.prettyPrint();

						};
		

}
