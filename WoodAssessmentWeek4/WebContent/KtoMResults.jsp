<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kilometers to Miles</title>
</head>
<body>
	<p>${KtoMValue.getKilometers()} kilometers is <br /> 
	${KtoMValue.getMiles()} miles.</p>>
	<a href="index.jsp">Click here to go back to the main menu!</a>	
</body>
</html>