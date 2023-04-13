package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First implements Servlet {
  private ServletConfig config;
	@Override
	public void destroy() {
		System.out.println("Going to destroy servlet object");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return this.config;
	}

	@Override
	public String getServletInfo() {
		
		return " Servlet interface";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this .config=config;
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out= res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>This is by implementing Servlet Interface </h1>");
		out.println("<h1> todays date is : "+new Date().toString()+"</h1>");
		
	}

}
