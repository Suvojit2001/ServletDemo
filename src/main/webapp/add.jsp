<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Random" %>  <!--Directive tag  -->	
<%@page errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<!--In servlet we  write html in java file and in JSP we write java in html.
 that's the difference   -->
	<%!/*This is declarative tag , here we define variable, method  */
	int a = 5;
	public void soutName() {
		System.out.println("my name is khan");
	}	
	public String soutName(int a) {
		return "my name is khan ";
	}
	%>



	<%     /* This is scriptlet tag */
	out.println(new Date().toString());
	soutName(); // but this will print in console
	out.println("<br>" +soutName(a));
	%>
	
	
	<!--Expression tag-->
	<h1>The value of a is : <%=a%></h1>
	
	
	
	<%  Random r=new Random();
	    int n=r.nextInt(100);
	%>
	<h1>Random Number is : <%=n %></h1>

	
	
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));

	int k = i + j;
	out.print("output is : " + k);
	%>
	
	
	<%! 
	int n1=200;
	int n2=0;
	%>
	<% int division=n1/n2; %>
	<h1>The Division is : <%= division %></h1>
<!--Now this page will give error so we make an error page and add with this-->
	
	
	<%@include file="form.jsp" %>
	
</body>
</html>