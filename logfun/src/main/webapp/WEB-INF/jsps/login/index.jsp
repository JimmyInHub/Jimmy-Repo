<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>logfun登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="logfun 日志 生活 乐趣" />
    <meta name="keywords" content="logfun 日志 生活 乐趣" />
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/animate.css">
    <link rel="stylesheet" href="/css/login.css">
    <link rel="stylesheet" href="/css/layui.css">

    <script src="/js/frame/modernizr-2.6.2.min.js"></script>
    <script src="/js/frame/respond.min.js"></script>
    <script src="/js/frame/jquery.min.js"></script>
    <script src="/js/frame/bootstrap.min.js"></script>
    <script src="/js/frame/jquery.placeholder.min.js"></script>
    <script src="/js/frame/jquery.waypoints.min.js"></script>
    <script src="/js/frame/main.js"></script>
    <script src="/js/frame/layui.all.js"></script>
</head>
<body class="style-3">
<input type="hidden" id="errorMsg" name="errorMsg" value="${errorMsg }" />
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-push-8 formDiv">
            <!-- 登录 -->
            <div class="loginDiv">
                <form id="login_form" class="fh5co-form animate-box" data-animate-effect="fadeInRight" method="post" onclick="login()">
                    <h2>登录</h2>
                    <div class="form-group">
                        <input type="text" class="form-control" name="userName" placeholder="userName" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="passWord" placeholder="password" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="checkbox" name="rememberMe" title="记住我"/> 一周内记住我</label>
                    </div>
                    <div class="form-group">
                        <input type="button" value="登录" class="btn btn-primary" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        还没有账号? <a href="#" onclick="showSign()">注册</a> | <a href="#" onclick="showForget()">忘记密码?</a>
                    </div>
                </form>
            </div>

            <!-- 注册 -->
            <div class="signinDiv" style="display:none" method="post">
                <form action="/register" class="fh5co-form animate-box" data-animate-effect="fadeInRight">
                    <h2>注册</h2>
                    <div class="form-group">
                        <input type="text" class="form-control" name="userName" placeholder="昵称" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="email" class="form-control" name="email" placeholder="Email" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="passWord" placeholder="密码" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <label for="re-password" class="sr-only">Re-type Password</label>
                        <input type="password" class="form-control" id="re-password" placeholder="确认密码" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="button" value="提交" class="btn btn-primary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已经注册了? <a href="#" onclick="showlogin()">登录</a>
                    </div>
                </form>
            </div>

            <!-- 忘记密码 -->
            <div class="forgetDiv" style="display:none" method="post">
                <form action="#" class="fh5co-form animate-box" data-animate-effect="fadeInRight">
                    <h2>忘记密码</h2>
                    <div class="form-group">
                        <label for="email" class="sr-only">Email</label>
                        <input type="email" class="form-control" id="email" placeholder="Email" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="button" value="发送邮件" class="btn btn-primary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" onclick="showlogin()">登录</a> or <a href="#" onclick="showSign()">注册</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="footerTip" style="padding-top: 60px; clear: both;">
        <div class="col-md-12 text-center"><p><small>Copyright &copy; 2019.本网站属个人开发，如有意见和建议，请联系@Jimmy 729255858@qq.com</small></p></div>
    </div>
</div>
<script type="text/javascript">
    var errorMsg = $("#errorMsg").val();
    if(errorMsg != ''){
        layer.open({
            title: '登陆失败',
            content: errorMsg
        });
    };
    function showSign () {
        $(".loginDiv").hide();
        $(".forgetDiv").hide();
        $(".signinDiv").show();
    };
    function showForget () {
        $(".loginDiv").hide();
        $(".signinDiv").hide();
        $(".forgetDiv").show();
    };
    function showlogin () {
        $(".loginDiv").show();
        $(".signinDiv").hide();
        $(".forgetDiv").hide();
    };
    function login () {
        $("#login_form").validate({
            rules: {
                userName: {
                    required: true
                },
                passWord: {
                    required: true
                }
            },
            messages: {
                userName: {
                    required: "请输入您的用户名",
                },
                passWord: {
                    required: "请输入您的密码",
                }
            }
        })

        // var username = $.common.trim($("input[name='userName']").val());
        // var password = $.common.trim($("input[name='passWord']").val());
        // var rememberMe = $("input[name='rememberMe']").is(':checked');
        // $.ajax({
        //     type: "post",
        //     url: "/log/login",
        //     data: {
        //         "userName": username,
        //         "passWord": password,
        //         //"validateCode" : validateCode,
        //         "rememberMe": rememberMe
        //     },
        //     success: function(r) {
        //         if (r.code == 0) {
        //             location.href = "/home/index";
        //         } else {
        //             layer.alert(data.msg)
        //         }
        //     }
        // });

        $.post( '/log/login', $("#login_form").serialize(),
            function (data) {
                if (data.success) {
                    window.location.href = "/home/index";
                } else {
                    layer.alert(data.msg)
                }
            },
            'json'
        );
    };
</script>
</body>
</html>