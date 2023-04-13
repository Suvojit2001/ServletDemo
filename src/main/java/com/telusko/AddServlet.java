package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Here HttpServlet is also abstract class 
public class AddServlet extends HttpServlet{
/*	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		PrintWriter out= res.getWriter();
		out.println("The result is : " +k);
//		System.out.println("The result is : " +k);
	}  */
	
/* <h1> By doing the method name doPost it will only work if method="post" in 
  index.jsp , if you put method="get" then there will be error 
tips: use post method when you want to hide data from user by not showing url </h1>*/
	
	
/*	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		PrintWriter out= res.getWriter();
		out.println("The result is : " +k);

	}*/
	
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
//		PrintWriter out= res.getWriter();
//		out.println("The result is : " +k);
		
		 req.setAttribute("k",k);
		RequestDispatcher rd=req.getRequestDispatcher("sq");
		rd.forward(req, res);

	}
}
