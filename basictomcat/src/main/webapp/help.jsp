<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Help</title>
</head>
<body>
	<div>
		<p>Topics</p>
		<ul>
			<% final String[] topics = (String[]) this.getServletContext().getAttribute("topics"); %>
			<% for (String topic : topics) {%>
			<li><%= topic %></li>
			<% } %>
		</ul>
	</div>
</body>
</html>