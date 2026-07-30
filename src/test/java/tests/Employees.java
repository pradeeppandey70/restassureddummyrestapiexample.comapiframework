package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import apiservices.EmployeeServices;
import io.restassured.response.Response;
import model.response.EmployeeGetResponse;

public class Employees {
	EmployeeServices services = new EmployeeServices();
	
	@Test
	public void getAllEmployees(){
		Response response = services.GetAllEmployee();
		
		EmployeeGetResponse eg = response.as(EmployeeGetResponse.class);
		Assert.assertNotNull(eg.getStatus());
		Assert.assertEquals(eg.getData().get(0).getEmployee_name(), "Tiger Nixon");
		Assert.assertEquals(eg.getMessage(), "Successfully! All records has been fetched.");
		
	}

}
