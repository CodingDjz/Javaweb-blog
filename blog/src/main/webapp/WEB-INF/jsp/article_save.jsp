<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Save Article</title>
<style type="text/css">
body {
	background-image: url(../image/index_bgp1.jpg);
}
</style>
</head>
<body>
	<form action="./saveDB" method="post">
		文章名：<input type="text" name="title" value="文章"><br> 类别：<input
			type="text" name="category" value="2"><br> 内容路径：<input type="text"
			name="contentPath" value="www.baidu.com"><br> <input type="radio"
			name="isOriginal" value="true" checked="checked"> 原创 <input type="radio"
			name="isOriginal" value="false"> 转载<br> <input
			type="submit" value="保存文章">
	</form>
</body>
</html>