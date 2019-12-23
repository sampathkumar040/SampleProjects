<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1><center>Register Student Details</center></h1>
<form:form method="POST" commandName="stCmd">
Number: <form:input path="sno"/><br>
Name: <form:input path="sname"/><br>
Addrs:<form:input path="sadd"/><br>
<input type="submit" value="register"/>




</form:form>