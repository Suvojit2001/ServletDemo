package com.CookiesHandling;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		// getting all the cookie
		Cookie[] cookies = req.getCookies();
		boolean f = false;
		String name = "";
		if (cookies == null) {
			out.println("<h1> You are new Member </h1>");
			return;
		} else {
			for (Cookie c : cookies) {
				String temp = c.getName();
				if (temp.equals("user_name")) {
					f = true;
					name = c.getValue();
				}
			}
		}
		if (f) {
			out.println("<h1> Welcome " + name + " , to our website </h1>");
		}else {
			out.println("<h1> You are new Member </h1>");
		}
		
	}
}
