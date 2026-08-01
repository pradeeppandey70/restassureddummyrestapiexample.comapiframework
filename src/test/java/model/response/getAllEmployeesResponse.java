package model.response;

import java.util.List;

public class getAllEmployeesResponse {
	private String status;
	private List<EmployeesData>data;
	private String message;
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setData(List<EmployeesData> data) {
		this.data = data;
	}
	
	public List<EmployeesData> getData() {
		return data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
