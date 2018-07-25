<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>只言片语</title>
	<%@ include file="/WEB-INF/jsps/common/head.jsp"%>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="/css/layui.css" media="all">
</head>
<body class="relative">

<!-- 文章时间线区块 -->
<div id='articleDiv' class="container">
  <div class="layui-row">
	   <fieldset>
           <legend>
               <a>个人日记</a>
               <div class="layui-btn-group" style="float:right;">
                   <button class="layui-btn layui-btn-primary layui-btn-sm" style="border: 0px;">
                       <i class="layui-icon">&#xe654;</i>
                   </button>
                   <button class="layui-btn layui-btn-primary layui-btn-sm" style="border: 0px;">
                       <i class="layui-icon">&#xe642;</i>
                   </button>
                   <button class="layui-btn layui-btn-primary layui-btn-sm" style="border: 0px;">
                       <i class="layui-icon">&#xe640;</i>
                   </button>
               </div>
           </legend>
	   </fieldset>
	<div id='articleTl' style='padding-left:50px;overflow:auto;height:800px;overflow-y:auto;overflow-x:hidden;border-right:solid 1px #e5e5e5;' class="layui-col-md4">
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
            <li class="layui-timeline-item">
                <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                <div class="layui-timeline-content layui-text">
                    <div class="layui-timeline-title">END</div>
                </div>
            </li>
		</ul>
	</div>
	<div id='articleDt' class="layui-col-md8" style="height:800px;overflow-y:auto;overflow-x:hidden;padding:20px;" >
		${firstArticle}
	</div> 
   </div>
</div>
    <script type="text/javascript" src="/js/layui.all.js"></script>
    <script type="text/javascript" src="/js/article/article.js"></script>
</body>
</html>