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
    <div id="articleId" style="visibility: hidden;">${id}</div>
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
    <button class="layui-btn layui-btn-primary layui-btn-xs" onclick="location.href='/writing/index'">返回</button>
	
	<!-- editormd start -->
  	<script type="text/javascript" src="/js/editormd.min.js"></script>
    <script type="text/javascript" src="/js/article/article.js"></script>
 	<script type="text/javascript">

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

                         // 跳转到首页
                         window.location.href="/writing/index"
                     }
                  });
                  layer.load();
              });
          }
	</script>
	<!-- editormd end --> 
</body>
</html>