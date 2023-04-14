<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Comment for Blog 1</title>
</head>
<body>
<p><%=request.getAttribute("rohini") %></p>
<form  action="doComment" method="post">
			<h2>Write your comment here..</h2> 
			<input type="text" name="Comment"  />
			<input	type="submit" value="Save" />
			</form>
</body>
</html>