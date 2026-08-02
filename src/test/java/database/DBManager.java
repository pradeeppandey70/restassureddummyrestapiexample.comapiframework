package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	
	public static ResultSet executeQuery(String query) throws SQLException {
		
		Statement statement = DBConnection.getConnection().createStatement();
		return statement.executeQuery(query);
	}
	
}
