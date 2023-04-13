package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int k=(int) req.getAttribute("k");
		k=k*k;
		PrintWriter out= res.getWriter();
		res.setContentType("text/html");
		out.println("The result is : " +k);
		out.println("<h1> todays date is : "+new Date().toString()+"</h1>");

	}
}
