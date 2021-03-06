<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Save Article</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/article_save.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/article_save.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="aboveDiv">文章录入</div>
	<div id="mainDiv">
		<form action="<%=request.getContextPath()%>/article/save"
			method="post" enctype="multipart/form-data" role="form"
			onsubmit="return formCheck()">
			<div class="form-group">
				<label for="title" class="control-label">标题</label> <input
					type="text" name="title" class="form-control" id="title"
					placeholder="文章标题">
			</div>
			<div class="form-group">
				<label for="category" class="control-label">类别</label>
				<!-- <input
					type="text" name="category" class="form-control" id="category"
					placeholder="文章分类"> -->
				<select id="category" name="category" class="form-control">
					<option value="-1">---请选择---</option>
					<option value="1">技术</option>
					<option value="2">娱乐</option>
					<option value="3">故事</option>
					<option value="4">感受</option>
				</select>
			</div>
			<div class="form-group">
				<label for="article_file">内容文件</label> <input type="file"
					id="article_file" name="contentFile">
			</div>
			<div class="form-group">
				<label for="original">原创 </label> <input id="original" type="radio"
					name="original" value="true" checked="checked"> <label
					for="transhipment">转载 </label> <input id="transhipment"
					type="radio" name="original" value="false">
			</div>
			<div class="form-group">
				<label for="author">作者</label><input
					type="text" name="author" class="form-control" id="author"
					placeholder="文章作者">
			</div>
			<div>
				<input type="submit" class="btn btn-md btn-primary" value="保存">
			</div>

		</form>
	</div>
</body>
</html>