/**
 * @date 2018年8月2日
 * @author Jimmy
 * @description 相册处理js
 */
//	基础方法
var baseFun = {

    /**
     * @description: 新建相册
     * @date: 2018/8/2 9:27
     * @author: Jimmy
     */
    addAlbum : function(){

        //  点击thumbBox样式的标签完成图片上传
        upload.render({
            elem: '.thumbBox',
            url: '/admin/xyz/qiniu',
            multiple: false,
            before: function(obj){

            },
            done: function(res){
                layer.msg('上传完毕！');
            },
            error: function(index, upload){
                layer.msg('上传错误！');
            }
        });
    }
}