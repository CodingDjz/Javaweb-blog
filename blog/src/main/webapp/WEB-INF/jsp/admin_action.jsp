<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>管理员操作</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin_action.css"
	type="text/css">
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/admin_action.js"></script>
</head>
<body>
	<div id="opt_div">
		<table class="table">
			<tr>
				<td><input type="button" onclick="article_savePage()"
					class="btn btn-md btn-primary" value="添加文章"></td>
				<td><input type="button" class="btn btn-md btn-primary"
					value="删除文章"></td>
			</tr>
		</table>
	</div>
</body>
</html>