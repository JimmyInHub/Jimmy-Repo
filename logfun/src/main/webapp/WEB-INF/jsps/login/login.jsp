<%--
  Created by IntelliJ IDEA.
  User: Jimmy
  Date: 2019/3/5
  Time: 20:57
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta content="text/html; charset=UTF-8">
    <link href="css/login.css" rel='stylesheet' type='text/css' />
    <script type="text/javascript" src="/js/jquery.min.js"></script>
    <title>logfun登陆</title>
</head>
<body>
<div class="login-form">
    <form>
        <input type="text" class="text" value="Username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}" >
        <div class="key">
            <input type="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '密码';}">
        </div>
    </form>
    <div class="signin">
        <input type="submit" value="Login" >
    </div>
</div>
<div class="copy-rights">
    <p>Copyright &copy; 2019.本网站属个人开发，如有意见和建议，请联系@Jimmy 729255858@qq.com</p>
</div>
</body>
</html>
