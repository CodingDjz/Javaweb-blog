<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />  
<title>管理员登录</title>
<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet" type="text/css" />

<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/login.js"></script>
<script src="${pageContext.request.contextPath}/js/regist.js"></script>
</head>
<body>

	<div id="formDiv">
		<form class="signin" method="post"
			action="<%=request.getContextPath()%>/admin/login"
			accept-charset="UTF-8" onsubmit="return loginCheck()">
			<h2 class="form-signin-heading">管理员登录</h2>
			<div class="form-group">
				<input id="account" type="text" name="account" class="form-control"
					placeholder="请输入用户名" />
			</div>
			<div class="form-group">
				<input id="password" type="password" name="password"
					class="form-control" placeholder="请输入密码" />
			</div id="result_msg" class="form-group" >
			<% if(request.getAttribute("result_msg")!=""){%>
			<font color="#F00">${result_msg} </font>
			<% }%>

			<div></div>
			<div class="form-group" style="text-align: center;">
				<input type="submit" class="btn btn-md btn-primary" value="登录">
				<input type="button" onclick="registPage()"
					class="btn btn-md btn-primary" value="注册">
			</div>
		</form>
	</div>
</body>
</html>