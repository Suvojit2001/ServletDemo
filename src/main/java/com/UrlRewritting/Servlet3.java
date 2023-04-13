package com.UrlRewritting;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		PrintWriter out=res.getWriter();
		res.setContentType("text/html");
		String name= req.getParameter("username");
		out.println("<h1 style='color:blue;'> You name is : "+name+"</h1>");
		out.println("<a href='servlet4?user="+name+"'>Go to servlet 4 </a>");
	}
	
}
