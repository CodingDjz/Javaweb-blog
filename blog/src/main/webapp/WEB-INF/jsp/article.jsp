<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=0.5, maximum-scale=2.0, user-scalable=yes" />  
<title>${article_title}</title>
<script src="//cdn.bootcss.com/marked/0.3.6/marked.js"></script>
<script src="<%=request.getContextPath()%>/js/article.js"></script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/article.css">
</head>
<body >
	<div id="header">
		<h1>${article_title}</h1>
	</div>
	<div id="content"></div>
	<div id="mdDiv" style="visibility: hidden;">
		<textarea id="article_content">${article_content}</textarea>

	</div>
	<link
		href="http://cdn.bootcss.com/highlight.js/8.0/styles/monokai_sublime.min.css"
		rel="stylesheet">
	<script src="http://cdn.bootcss.com/highlight.js/8.0/highlight.min.js"></script>
	<script type="text/javascript">
		hljs.initHighlightingOnLoad();
	</script>
	<script>
		initContent()
	</script>
</body>
</html>