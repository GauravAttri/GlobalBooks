<%@include file="template/header.jsp"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="${pageContext.request.contextPath}/addproduct" method="post" commandName="product" enctype="multipart/form-data">

		<div class="container-wrapper">
			<div class="container">
				<div class="page-header">
					<h1>Add Product</h1>


					<p class="lead">Fill the below information to add a product:</p>
				</div>



				<%-- <div class="form-group">
					<label for="Id">ID</label>
					<form:errors path="productId" cssStyle="color:#ff0000;" />
					<form:input path="productId" id="Id" class="form-Control" />
				</div> --%>

				<div class="form-group">
					<label for="name">ProductName</label>
					<form:errors path="productName" cssStyle="color:#ff0000;" />
					<form:input path="productName" id="name" class="form-Control" />
				</div>


				<div class="form-group">
					<label for="price">ProductPrice</label>
					<form:textarea path="price" id="price" class="form-Control" />
				</div>

				<div class="form-group">
					<label for="quantity">ProductQuantity</label>
					<form:errors path="quantity" cssStyle="color:#ff0000;" />
					<form:input path="quantity" id="quantity" class="form-Control" />
				</div>



				<div class="form-group">
					<label for="description">description</label>
					<form:errors path="description" cssStyle="color:#ff0000;" />
					<form:input path="description" id="description"
						class="form-Control" />
				</div>





				<div class="form-group">
					<label class="control-label" for="image">ProductImage</label>
					<form:input id="image" path="image" type="file"
						class="form:input-large" />
				</div>

				<br /> <br /> <input type="submit" value="submit"
					class="btn btn-default" /> 
					<a href="<c:url value="/AllProduct" /> "> Cancel</a>
			</div>
		</div>
	</form:form>


</body>
</html>