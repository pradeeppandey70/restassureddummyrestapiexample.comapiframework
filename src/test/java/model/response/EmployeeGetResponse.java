package model.response;

import java.util.List;

public class EmployeeGetResponse {
	private String status;
	private List<EmployeeData>data;
	
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

}
