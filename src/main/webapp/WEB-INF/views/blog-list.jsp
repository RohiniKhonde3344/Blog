<%@page import="java.util.List"%>
<%@page import="com.Blog.Entity.Blog"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Blogs</title>
</head>
<body>
<h2>Your Blogs List is here..</h2> 

<form action="showblog" method="post">
  <% List<Blog>bg= (List<Blog>) request.getAttribute("blog"); 
        for(Blog i : bg){%>
        	  <p><a href=""><%=i.getTitle() %></a></p>
       <% }%>	
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        
        <a href="b1">1.Blog-AI</a> <input	type="submit" value="Save" /> <input	type="submit" value="Edit" /><input	type="submit" value="Delete" />   <input	type="submit" value="SeeAllComments" /><br><br><br>
<a href="b2">2.Blog-ML</a><input	type="submit" value="Save" /> <input	type="submit" value="Edit" /><input	type="submit" value="Delete" /><input	type="submit" value="SeeAllComments" /><br><br><br>
<a href="b3">3.Blog-IOT</a><input	type="submit" value="Save" /> <input	type="submit" value="Edit" /><input	type="submit" value="Delete" /><input	type="submit" value="SeeAllComments" /><br><br><br>
<a href="b4">4.Blog-RPA</a><input	type="submit" value="Save" /> <input	type="submit" value="Edit" /><input	type="submit" value="Delete" /><input	type="submit" value="SeeAllComments" /><br><br><br>
<a href="b5">5.Blog-DataScience</a><input	type="submit" value="Save" /> <input	type="submit" value="Edit" /><input	type="submit" value="Delete" /><input	type="submit" value="SeeAllComments" /><br><br><br>
  
</form>
</body>
</html>
