package com.durgesh;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int product=i*j;
		res.setContentType("text/html");
		int sum=(int)req.getAttribute("sum");
		PrintWriter out=res.getWriter();
		out.println("<h1> The sum is: " +sum + "  <hr>   The Product  is: " +product +" </h1>");
		
	}  
}

