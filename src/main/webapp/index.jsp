<%@page import="java.sql.ResultSet"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link type="text/css" rel="stylesheeet" href="css/bootstrap.min.css">
  </head>
  
  <body>
	<div>
		<div class="head" style="height: 50px;width: auto;">
			7872:张艺亨
		</div>
		<div class="container">
			<ul class="nav nav-pills nav-stacked">
				<li><a href="#">Customer管理</a></li>
				<li><a href="#">Film設置</a></li>
			</ul>
			<table border="1px">
				<tr><td>操作</td><td>First Name</td><td>Last Name</td><td>Address</td><td>Email</td><td>CustomerId</td><td>LastUpdate</td></tr>
				<%
					ResultSet rs = (ResultSet)session.getAttribute("result");
					while(rs.next()){
						out.print("<tr>");
	  		 			out.print("<td>");
	  		 			out.print("<a href='#' name = 'bianji'>编辑</a>"+"|"+
	  		 			"<a href='#' name = '删除'>删除</a>");
	  		 			out.print("</td>");
	  		 			out.print("<td>");
	  		 			out.print(rs.getString("first_name"));
	  		 			out.print("</td>");
	  		 			out.print("<td>");
	  		 			out.print(rs.getString("last_name"));
	  		 			out.print("</td>");
	  		 			out.print("<td>");
	  		 			out.print(rs.getString("address"));
	  		 			out.print("</td>");
	  		 			out.print("<td>");
	  		 			out.print(rs.getString("email"));
	  		 			out.print("</td>");
	  		 			out.print("<td>");
	  		 			out.print(rs.getInt("customer_id"));
	  		 			out.print("</td>");
	  		 			out.print("<td>");
	  		 			out.print(rs.getDate("last_update"));
	  		 			out.print("</td>");
	  					out.print("</tr>");
					
					}
				 %>
			</table>
		</div>
	</div>
  </body>
</html>
