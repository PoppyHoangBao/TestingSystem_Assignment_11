package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private String url = "jdbc:mysql://localhost:3306/classicmodels";
	private String user = "root";
	private String pass = "bobbibao";
	private Connection conn;
	private ConnectDB instance;
	
	public ConnectDB() {
		try {
			this.conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public ConnectDB getInstance() {
		if(this.instance == null)
			new ConnectDB();
		return this.instance;
	}
	public Connection getConnection() {
		return this.conn;
	}
}
