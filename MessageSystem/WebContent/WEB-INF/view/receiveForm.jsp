<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="receivemoney"></spring:message></title>
</head>
<body>
<form:form action="processForm" modelAttribute="result">
		<p><spring:message code="receiveamount"/><form:input path="amount"/></p>	
		<form:select path="branchType">
			<form:option value="w"><spring:message code="web"></spring:message></form:option>
			<form:option value="m"><spring:message code="mobile"></spring:message></form:option>
			<form:option value="b"><spring:message code="boffice"></spring:message></form:option>
		</form:select>
		<button type="submit"><spring:message code="receivemoney"></spring:message></button>
	</form:form>

</body>
</html>