<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kilometers to Miles</title>
</head>
<body>
	<h1>Enter the amount of Kilometers you would like to calculate!</h1>
	<form action="getKtoMServlet"method="post">
	Enter amount of kilometers:
	<input type="text"name="UserKtoM"size="10">
	<input type="submit"value="Calculate Miles"/>
	</form>
	<a href="index.jsp">Click here to go back to the main menu!</a>	
</body>
</html>