<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.admintwo.model.User"%>
<!DOCTYPE html>
<html>
<%@ include file="../public/link.jsp"%>

<body>

<%@ include file="../public/header.jsp"%>
<input type="hidden" value="<%=request.getParameter("id")%>" id="resourcesId"/>
<%if ((User) session.getAttribute("user") == null) {%>
<input type="hidden" value="0" id="user_id"/>
<%}else{ %>
<input type="hidden" value="<%=((User) session.getAttribute("user")).getId()%>" id="user_id"/>
<input type="hidden" value="<%=((User) session.getAttribute("user")).getJifen()%>" id="user_jifen"/>
<%} %>

<div class="main layui-clear">
  <div class="wrap">
    <div class="content detail">
      <div id="resource_detail" class="fly-panel detail-box">
        <!-- <h1></h1>
        <div class="fly-tip fly-detail-hint">
          <span class="fly-tip-stick" id="isfirst">公告</span>
          <span class="fly-tip-jie" id="isyuan">原创</span>
          <span class="fly-tip-jing" id="isjing">精</span>
          <span>未结贴</span>
          <span>已入库</span>
          
          <span class="jie-admin" type="del" style="margin-left: 20px;">删除</span>
          <span class="jie-admin" type="set" field="stick" rank="1">置顶</span> 
          <span class="jie-admin" type="set" field="stick" rank="0" style="background-color:#ccc;">取消置顶</span>
          <span class="jie-admin" type="set" field="status" rank="1">加精</span> 
          <span class="jie-admin" type="set" field="status" rank="0" style="background-color:#ccc;">取消加精</span>
          
          <div class="fly-list-hint"> 
            <i class="iconfont" title="评论">&#xe60c;</i> <label id="res_comments_num">0</label>
            <i class="layui-icon" title="下载" style="font-size: 14px;">&#xe601;</i> <label id="res_download_num">0</label>
            <i class="layui-icon" title="收藏" style="font-size: 14px;">&#xe600;</i> <label id="res_keep_num">0</label>
          </div>
        </div>
        <div class="detail-about">
          <a class="jie-user" href="" id="userId" target="_blank">
            <img src="res/images/avatar/default.png" title="" id="userImg">
            <cite>
              <span><label id="userName"></label>&nbsp;<label id="userLabel"></label>
              <em>发布于<label id="r_nowtime"></label></em></span>
            </cite>
          </a>
          <div class="detail-hits">
            <span style="color:#FF7200">积分：<label id="r_jifen"></label></span>
            <span id="download" class="layui-btn layui-btn-mini jie-admin">下载源码</span>
            <span id="shoucang0" class="layui-btn layui-btn-mini jie-admin layui-btn layui-btn-normal" data-type="add">收藏</span>
            <span id="shoucang1" class="layui-btn layui-btn-mini jie-admin" data-type="add">取消收藏</span>
          </div>
        </div>
        
        <div class="detail-body photos" style="margin-bottom: 20px;">
          <div id="description"></div>
          <p style="text-align:right;margin-right:15px;">
           	代码库
          </p>
        </div>-->
        
        <!-- 打赏部分 -->
        <div id="dashang">
	      	<%@ include file="../public/dashang.jsp"%>
        </div>
      </div> 

	  <!-- 评论部分 -->
      <%@ include file="../public/comments.jsp"%>
	  
    </div>
  </div>
  
  <div class="edge">
    <dl class="fly-panel fly-list-one" id="commentstop"> 
      <dt class="fly-panel-title">本月评论榜</dt>
      <!-- <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局（基本结构）</a>
        <span><i class="iconfont" title="评论">&#xe60c;</i> 6087</span>
      </dd> -->
    </dl>
    
    <dl class="fly-panel fly-list-one" id="downloadtop"> 
      <dt class="fly-panel-title">本月下载榜</dt>
      <!-- <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="layui-icon" title="下载" style="font-size: 14px;">&#xe601;</i> 96</span>
      </dd> -->
    </dl>
    
    <dl class="fly-panel fly-list-one" id="keeptop"> 
      <dt class="fly-panel-title">本月收藏榜</dt>
      <!-- <dd>
        <a href="jie/detail.html">使用 layui 秒搭后台大布局之基本结构</a>
        <span><i class="layui-icon" title="收藏" style="font-size: 14px;">&#xe600;</i> 96</span>
      </dd> -->
    </dl>
  </div>
</div>

<%@ include file="../public/footer.jsp"%>
<script>
layui.config({
  base: 'res/modules/resource/'
}).use('detail');
</script>
</body>
</html>