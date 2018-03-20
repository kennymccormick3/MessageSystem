<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="result">
		
		<p><spring:message code="bakiye"/><form:input path="balance"/></p>
		<br>
		<p><spring:message code="gonderilecektutar"/><form:input path="amount"/></p>	
		<br>
		
		<input type="submit" value="Send"/>
		
	</form:form>
</body>
</html>