package model.response;

import java.util.List;

public class getAllEmployeesResponse {
	private String status;
	private List<EmployeeData>data;
	private String message;
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setData(List<EmployeeData> data) {
		this.data = data;
	}
	
	public List<EmployeeData> getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
