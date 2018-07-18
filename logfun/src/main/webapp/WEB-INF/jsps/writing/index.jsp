<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>只言片语</title>
<%@ include file="/WEB-INF/jsps/common/head.jsp"%>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/css/layui.css"  media="all">
</head>
<body class="relative">

<!-- 文章时间线区块 -->
<div id='articleDiv'>
	<div id='articleTl' style='padding-left:50px;'>
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
		 	<legend>个人日记</legend>
		 	<!-- <button class="layui-btn layui-btn-primary layui-btn-xs" id='addArticle' onclick="window.open('/writing/editor')">添加</button> -->
		</fieldset>
		<ul class="layui-timeline">
			<c:forEach items="${articles}" var="article">
			  <li class="layui-timeline-item">
			    <i class="layui-icon layui-timeline-axis" onclick="baseFun.showDetail(${article.id})"></i>
			    <div class="layui-timeline-content layui-text">
				      <h3 class="layui-timeline-title">${article.updateTime}</h3>
				      <p>${article.title}</p>
			    </div>
			  </li>
			</c:forEach>
		</ul>  
	</div>
	<div id='articleDt'>
	
	</div> 
</div>
    <script type="text/javascript" src="/js/layui.all.js"></script>
    <script type="text/javascript" src="/js/article/article.js"></script>
</body>
</html>