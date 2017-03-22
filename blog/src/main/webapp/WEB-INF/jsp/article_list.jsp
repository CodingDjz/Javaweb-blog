<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html" ;charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />  
<title>文章列表</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/article_list.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js">
	
</script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/article_list.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" style="opacity:0.9"
		role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#example-navbar-collapse">
				<span class="sr-only">切换导航</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand"
				href="<%=request.getContextPath()%>/admin/loginPage" target="_blank">dejunz</a>
		</div>
		<div class="collapse navbar-collapse" id="example-navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="./main">Blog</a></li>
				<li class=""><a
					href="http://www.jianshu.com/users/fcf56eda9143/latest_articles"
					target="_blank">简书</a></li>
				<li class=""><a href="https://github.com/CodingDjz"
					target="_blank">Github</a></li>
				<li class=""><a
					href="https://github.com/CodingDjz/MyGuitarMusic" target="_blank">吉他弹唱</a></li>
				<li class="">&nbsp; &nbsp;</li>
				<li class=""><a
					href="<%=request.getContextPath()%>/handle/developing"
					target="_blank">留言</a></li>

			</ul>
		</div>
	</div>
	</nav>

	<div style="margin: 5% 5% 5% 5%; padding-top: 5%">
		<!-- table-striped是斑马线设置！ -->
		<table class="table table-hover table-striped">
			<thead>
				<tr>
					<th>文章名</th>
					<th>日期</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${articles}" var="article">
					<tr onclick="articleContent(${article.id})">
						<td><input id="articleId" type="hidden" value="${article.id}" /></td>
						<td><a>${article.title}</a></td>
						<td>${article.createTime}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
