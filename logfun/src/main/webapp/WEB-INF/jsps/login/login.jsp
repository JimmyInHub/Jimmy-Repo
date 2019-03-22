<%--
  Created by IntelliJ IDEA.
  User: Jimmy
  Date: 2019/3/5
  Time: 20:57
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8">
    <link href="css/login.css" rel='stylesheet' type='text/css' />
    <title>logfun登陆</title>
</head>
<body>
<div class="login-form">
    <form id = "login_form">
        <input type="text" class="text" value="userName" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}" >
        <div class="key">
            <input type="password" value="passWord" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '密码';}">
        </div>
    </form>
    <div class="signin">
        <input type="submit" value="Login" onclick='baseFun.login()' />
    </div>
</div>
<div class="copy-rights">
    <p>Copyright &copy; 2019.本网站属个人开发，如有意见和建议，请联系@Jimmy 729255858@qq.com</p>
</div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/frame/jquery.min.js"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login/login.js"/>
</body>
</html>
