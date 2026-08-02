package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import apiservices.EmployeeServices;
import io.restassured.response.Response;
import model.requests.EmployeeRequest;
import model.response.EmployeeResponse;
import model.response.GetEmployeeResponse;
import model.response.getAllEmployeesResponse;

public class Employees {
	EmployeeServices services = new EmployeeServices();
	
	@Test
	public void getAllEmployees(){
		Response response = services.GetAllEmployee();
		
		getAllEmployeesResponse eg = response.as(getAllEmployeesResponse.class);
		Assert.assertNotNull(eg.getStatus());
		Assert.assertEquals(eg.getData().get(0).getEmployee_name(), "Tiger Nixon");
		Assert.assertEquals(eg.getMessage(), "Successfully! All records has been fetched.");
		
	}
	
	@Test
	public void createEmployee(){
		EmployeeRequest data = new EmployeeRequest();
		data.setName("Test User1");
		data.setAge("32");
		data.setSalary("40000");
		Response response = services.createEmployee(data);
		
		EmployeeResponse prd = response.as(EmployeeResponse.class);
		Assert.assertNotNull(prd.getData().getId());
		Assert.assertEquals(prd.getData().getName(),"Test User1");
		Assert.assertEquals(prd.getStatus(), "success");
		//return id;
		
		
	}
	
	@Test
	public void getEmployee() {
		Response response = services.GetEmployee(1);
		GetEmployeeResponse ger = response.as(GetEmployeeResponse.class);
		Assert.assertEquals(ger.getStatus(),"success");
		Assert.assertEquals(ger.getData().getEmployee_name(),"Tiger Nixon");
	}
	
	@Test
	public void updateEmployee() {
		EmployeeRequest data = new EmployeeRequest();
		data.setName("User Test");
		data.setAge("32");
		data.setSalary("40000");
		Response response = services.updateEmployee(data, 1);
		EmployeeResponse uer = response.as(EmployeeResponse.class);
		Assert.assertEquals(uer.getData().getName(), "User Test");
		//Assert.assertEquals(uer.getData().getId(), 1);
		//need to create a separate pojo response class
		
	}
	
	
	
	

}
