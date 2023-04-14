<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create New Blog</title>
</head>
<body>
    <h1>Create New Blog</h1>
    <p><%=request.getAttribute("rohoni") %></p>
    <form method="post" action="saveblogs">
        <label>Title:</label>
        <input type="text" name="Title"><br><br>
        <label>Content:</label><br>
        <textarea name="Content"></textarea><br><br>
        <input type="submit" value="Create Blog">
    </form>
</body>
</html>
