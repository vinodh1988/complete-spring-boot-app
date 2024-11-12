<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1>Spring boot Works!!!!</h1>
 <ul>
 
 <%
 String[] names=  (String[]) request.getAttribute("names")  ;
 for(String x:names){
 %>
 <li><%=x%></li>
 <%}%>
 <h3>No of times accessed in the session:: <%=request.getAttribute("sdata")%></h3>
 <h3>No of times accessed in the Appliction:: <%=request.getAttribute("adata")%></h3>
 </ul>
</body>
</html>