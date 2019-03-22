/**
 * @date 2019年3月20日
 * @author Jimmy
 * @description 登录页面
 */

//	基础方法
var baseFun = {

    //  登录
    login : function () {
        $("#login_form").form("submit", {
            url: "/login",
            onSubmit: function (param) {
                var isValid = $(this).form('validate')
                if (!isValid) {
                    return false;
                }
            },
            success: function (data) {
                if (data.success) {

                }else{

                }
            }
        })
    }
};