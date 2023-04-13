<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is page 2</h1>
  <%
  // redirect to page3 (redirect3.jsp)
  //response.sendRedirect("redirect3.jsp");
  response.sendRedirect("https://www.google.com/");
  %>
</body>
</html>