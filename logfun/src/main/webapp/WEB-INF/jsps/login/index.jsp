<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>logfun登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
    <meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/animate.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <script src="${pageContext.request.contextPath}/js/frame/modernizr-2.6.2.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/frame/respond.min.js"></script>
</head>
<body class="style-3">
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-push-8 formDiv">

            <!-- 登录 -->
            <div class="loginDiv">
                <form action="/login" class="fh5co-form animate-box" data-animate-effect="fadeInRight" method="post">
                    <h2>登录</h2>
                    <div class="form-group">
                        <input type="text" class="form-control" name="userName" placeholder="userName" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" name="passWord" placeholder="password" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="checkbox" name="remember"> 一周内记住我</label>
                    </div>
                    <div class="form-group">
                        <input type="submit" value="登录" class="btn btn-primary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        还没有账号? <a href="#" onclick="showSign()">注册</a> | <a href="#" onclick="showForget()">忘记密码?</a>
                    </div>
                </form>
            </div>

            <!-- 注册 -->
            <div class="signinDiv" style="display:none" method="post">
                <form action="/register" class="fh5co-form animate-box" data-animate-effect="fadeInRight">
                    <h2>注册</h2>
<%--                    <div class="form-group">
                        <div class="alert alert-success" role="alert">Your info has been saved.</div>
                    </div>--%>
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
                        <input type="submit" value="提交" class="btn btn-primary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;已经注册了? <a href="#" onclick="showlogin()">登录</a>
                    </div>
                </form>
            </div>

            <!-- 忘记密码 -->
            <div class="forgetDiv" style="display:none" method="post">
                <form action="#" class="fh5co-form animate-box" data-animate-effect="fadeInRight">
                    <h2>忘记密码</h2>
<%--                    <div class="form-group">
                        <div class="alert alert-success" role="alert">Your email has been sent.</div>
                    </div>--%>
                    <div class="form-group">
                        <label for="email" class="sr-only">Email</label>
                        <input type="email" class="form-control" id="email" placeholder="Email" autocomplete="off">
                    </div>
                    <div class="form-group">
                        <input type="submit" value="发送邮件" class="btn btn-primary">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" onclick="showlogin()">登录</a> or <a href="#" onclick="showSign()">注册</a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <div class="footerTip" style="padding-top: 60px; clear: both;">
        <div class="col-md-12 text-center"><p><small>Copyright &copy; 2019.本网站属个人开发，如有意见和建议，请联系@Jimmy 729255858@qq.com</small></p></div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/frame/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/frame/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/frame/jquery.placeholder.min.js"></script>
<script src="${pageContext.request.contextPath}/js/frame/jquery.waypoints.min.js"></script>
<script src="${pageContext.request.contextPath}/js/frame/main.js"></script>
<script type="text/javascript">
    function showSign () {
        $(".loginDiv").hide();
        $(".forgetDiv").hide();
        $(".signinDiv").show();
    }
    function showForget () {
        $(".loginDiv").hide();
        $(".signinDiv").hide();
        $(".forgetDiv").show();
    }
    function showlogin () {
        $(".loginDiv").show();
        $(".signinDiv").hide();
        $(".forgetDiv").hide();
    }
</script>
</body>
</html>