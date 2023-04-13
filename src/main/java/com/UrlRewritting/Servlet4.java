package com.UrlRewritting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet4 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		String name= req.getParameter("user");
		out.println("<h1 style='color:blue;'> Welcome to servlet 4</h1>");
		out.println("<h1 style='color:red;'> You name is : "+name+"</h1>");
		
	}
	
}