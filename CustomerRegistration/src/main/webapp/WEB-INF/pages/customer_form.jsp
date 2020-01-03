<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    <h1 style="color:red;text-align:center">Customer Register form</h1> 
   <form:form method="POST" commandName="custCmd">
   Customer name::<form:input path="cname"/>
   Customer addrs::<form:input path="addrs"/>
   Customer mobileNo::<form:input path="mobileNo"/>
   Customer amount::<form:input path="billAmt"/>
   <input type="submit" value="register"/>
   
   
   
   </form:form> 
    
