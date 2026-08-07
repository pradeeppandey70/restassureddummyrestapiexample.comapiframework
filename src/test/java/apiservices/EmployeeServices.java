package apiservices;



import org.slf4j.Logger;

import clients.RestClients;
import io.restassured.response.Response;
import model.requests.EmployeeRequest;
import utils.LoggerUtils;

public class EmployeeServices {
	private static final Logger logger = LoggerUtils.getlogger(EmployeeServices.class);
	private final RestClients clients = new RestClients();
	private static final String CREATE = "/create";
	private static final String UPDATE = "/update/";
	private static final String EMPLOYEE = "/employee/";
	private static final String EMPLOYEES = "/employees";
	private static final String DELETE = "/delete/";
	
	public Response createEmployee(EmployeeRequest request) {
		logger.info("Creating Employee");
		return clients.postRequest(request, CREATE, 200);	
	}
	
	public Response GetEmployee(int i) {
		logger.info("Getting Employee");
		return clients.getRequest(EMPLOYEE + i, 200);	
	}

	public Response GetAllEmployee() {
		logger.info("Gettin all Employees");
		return clients.getRequest(EMPLOYEES, 200);	
	}
	
	public Response updateEmployee(EmployeeRequest request, int i) {
		logger.info("Updating Employee");
		return clients.putRequest(request, UPDATE + i, 200);	
	}
	
	public Response deleteEmployee(int id) {
		logger.info("Deleting Employee");
		return clients.deleteRequest(DELETE + id, 204);	
	}
	
	 

}
