<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form action="RegisterServlet" method="post">
			<table>
				<tr>
					<td>Enter Your name :</td>
					<td><input type="text" name="username"
						placeholder="Enter here"></td>
				</tr>
				<tr>
					<td>Enter Password :</td>
					<td><input type="password" name="password"
						placeholder="Enter here"></td>
				</tr>
				<tr>
					<td>Enter Your email :</td>
					<td><input type="email" name="email" placeholder="Enter here"></td>
				</tr>
				<tr>
					<td>Select your course</td>
					<td><select name="user_course" required>
							<option value="default">Select</option>
							<option value="java">java</option>
							<option value="PHP">PHP</option>
							<option value="Android">Android</option>
							<option value="C++">C++</option>
					</select></td>
				</tr>
				<tr>
				</tr>
				<tr>
					<td><button type="submit">Submit</button></td>
					<td><button type="reset">Reset</button></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>