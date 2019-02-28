/**
 * @date 2018年7月18日
 * @author Jimmy
 * @description 文章处理js
 */

//	基础方法
var baseFun = {

    //  markdown编辑器初始化
    init:function(){
        mdEditor = editormd("test-editormd", {
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

        //  判断是否有id存在,有则加载文章
        var id = $("#articleId").html();
        if(id){
            $.ajax({
                type: "post",
                dataType: "html",
                url: '/writing/get',
                data: {id:id},
                success: function (data) {
                    var json = eval("("+data+")");
                    var content = json.content;
                    $("#editormd").val(content);
                }
            });
        }
    },

    /**
     * @author Jimmy
     * @date   2018/7/28
     * @desvription 根据文章id展示详细内容
     */
    updateArticle : function(){
        var id = $("#currentArticleId").html();
        if(!id){
            layer.msg('未获取到文章ID，请联系程序员');
        }
        window.location.href='/writing/editor?id=' + id;
    },

    /**
     * @author Jimmy
     * @date   2018/7/28
     * @desvription 根据文章id删除
     */
    deleteArticle : function(){
        var id = $("#currentArticleId").html();
        if(!id){
            layer.msg('未获取到文章ID，请联系程序员');
        }
        $.ajax({
            type: "post",
            dataType: "html",
            url: '/writing/delete',
            data: {id:id},
            success: function (data) {
                var json = eval("("+data+")");
                if (json.success) {
                    layer.msg('删除成功！');
                }
                window.location.reload()
            }
        });
    },

    /**
     * @author Jimmy
     * @date   2018/7/28
     * @desvription 保存/修改文章
     */
    save : function() {
        var mdtext = mdEditor.getMarkdown();

        //  无内容提示
        if(!mdtext){
            layer.alert('请输入文章内容!', {icon: 6});
            return;
        }
        var id = $("#articleId").html();
        if(!id){

            //  输入标题
            layer.prompt({title: '请输入标题', formType: 2}, function(text, index){
                layer.close(index);
                $.ajax({
                    type: "post",
                    dataType: "html",
                    url: '/writing/save',
                    data: {content:mdtext, title:text},
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
        }else{
            $.ajax({
                type: "post",
                dataType: "html",
                url: '/writing/save',
                data: {content:mdtext, id:id},
                success: function (data) {
                    var json = eval("("+data+")");
                    if (json.success) {
                        layer.closeAll('loading');
                        layer.msg('修改成功');
                    }

                    // 跳转到首页
                    window.location.href="/writing/index"
                }
            });
        }
    },

    /**
     * @author Jimmy
     * @date   2018/7/28
     * @param  id
     * @desvription 点击文章标题显示文章内容
     */
    openArticle : function (id) {
        $("#currentArticleId").html(id)
        $.ajax({
            type: "post",
            dataType: "html",
            url: '/writing/get',
            data: {id:id},
            success: function (data) {
                var json = eval("("+data+")");
                var content = json.content;
                $("#articleDt").empty();
                var html = '<textarea class="layui-col-md8 editormd-html-textarea" name="editorhtml" readonly="readonly">' +
                    content + '</textarea>';
                $("#articleDt").append(html);
                testEditor = editormd.markdownToHTML("articleDt", {//注意：这里是上面DIV的id
                    htmlDecode : "style,script,iframe",
                    emoji : true,
                    taskList : true,
                    tex : true, // 默认不解析
                    flowChart : true, // 默认不解析
                    sequenceDiagram : true, // 默认不解析
                    codeFold : true
                });
            }
        });
    }
}
