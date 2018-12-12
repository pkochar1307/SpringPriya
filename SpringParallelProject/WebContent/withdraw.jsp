<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix = "di" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<di:form action="dowithdraw" method="post" modelAttribute="aa">
<tr>
<td >Customer Id </td>
<td><di:input path = "mobnum" size="15" placeholder="Mobilenum"/></td>
<td><di:errors path="mobnum"></di:errors></td>
</tr>

<tr>
<td >Account Balance </td>
<td><di:input path = "accbal"/></td>
<td><di:errors path="accbal"></di:errors></td>
</tr>
<tr>
<td><input type="submit" value="Withdraw Amount"/>
</tr>



</di:form>
</table>
</body>
</html>