<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>爱·健身会员注册页面</title>
	<base href="http://localhost:8080/fit/">
	<link type="text/css" rel="stylesheet" href="static/css/style.css" >
<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
	
	h1 a {
		color:red;
	}
</style>
</head>
<body>
		<div id="header">
				<img class="logo_img" alt="" src="static/img/logo.gif" >
				<div>
					<span>欢迎<span class="um_span">韩总</span>光临尚硅谷书城</span>
					<a href="../order/order.html">我的订单</a>
					<a href="index.jsp">注销</a>&nbsp;&nbsp;
					<a href="index.jsp">返回</a>
				</div>
		</div>
		
		<div>

			<div class="suc_form">
				<form action="">
				<laber>输入姓名:</laber>
				<input type="text" autocomplete="off" tabindex="1" name="uname" class="suc_inp">
				<br>
				<br>
				<laber>选择时间:</laber>
				<input type="date" name="udata" id="" class="suc_date">
					<br>
					<br>
					时间:
					<input type="radio" name="question1" value="am">上午
					&nbsp;
					<input type="radio" name="question1" value="pm">下午
					<br>
					<br>
					<input type="submit" value="登录" id="suc_btn" />
			</form>

			</div>
	
		</div>
		
		<div id="bottom">
			<span>
				尚硅谷书城.Copyright &copy;2015
			</span>
		</div>
</body>
</html>