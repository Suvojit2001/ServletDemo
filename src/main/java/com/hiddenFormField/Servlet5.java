package com.hiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet5 extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("username");
		out.println("<h1 style='color:blue;'> Welcome to servlet 5</h1>");
		out.println("<h1 style='color:red;'> You name is : "+name+"</h1>");
		out.println("<form action='servlet6' >"
				+ "		<table>"
				+ "			<tr>"			
				+ "				<td><input type='hidden' name='username' value='"+name+"'></input></td>"
				+ "			</tr>"
				+ "		</table>"
				+ "		<button type='submit'>Go to servlet 6</button>"
				+ "	</form>");
	}
}