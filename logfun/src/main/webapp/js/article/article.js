/**
 * @date 2018年7月18日
 * @author Jimmy
 * @description 文章处理js
 */

//	基础方法
var baseFun = {
		
    //	根据文章id展示详细内容
    updateArticle : function(){
        var id = $("#currentArticleId").html();
        if(!id){
            layer.msg('未获取到文章ID，请联系程序员');
        }
        window.location.href='/writing/editor?id=' + id;
    },

    //  根据文章id删除
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
    }
}
$(function(){
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