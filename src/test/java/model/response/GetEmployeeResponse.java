package model.response;

public class GetEmployeeResponse {
	private String status;
	private EmployeesData data;
	private String message;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public EmployeesData getData() {
		return data;
	}
	
	public void setData(EmployeesData data) {
		this.data = data;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
