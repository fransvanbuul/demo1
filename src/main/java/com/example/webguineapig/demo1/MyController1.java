package com.example.webguineapig.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ctrl1")
public class MyController1 {

	@GetMapping("/bla")
	public void bla(@RequestParam String sql) {
		Connection c;
		try {
			c = DriverManager.getConnection("bla");
			c.createStatement().execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
}
