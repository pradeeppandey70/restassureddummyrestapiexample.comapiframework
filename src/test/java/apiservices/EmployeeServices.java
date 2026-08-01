package apiservices;

import clients.RestClients;
import io.restassured.response.Response;
import model.requests.EmployeeRequest;

public class EmployeeServices {
	private final RestClients clients = new RestClients();
	private static final String CREATE = "/create";
	private static final String UPDATE = "/update/";
	private static final String EMPLOYEE = "/employee/";
	private static final String EMPLOYEES = "/employees";
	private static final String DELETE = "/delete/";
	public Response createEmployee(EmployeeRequest request) {
		return clients.postRequest(request, CREATE, 200);	
	}
	
	public Response GetEmployee(int i) {
		return clients.getRequest(EMPLOYEE + i, 200);	
	}

	public Response GetAllEmployee() {
		return clients.getRequest(EMPLOYEES, 200);	
	}
	
	public Response updateEmployee(EmployeeRequest request, int i) {
		return clients.putRequest(request, UPDATE + i, 200);	
	}
	
	public Response deleteEmployee(String id) {
		return clients.deleteRequest(DELETE + id, 204);	
	}
	
	 

}
