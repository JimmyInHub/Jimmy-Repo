<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>logfun主页</title>
<%@ include file="/WEB-INF/jsps/common/head.jsp"%>
</head>
<body class="relative">

    <section class="header-wrap hero-section bg-light">
      <div class="container">
        <div class="logo-container text-center">
          <div class="logo-wrap">
             <!-- 主题logo图片区域 -->
             <img class="logo-dark" src="/img/logo.png" alt="logo">
          </div>
        </div>
      </div>
    </section>

    <div class="content-wrapper oh">

      <!-- 文字内容 时间轴 展示区 -->
      <section class="section-wrap latest-stories pb-0">
        <div class="container-fluid nopadding" id='word'>

          <div class="heading-row text-center mb-40">
           	<h2 class="heading uppercase small">只言片语</h2>
          </div>

          <div id="main-slider" class="flickity-slider-wrap">

          </div>
        </div>
      </section>
      
      <!-- 图片内容 展示区 -->
      <section class="section-wrap latest-stories pb-0">
        <div class="container-fluid nopadding" id='picture'>

          <div class="heading-row text-center mb-40">
            <h2 class="heading uppercase small">浮光掠影</h2>
          </div>

          <div id="main-slider" class="flickity-slider-wrap">

          </div>
        </div>
      </section> 
      
      <!-- 视频内容 展示区 -->
      <section class="section-wrap latest-stories pb-0">
        <div class="container-fluid nopadding" id='video'>

          <div class="heading-row text-center mb-40">
            <h2 class="heading uppercase small">动静之间</h2>
          </div>

          <div id="main-slider" class="flickity-slider-wrap">

          </div>
        </div>
      </section>
    </div>
  </div>
</body>
</html>