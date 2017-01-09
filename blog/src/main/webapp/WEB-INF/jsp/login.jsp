<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理员登录</title>
<link href="${pageContext.request.contextPath}/css/login.css"
	rel="stylesheet" type="text/css" />

<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div id="formDiv">

		<form class="signin" method="post"
			action="<%=request.getContextPath()%>/admin/login" accept-charset="UTF-8">
			<h2 class="form-signin-heading">登录</h2>
			<div class="form-group">
				<input type="text" name="account" class="form-control"
					placeholder="请输入用户名" />
			</div>
			<div class="form-group">
				<input type="password" name="password" class="form-control"
					placeholder="请输入密码" />
			</div>

			<div class="form-group" style="text-align: center;">
				<input type="submit" class="btn btn-md btn-primary" value="登录">
				<!-- <input type="button" class="btn btn-md btn-primary" value="注册"> -->
			</div>
		</form>
	</div>
</body>
</html>