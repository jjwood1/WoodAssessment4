<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Miles to Kilometers</title>
</head>
<body>
	<h1>Enter the amount of miles you would like to calculate!</h1>
	<form action="getMtoKServlet"method="post">
	Enter amount:
	<input type="text"name="UserMtoK"size="10">
	<input type="submit"value="Calculate Kilometers"/>
	</form>
	<a href="index.jsp">Click here to go back to the main menu!</a>	
</body>
</html>