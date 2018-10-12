<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@include file="template/header.jsp" %>


 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>
	Add a Product
</h1>
<form>
<table class="table">



 <tr> 
	<th>Product Image</th>
	<th>Product Name</th>
	<th>Product Description</th>
	
	
</tr>

<tr>

<td><img class="img-fluid" height="200px" width="200px" src="<c:url value="/resources/images/${product.productId}.png" />"></td>
<td>${product.productName}</td>
 <td>${product.description}</td>
</tr>


</table>
</form>
</body>
</html>