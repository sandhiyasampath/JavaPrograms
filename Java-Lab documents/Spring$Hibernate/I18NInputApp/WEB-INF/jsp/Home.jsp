<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>    
<%@ taglib prefix="sc" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HomePage</h1>
	<s:form action="register"  modelAttribute="reg">
		<sc:message code="label.firstname"/><s:input path="uname"/><s:errors path="uname"/><br/>
		Enter dob:<s:input path="dob"/><s:errors path="dob"/><br/>
		Enter email:<s:input path="email"/><s:errors path="email"/><br/>
		Upload<input type="file" name="pic"/><s:errors path="pic"/><br/>
		<input type="submit"/>
		<br/>
		
	</s:form>
	
</body>
</html>