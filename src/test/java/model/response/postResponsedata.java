package model.response;

public class postResponsedata {
	
	private String status;
	private EmployeeData empData;
	
	public String getResStatus() {
		return status;
	}
	
	public void SetResStatus(String status) {
		this.status = status;
	}
	
	public EmployeeData getemployeeData() {
		return empData;
	}
	
	public void setemployeeData(EmployeeData empData) {
		this.empData=empData;
	}
	
	

}
