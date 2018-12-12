<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th bgcolor="Lavender">Customer Id :</th>
			<th bgcolor="Lavender">Customer Name :</th>
			<th bgcolor="Lavender">Customer Balance :</th>
		</tr>

		<a:forEach var="cust" items="${data}">
			<tr>
				<td><a:out value="${cust.mobnum}"></a:out></td>
				<td><a:out value="${cust.custname}"></a:out></td>
				<td><a:out value="${cust.accbal}"></a:out></td>
			</tr>
		</a:forEach>
		<tr>
			<td colspan="5" align="center"><a href="index.jsp">Go to Home Page</a></td>
		</tr>
	</table>
</body>
</html>