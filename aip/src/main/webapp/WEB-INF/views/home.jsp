 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Find Items</h1>
<P>  The time on the server is ${serverTime}. </P>
<table border=1>
	<tr>
    	<td>Code</td>
		<td>Description</td>
		<td>Category</td>
		<td>QTY</td>
	</tr>
	<c:forEach var="product" items="${products}" varStatus="loopStatus">
	
    <tr>
		<td><c:out value="${product.code}"/></td>
		<td><c:out value="${product.description}"/></td>
		<td><c:out value="${product.category}"/></td>
		<td><c:out value="${product.qty}"/></td>
 	</tr>
	</c:forEach>
</table>
</body>
</html>

</body>
</html>
