<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
  	<div style="background-image: 'img/1.jpg'">
  		<div class="head" style="height: 50px;width: auto;">
  			7872：张艺亨
  		</div>
  		<div class="container">
  			<form action="<%=request.getContextPath() %>/LoginServlet" method="post">
	  			<table align="center" style="margin-top: 200px" border="1px">
	  				<tr><td colspan="2">电影租赁管理系统</td></tr>
	  				<tr> <td>用户名：</td><td><input type="text" name="user"></td></tr><br>
	  				<tr> <td>密码：</td><td><input type="password" name="password"></td></tr>
					<tr><td colspan="2"><input type="submit" value="登录"></td></tr>
				</table>
  			
  			</form>
  		</div>
  	</div>
  </body>
</html>
