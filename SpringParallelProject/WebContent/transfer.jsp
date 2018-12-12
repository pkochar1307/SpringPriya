<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%--  <%@taglib prefix = "di" uri="http://www.springframework.org/tags/form" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="dotransfer">
		<table>
			<tr>
				<td>Source Mobile Number</td>
				<td><input type="text" name="smobnum" size="15" placeholder="Mobilenum"/></td>

			</tr>

			<tr>
				<td>Target Mobile Number</td>
				<td><input type="text" name="rmobnum" size="15" placeholder="Mobilenum"/></td>

			</tr>

			<tr>
				<td>Amount to be Transferred</td>
				<td><input type="text" name="acc" size="15" placeholder="amount"/></td>

			</tr>
			<tr>
				<td><input type="submit" value="Fund Transfer" />
			</tr>
		</table>

</form>

</body>
</html>