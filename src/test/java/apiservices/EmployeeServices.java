package apiservices;

import clients.RestClients;
import io.restassured.response.Response;
import model.requests.CreateEmployees;

public class EmployeeServices {
	private final RestClients clients = new RestClients();
	private static final String CREATE = "/create";
	private static final String UPDATE = "/update/";
	private static final String EMPLOYEE = "/employee/";
	private static final String EMPLOYEES = "/employees";
	private static final String DELETE = "/delete/";
	public Response createEmployee(CreateEmployees request) {
		return clients.postRequest(request, CREATE, 201);	
	}
	
	public Response GetEmployee(String id) {
		return clients.getRequest(EMPLOYEE + id, 200);	
	}

	public Response GetAllEmployee() {
		return clients.getRequest(EMPLOYEES, 200);	
	}
	
	public Response updateEmployee(CreateEmployees request, String id) {
		return clients.putRequest(request, UPDATE + id, 201);	
	}
	
	public Response deleteEmployee(String id) {
		return clients.deleteRequest(DELETE + id, 204);	
	}
	
	 

}
