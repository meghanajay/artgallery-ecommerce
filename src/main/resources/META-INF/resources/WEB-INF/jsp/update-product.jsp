<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<title>Update product page</title>
</head>
<body>
	<div class="container">
		<h1>Update product details</h1>
	</div>
	
	<form method="post">
		Description : <input name="desc" type="text" value="${desc}"/> 
		Name : <input name="name" type="text" value="${name}"/>
		Price : <input name="price" type="number" value="${price}"/> 
		<input type="hidden" name="id" value="${id}">
		<input type="submit" value="SAVE"/>
	</form>


	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>