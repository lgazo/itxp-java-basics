<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<body>
	<%-- Log error on server side --%>
	<%
		//When the page attribute "isErrorPage" is set to "true" the exception object is available
//		System.err.println("Error : " + exception.getMessage());
//		exception.printStackTrace();
	%>

	<%-- Display generic error to client --%>
	<b>An error occur !</b>
</body>
</html>