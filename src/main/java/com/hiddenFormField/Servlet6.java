package com.hiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet6 extends HttpServlet{
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
			PrintWriter out=res.getWriter();
			res.setContentType("text/html");
			String name= req.getParameter("username");
			out.println("<h1 style='color:blue;'> Welcome to servlet 6</h1>");
			out.println("<h1 style='color:red;'> You name is : "+name+"</h1>");
		}
}
