<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑图书</title>
<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
	
	input {
		text-align: center;
	}
</style>
</head>
<body>
		
		<div id="main">
			<form action="manager/selectUser" method="post">
				<input type="hidden" name="action" value="add">
				<table>
					<tr>
						<td>账号</td>
						<td>密码</td>
						<td>邮箱</td>
						<td colspan="2">操作</td>
					</tr>		
					<tr>
						<td><input name="username" type="text" value=""/></td>
						<td><input name="password" type="text" value=""/></td>
						<td><input name="email" type="text" value=""/></td>
						<td><input type="submit" value="提交"/></td>
					</tr>	
				</table>
			</form>
			
	
		</div>
</body>
</html>