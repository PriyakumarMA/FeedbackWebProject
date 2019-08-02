<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<div class="container"
			style="width: 30%; box-shadow: 10px 10px 8px 10px blue; box-shadow: 1px 0px 7px 3px blue; margin-top: 28px; border: 1px solid blue;">
			<center>
				<h1 style="color: red; font-family: monospace">Login Page</h1>
			</center>
			<form action="RetriveJobServlet?userName&password" method="get">
				<table>

					<td>
					<tr>
						<h3>UserName:</h3>
					</tr>
					<tr>
						<input id="username" type="text" name='userName' required></input>
					</tr>
					</td>

					<td>
					<tr>
						<h3>Password:</h3>
					</tr>
					<tr>
						<input id="password" type="password" name='password' required></input>
					</tr>
					</td>
					<td>
						<button style="width: 100%;" type="submit">Sign-In</button>
					</td>
				</table>
			</form>
		</div>
	</center>
</body>
</html>