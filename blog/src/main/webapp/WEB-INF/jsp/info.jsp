<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Save Article</title>
</head>
<body>
	<form action="jsp/main" method="post">
		文章名：<input type="text" name="title"><br>
		类别：<input type="text" name="category"><br>
		内容路径：<input type="text" name="contentPath"><br>
		<input type="radio" name="isOriginal" value="male">原创	
		<input type="radio" name="isOriginal" value="female">转载<br>	
		<input type="submit" value="保存文章">
	</form>
</body>
</html>