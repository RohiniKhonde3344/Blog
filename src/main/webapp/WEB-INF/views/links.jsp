
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <p><%=request.getAttribute("links") %></p>
<form action="links" method="get">
<%
    List<String> links = (List<String>) request.getAttribute("links");
    for (String link : links) {
%>
    <p><%= link %></p>
<%
    }
%>
</body>
</html>