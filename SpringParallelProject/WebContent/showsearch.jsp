<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>

			<th bgcolor="Lavender">Customer Id</th>
			<th bgcolor="Lavender">Customer Name</th>
			<th bgcolor="Lavender">AccountBalance</th>
		</tr>
		<tr>
			<td>${temp.mobnum}</td>
			<td>${temp.custname}</td>
			<td>${temp.accbal}</td>
		</tr>
		<tr>
		<td colspan="5" align="center"><a href="index.jsp">Click Here To Go to Home</a></td>
	</tr>
	</table>

</body>
</html>