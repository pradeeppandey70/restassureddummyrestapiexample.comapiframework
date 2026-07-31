package model.response;

public class UpdateEmployeeResponse {
	
	private CreateEmployeeResponse employee;

	/**
	 * @return the employee
	 */
	public CreateEmployeeResponse getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(CreateEmployeeResponse employee) {
		this.employee = employee;
	}

}
