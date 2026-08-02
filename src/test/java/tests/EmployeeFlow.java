package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import apiservices.EmployeeServices;
import io.restassured.response.Response;
import model.requests.EmployeeRequest;
import model.response.DeleteResponse;
import model.response.EmployeeResponse;
import model.response.GetEmployeeResponse;
import model.response.getAllEmployeesResponse;

public class EmployeeFlow {
	
	EmployeeServices services = new EmployeeServices();
	
	@Test
	public void employeeFlowTest() {
		EmployeeRequest data = new EmployeeRequest();
		data.setName("Test User2");
		data.setAge("45");
		data.setSalary("40000");
		Response response = services.createEmployee(data);
		
		EmployeeResponse prd = response.as(EmployeeResponse.class);
		int id = prd.getData().getId();
		Assert.assertNotNull(id);
		Assert.assertEquals(prd.getData().getName(),"Test User2");
		
		Response getResponse  = services.GetEmployee(id);
		GetEmployeeResponse ger = getResponse.as(GetEmployeeResponse.class);
		String employeeName = ger.getData().getEmployee_name();
		Assert.assertEquals(employeeName, "Test User2");
		
		Response getAllResponse  = services.GetAllEmployee();
		getAllEmployeesResponse gaer = getAllResponse.as(getAllEmployeesResponse.class);
		//String employeeName = ger.getData().getEmployee_name();
		//Assert.assertEquals(employeeName, "Test User2");
		
		EmployeeRequest updateData = new EmployeeRequest();
		updateData.setName("User2 Test");
		updateData.setAge("25");
		updateData.setSalary("40000");
		Response updateResponse = services.updateEmployee(updateData, id);
		EmployeeResponse er = updateResponse.as(EmployeeResponse.class);
		String updatedName = er.getData().getName();
		Assert.assertEquals(updatedName, "User2 Test");
		
		Response DelResponse = services.deleteEmployee(id);
		DeleteResponse dr = DelResponse.as(DeleteResponse.class);
		String status = dr.getStatus();
		Assert.assertEquals(status, "success");
		String msg = dr.getMessage();
		Assert.assertEquals(msg, "successfully! deleted Records");
		
		
		
	}

}
