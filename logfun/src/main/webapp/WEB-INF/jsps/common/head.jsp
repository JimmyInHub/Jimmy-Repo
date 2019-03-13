<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta content="text/html; charset=UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">

    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Raleway:300,400%7COpen+Sans:400,400i,700%7CLibre+Baskerville:400i'
          rel='stylesheet'>

    <!-- Css -->
    <link rel="stylesheet" href="/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="/css/font-icons.css"/>
    <link rel="stylesheet" href="/css/sliders.css"/>
    <link rel="stylesheet" href="/css/style.css"/>
    <link rel="stylesheet" href="/css/responsive.css"/>
    <link rel="stylesheet" href="/css/spacings.css"/>
    <link rel="stylesheet" href="/css/animate.min.css"/>
    <link rel="stylesheet" href="/css/layui.css"/>
    <title>logfun</title>
</head>
<body class="relative">

<!-- Preloader -->
<div class="loader-mask">
    <div class="loader">
        <div></div>
        <div></div>
    </div>
</div>

<div class="main-wrapper oh">

    <header class="nav-type-1 dark-nav">

        <!-- 全屏搜索区 -->
        <div class="search-wrap">
            <div class="search-inner">
                <div class="search-cell">
                    <form method="get">
                        <div class="search-field-holder">
                            <input type="search" class="form-control main-search-input" placeholder="请输入关键字">
                            <div class="search-submit-icon"><i class="icon icon_search"></i></div>
                            <input type="submit" class="search-submit" value="search">
                        </div>
                    </form>
                </div>
            </div>
            <i class="icon icon_close search-close" id="search-close"></i>
        </div>
        <!-- 全屏搜索区  结束 -->

        <nav class="navbar navbar-fixed-top">
            <div class="navigation">
                <div class="container relative">
                    <div class="row">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                                <span class="sr-only">导航栏</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                        </div>

                        <!-- 搜索边栏 -->
                        <div class="side-menu nav-left hidden-sm hidden-xs">
                            <div class="nav-inner">
                                <div class="nav-search-wrap hidden-sm hidden-xs">
                                    <a href="#" class="nav-search search-trigger">
                                        <i class="icon icon_search"></i>
                                    </a>
                                </div>
                            </div>
                        </div>

                        <!-- 顶部菜单栏 -->
                        <div class="col-md-12 nav-wrap">
                            <div class="collapse navbar-collapse text-center" id="navbar-collapse">
                                <ul class="nav navbar-nav">
                                    <li><a href="/home">首页</a></li>
                                    <li><a href="/writing/index">文字</a></li>
                                    <li><a href="#picture">图片</a></li>
                                    <li><a href="#video">视频</a></li>
                                    <li id="mobile-search" class="hidden-lg hidden-md">
                                        <form method="get" class="mobile-search">
                                            <input type="search" class="form-control" placeholder="搜索">
                                            <button type="submit" class="search-button">
                                                <i class="icon icon_search"></i>
                                            </button>
                                        </form>
                                    </li>
                                </ul>
                            </div>
                        </div>

                        <!-- 个人中心 -->
                        <div class="side-menu nav-right hidden-sm hidden-xs">
                            <ul class="nav navbar-nav" style="float: right">
                                    <li class="layui-nav-item"><a href=""><img src="//t.cn/RCzsdCq" class="layui-nav-img">个人中心</a>
                                    <dl class="layui-nav-child">
                                        <dd><a href="javascript:;">我的主页</a></dd>
                                        <dd><a href="javascript:;">安全管理</a></dd>
                                        <dd><a href="javascript:;">退出</a></dd>
                                    </dl>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    </header>
    <div id="back-to-top">
        <a href="#top"><i class="fa fa-angle-up"></i></a>
    </div>
</div>

<!-- jQuery Scripts -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/frame/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/frame/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/frame/plugins.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/frame/scripts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/frame/layui.all.js"></script>

<!-- Instafeed -->
<script type="text/javascript">
    $(window).load(function () {

        var InstafeedRow = new Instafeed({
            target: 'instafeed-row',
            get: 'user',
            userId: '3562688430',
            accessToken: '3562688430.ceddd6d.c54fa5142fa847f89827e5cf9b19d885',
            resolution: 'low_resolution',
            limit: '6',
            template: '<li class="instagram-item"><a target="_blank" href="{{link}}"><img class="instagram-img" alt="Instagram Image" src="{{image}}"></a></li>'
        });

        var InstafeedGrid = new Instafeed({
            target: 'instafeed-grid',
            get: 'user',
            userId: '3562688430',
            accessToken: '3562688430.ceddd6d.c54fa5142fa847f89827e5cf9b19d885',
            resolution: 'low_resolution',
            limit: '9',
            template: '<li class="instagram-item"><a target="_blank" href="{{link}}"><img class="instagram-img" alt="Instagram Image" src="{{image}}"></a></li>'
        });
        InstafeedRow.run();
        InstafeedGrid.run();
    });
</script>
</body>
</html>