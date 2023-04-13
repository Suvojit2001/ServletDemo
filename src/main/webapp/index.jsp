<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="add" method="get"> <!-- By default method="get" , if we 
change it to post then check the url after run , see the difference -->
		Enter 1st number : <input type="text" name="num1"><br>
		Enter 2nd number : <input type="text" name="num2"><br>
		<input type="submit">
</form>
<a href="form.jsp">form.jsp</a>

</body>
</html>