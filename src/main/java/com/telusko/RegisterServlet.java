package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException ,IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h2>Welcome to Register Servlet</h2>");
		String name=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String course=req.getParameter("user_course");
		
		out.println("<h1>"+name+"</h1>");
		out.println("<h1>"+password+"</h1>");
		out.println("<h1>"+email+"</h1>");
		out.println("<h1>"+course+"</h1>");
	}

}
