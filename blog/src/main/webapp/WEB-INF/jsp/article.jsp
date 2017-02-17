<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${article_title}</title>
<script src="//cdn.bootcss.com/marked/0.3.6/marked.js"></script>
<script src="<%=request.getContextPath()%>/js/article.js"></script>
</head>
<body onload="mdView()">
	<div id="mainDiv">
		<div id="mdDiv">
			<textarea id="article_content" type="hidden">${article_content}</textarea>
		</div>
	</div>
	<!-- <div id="inputDiv">
			<textarea id="mdInput" oninput=""></textarea>
		</div>

		<div id="mdPreview"></div> -->
	</div>
</body>
</html>