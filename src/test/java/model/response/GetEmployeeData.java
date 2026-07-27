package model.response;

public class GetEmployeeData {
	private String status;
	private EmployeeData data;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public EmployeeData getEmployeeData() {
		return data;
	}
	
	public void setEmployeeData(EmployeeData data) {
		this.data = data;
	}

}
