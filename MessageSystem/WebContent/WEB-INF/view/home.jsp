<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="title"/></title>
</head>
<body>
<a href="en?lang=en">English</a>
<a href="tr?lang=tr">Türkçe</a>
<br><br>

<a href="form/showSendForm"><button><spring:message code="sendmoney"></spring:message></button></a>
<a href="form/showReceiveForm"><button><spring:message code="receivemoney"></spring:message></button></a>
<br><br>
<a href="sort/list">Sort the List</a>


</body>
</html>