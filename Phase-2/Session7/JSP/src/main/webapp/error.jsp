<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- print the exception -->
<%= exception %>
<hr>
<%= "Message: " + exception.getMessage() %>
<hr>
<!-- Print exceptiontrace using printWriter object -->
<% exception.printStackTrace(response.getWriter()); %>

</body>
</html>