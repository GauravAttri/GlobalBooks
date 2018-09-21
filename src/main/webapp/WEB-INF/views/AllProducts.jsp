<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="template/header.jsp" %>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>welcome ${Name}</h2>

 <div class="container-fluid">
<div class="table-responsive">
<table class="table">
<thead>
<tr>	
<th>ProductId</th>
<th>ProductName</th>
<th>Price</th>
<th>Quantity</th>
<th>Description</th>
<th>Image</th>
<th>More view</th>
</tr>
</thead>
<tbody>
<c:forEach items="${allProducts}" var="products">
<tr>
<td>${products.productId}</td>
<td>${products.productName}</td>
<td>${products.price}</td>
<td>${products.quantity}</td>
<td>${products.description}</td>
<td>${products.image}</td>


<td><img src="<c:url value="/resources/images/${products.image}.jpg" />" style="width:10%"/></td>
<td><a href="#" />view more<span class="glyphicon glyphicon-info-sign"></span></a></td>
 
</tr>
</c:forEach>
</tbody>
</table>
</div>
</div> 


</body>
</html>