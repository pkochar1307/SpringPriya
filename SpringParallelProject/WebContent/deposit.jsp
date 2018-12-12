<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="foo" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<foo:form action="dodeposit" method="post" modelAttribute="yy">
			<tr>
				<td>Customer Mobile Number</td>
				<td><foo:input path="mobnum" size="15" placeholder="Mobilenum" /></td>
				<td><foo:errors path="mobnum"></foo:errors></td>
			</tr>

			<tr>
				<td>Account Balance</td>
				<td><foo:input path="accbal" /></td>
				<td><foo:errors path="accbal"></foo:errors></td>
			</tr>
			<tr>
				<td><input type="submit" value="Deposit Amount" />
			</tr>



		</foo:form>
	</table>
</body>
</html>