package com.example.webguineapig.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {

	private static final long serialVersionUID = 3522855845955091318L;
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse rsp) {
		Connection c;
		try {
			c = DriverManager.getConnection("bla");
			c.createStatement().execute(req.getParameter("sql"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
