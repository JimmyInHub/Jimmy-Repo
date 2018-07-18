<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <link rel="stylesheet" href="/css/editor/editormd.min.css" type="text/css" />
   <link rel="stylesheet" href="/css/editor/style.css" />
   <link rel="stylesheet" href="/css/editor/editormd.css" />
   <%@ include file="/WEB-INF/jsps/common/head.jsp"%>
<title>只言片语</title>
</head>
<body class="relative">
              
	<!-- 文字记录区 <br> -->
    <!-- editormd start -->
    <div class="editormd" id="test-editormd">
    <textarea class="editormd-markdown-textarea" name="test-editormd-markdown-doc" id="editormd"></textarea>
    <!-- 第二个隐藏文本域，用来构造生成的HTML代码，方便表单POST提交，这里的name可以任意取，后台接受时以这个name键为准 -->
    <!-- html textarea 需要开启配置项 saveHTMLToTextarea == true -->
    <textarea class="editormd-html-textarea" name="editorhtml" id="editorhtml"></textarea>       
    </div>
    <!-- editormd end --> 
  	<button class="layui-btn layui-btn-primary layui-btn-xs" id='saveArticle' onClick=save()>保存</button>
	
	<!-- editormd start -->
  	<script type="text/javascript" src="/js/editormd.min.js"></script>
 	<script type="text/javascript">
	  var testEditor ;
	  testEditor = $(function() {
	      editormd("test-editormd", {
	           width   : "90%",
	           height  : 640,
	           codeFold : true,
	           syncScrolling : "single",
	           						
	           path : "/lib/", 				//目录的路径
	           imageUpload: true, 			//图片上传功能
/* 	           theme: "white",				//工具栏主题
	           previewTheme: "white",		//预览主题
	           editorTheme: "pastel-on-dark",//编辑主题  */
	           emoji: true,					//表情
	           taskList: true, 
	           tocm: true,         			// Using [TOCM]
	           tex: true,                   // 开启科学公式TeX语言支持，默认关闭
	           flowChart: true,             // 开启流程图支持，默认关闭
	           sequenceDiagram: true,       // 开启时序/序列图支持，默认关闭,
	          //这个配置在simple.html中并没有，但是为了能够提交表单，使用这个配置可以让构造出来的HTML代码直接在第二个隐藏的textarea域中，方便post提交表单。
	           saveHTMLToTextarea : true            
	      });
	
	  });
	  var save = function() {
		  var content = $('#editorhtml').val();
		  
		  //无内容提示
		  if(!content){
			  layer.alert('请输入文章内容!', {icon: 6});
			  return;
		  }
		  
		  //输入标题
	   	  layer.prompt({title: '请输入标题', formType: 2}, function(text, index){
	   		layer.close(index);
	   		  $.ajax({
		         type: "post",
		         dataType: "html",
		         url: '/writing/save',
		         data: {content:content, title:text},
		         success: function (data) {
		        	 var json = eval("("+data+")");
		         	 if (json.success) {
		        		layer.closeAll('loading');
		        		layer.msg('保存成功');
		             }
		         }
			  });
	   		  layer.load();
		  });
	  }
	</script>
	<!-- editormd end --> 
</body>
</html>