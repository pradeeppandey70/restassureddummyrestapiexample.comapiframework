package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import base.ConfigReader;

public class DBConnection {
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		
		if(connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(
					ConfigReader.getConfig("dburl"),
					ConfigReader.getConfig("dbuser"),
					ConfigReader.getConfig("dbpassword"));
		}
		return connection;
	}

}
