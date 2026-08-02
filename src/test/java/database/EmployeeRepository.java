package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.database.Employee;

public class EmployeeRepository {
	
	public Employee getEmployee(int employeeId) throws SQLException {
		
		String query = "select * from employee where employee_id = " + employeeId;
		
		ResultSet rs = DBManager.executeQuery(query);
		
		Employee employee = new Employee();
		
		if(rs.next()) {
			employee.setId(rs.getInt("id"));
			employee.setName(rs.getString("name"));
			employee.setSalary(rs.getString("salary"));
			employee.setAge(rs.getString("age"));
		}
		
		return employee;
	}

}
