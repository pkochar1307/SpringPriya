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
	<h1>Enter the Customer Details</h1>
	<foo:form action="addata" method="post" modelAttribute="my">
		<table>
			<tr>
				<td>Customer Mobile Number</td>
				<td><foo:input path="mobnum" size="15" placeholder="Mobilenumber" /></td>
				<td><foo:errors path="mobnum"></foo:errors></td>
			</tr>

			<tr>
				<td>Customer Name</td>
				<td><foo:input path="custname" size="15" placeholder="CustName" /></td>
				<td><foo:errors path="custname"></foo:errors></td>
			</tr>

			<tr>
				<td>Account Balance</td>
				<td><foo:input path="accbal"/></td>
				<td><foo:errors path="accbal"></foo:errors></td>
			</tr>

			<tr>
				<td colspan=2><input type="submit" value="Add Customer" /></td>
			</tr>

		</table>

	</foo:form>

</body>
</html>