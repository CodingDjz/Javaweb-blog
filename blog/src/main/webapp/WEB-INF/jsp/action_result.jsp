<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/action_result.css">
</link>
</head>
<body>
	<div id="result_msg">
		<c:choose>
			<c:when test="${result_code==1}">操作成功!</c:when>
			<c:when test="${result_code==2}">操作失败!</c:when>
			<c:otherwise>未知错误</c:otherwise>
		</c:choose>
	</div>

	<div id="back_div">
		<a id="back_text" href="#" onclick="javascript:history.back(-1)">返回上页</a>
	</div>
</body>
</html>