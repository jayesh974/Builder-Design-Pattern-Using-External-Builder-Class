package com.tests;

import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.github.javafaker.Faker;
import com.pojo.Employee;
import com.pojo.EmployeeBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BuilderPatternUsingExternalBuilderClassTest2 {
	
	@Test
	public void postJsonUsingBuilderTest() {
			
//		 we can ignore some parameters at runtime
		
		Employee employee = new EmployeeBuilder()
				.and()
		        .setFirst_name("sachine")
		        .and()
		        .setLast_name("potfode")
		        .and()
		        .setId(generateRandomId())
		        .with()
		        .build();
		
/*	second way of doing 	
		Employee employee1 = EmployeeBuilder.builder()
				.setFirst_name("sachine")
				.setLast_name("potfode")
				.setId(generateRandomId()).build();
		
*/		
		Response response = given().baseUri("http://localhost:3000")
		.contentType(ContentType.JSON)
		.log()
		.all()
		.body(employee)
		.post("/employees");
		
		System.out.println(generateRandomId());
		System.out.println(generateRandomEmail());
		Assert.assertEquals(response.getStatusCode(), 201);
		
	}

	private String generateRandomEmail() {
		String no = String.valueOf(new Faker().number().digits(2));
		String randomEmail = "jayesh"+no+"@gmail.com";
		return randomEmail ;
	}

	private String generateRandomId() {		
		return String.valueOf(new Faker().number().digits(2));
	}

}
