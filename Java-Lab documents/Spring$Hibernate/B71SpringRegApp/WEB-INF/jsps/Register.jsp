<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	
	<sp:form action="register" method="post" modelAttribute="reg">
		Enter name:<sp:input path="uname"/><sp:errors path="uname"/><br/>
		Enter email:<sp:input path="email"/><sp:errors path="email"/><br/>
		Enter pass:<sp:password path="pass"/><sp:errors path="pass"/><br/>
		Repeat pass:<sp:password path="rpass"/><sp:errors path="rpass"/><br/>
		Enter dob(dd/mm/yyyy):<sp:input path="dob"/><sp:errors path="dob"/><br/>
		<input type="submit"/>	
	
	</sp:form>
	
	
</body>
</html>


