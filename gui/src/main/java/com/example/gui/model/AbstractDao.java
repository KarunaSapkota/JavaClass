package com.example.gui.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao<T> implements DataAccessObject<T> {
	String dbUrl;
	String dbUsername;
	String dbPassword;
	Connection con;

	public void connect() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	}

	public void disconnect() throws SQLException {
		con.close();

	}

}
