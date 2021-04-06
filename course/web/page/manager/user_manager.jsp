<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
<title>图书管理</title>
<link type="text/css" rel="stylesheet" href="./style.css" >

	<style>
		/*#main {*/
		/*	height: 600px;*/
		/*	width: 1200px;*/
		/*	border: 1px black solid;*/
		/*	overflow: auto;*/
		/*	margin: 0 auto;*/
		/*}*/
		#main table{
			margin: auto;
			border-collapse: collapse;
		}

		#main table td{
			width: 120px;
			text-align:center;
			border-bottom: 1px #e3e3e3 solid;
			padding: 10px;
		}
	</style>
</head>
<body>

	
	<div id="main">
		<table>
			<tr>
				<td>序号</td>
				<td></td>
				<td>用户名</td>
				<td></td>
				<td>密码</td>
				<td></td>
			</tr>
			<c:forEach items="${requestScope.users}" var="user">
				<tr>
					<td>${user.id}</td>
					<td></td>
					<td>${user.username}</td>
					<td></td>
					<td>${user.password}</td>
					<td></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>