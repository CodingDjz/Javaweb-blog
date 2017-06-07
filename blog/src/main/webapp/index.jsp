<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="content-type" content="text/html" charset="utf-8" />
<meta name="viewport"
        content="width=device-width, initial-scale=0.5, minimum-scale=0.5, maximum-scale=0.5, user-scalable=no" />

<title>dejunz的主页</title>
<link href="./css/index.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div>
		<h1 id="click_in">
			<a href="<%=request.getContextPath()%>/article/main">点击进入</a>
		</h1>
	</div>
	<div>
		<img alt="programmer"
			src="<%=request.getContextPath()%>/image/welcome.png">
	</div>
	<div>
		<footer id="record">
		<a href="http://www.miitbeian.gov.cn/">京ICP备17014652号-1</a></footer>
	</div>
</body>
</html>
