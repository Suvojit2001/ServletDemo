package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Second extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out= res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>This is by Extending Generic  Servlet , which is abstract class </h1>");
		out.println("<h1> todays date is : "+new Date().toString()+"</h1>");
		
	}
	

}
