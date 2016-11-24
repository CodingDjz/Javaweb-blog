<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html" ;charset="utf-8" />
<title>Blog title</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="">
	<nav class="navbar navbar-inverse navbar-fixed-top" style="opacity:0.9"
		role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#example-navbar-collapse">
				<span class="sr-only">切换导航</span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">丁君之个人网站</a>
		</div>
		<div class="collapse navbar-collapse" id="example-navbar-collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="#">BLOG</a></li>
				<li class=""><a href="#">简书</a></li>
				<li class=""><a href="#">Github</a></li>
				<li class=""><a href="#">吉他弹唱</a></li>
			</ul>
		</div>
	</div>
	</nav>

	<div style="margin: 5% 5% 5% 5%;">
		<table class="table table-hover table-striped">
			<thead>
				<tr>
					<th>文章</th>
					<th>日期</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<td><a href="aaa">川普当选美国总统</a></td>
					<td>23/11/2013</td>
				</tr>
				<tr>
					<td>创建个人网站步骤</td>
					<td>10/11/2013</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
