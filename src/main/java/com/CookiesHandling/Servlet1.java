package com.CookiesHandling;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String name=req.getParameter("name");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1> Welcome "+ name+" , to our website </h1>");
		out.print("<h1><a href='servlet2'> Go to Servlet 2 </a></h1>");
		
		// create a cookie
		
		Cookie c=new Cookie("user_name", name);
		res.addCookie(c);
// But using cookie there will be a runtime exception while you pass name like
// suvojit chatterjee , if there is a blank space then in servlet 2 only 1st name 
//will be show.		
		
		// now go to servlet2  and get cookie 
	}  
}
