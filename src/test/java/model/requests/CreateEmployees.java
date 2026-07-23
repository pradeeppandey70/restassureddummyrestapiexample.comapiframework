package model.requests;

public class CreateEmployees {
	
	private String name;
	private String salary;
	private String age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAge() {
		return age;
	}

}
