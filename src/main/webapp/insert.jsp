<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<div>
  		<table>
  			<tr><td>First Name</td><td><input type="text" name="fname"></td></tr>
  			<tr><td>Last Name</td><td><input type="text" name="lname"></td></tr>
  			<tr><td>email</td><td><input type="text" name="email"></td></tr>
  			<tr><td>Address</td><td>
  				<select>
  					<option value="">hehe</option>
  				</select>
  			</td>
  		</table>
  	</div>
  </body>
</html>
