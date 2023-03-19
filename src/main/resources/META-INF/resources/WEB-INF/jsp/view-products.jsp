<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	<head>
	<title>product list</title>
	</head>
<body>
	<div>
		<h1>Products</h1>
		<table class="table">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Description</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productinfo}" var="productinfo">
					<tr>
						<td>${productinfo.id}</td>
						<td>${productinfo.name}</td>
						<td>${productinfo.desc}</td>
						<td>${productinfo.price}</td>
						<td><a href="update-product/${productinfo.id}" class="btn btn-success">Edit</a></td>
					</tr>
				</c:forEach>
			</tbody>
			<a href="add-product" class="btn btn-success">Add</a>
		</table>

	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>