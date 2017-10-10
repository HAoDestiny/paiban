<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.admintwo.model.User"%>
<div class="header">
	<div class="main">
		<a class="logo" href="public_index" title="代码库">代码库</a>
		<div class="nav">
			<a href="public_index"><i class="layui-icon" style="top:5px;">&#xe64e;</i>源码库</a> 
			<a href="knowledge_index"> <i class="layui-icon" style="top:5px;">&#xe60a;</i>知识库<img src="res/images/hot.gif" style="margin-top:-37px;margin-left:-30px;"></a>
			<a href="video_index"><i class="layui-icon" style="top:3px;">&#xe634;</i>视频库</a> 
			<a href="project_index"><i class="layui-icon" style="top:3px;">&#xe630;</i>项目库</a> 
			<!-- <a href="resource_add"><i class="layui-icon" style="top:4px;">&#xe60c;</i>分享</a> 
			<a href="public_search"> <i class="layui-icon" style="top:5px;">&#xe615;</i>搜索</a>
			<a href="public_support"> <i class="layui-icon" style="top:2px;font-size: 23px;">&#xe600;</i>赞助</a> -->
		</div>
		<div class="nav-user">
			<%
				User user = (User) session.getAttribute("user");
				if (user == null) {
			%>
			<!-- 未登入状态 -->
			<a class="unlogin" href="user_login"><i
				class="iconfont icon-touxiang"></i></a> <span><a
				href="user_login">登录</a><a href="user_reg">注册</a></span>
			<%
				} else {
			%>
			<!-- 登入后的状态 -->
			<a class="avatar" href="user_home?id=<%=user.getId()%>"> <img
				src="<%=user.getImg()%>"> <cite><%=user.getName()%></cite><!--  <i>VIP2</i> -->
			</a>
			<div class="nav">
				<a href="user_message"><i class="layui-icon" style="top:3px;font-size: 24px;">&#xe612;</i>个人中心&nbsp;<span style="top:-1px;" id="newmessage"></span></a>
				<!-- <a href="user_index"><i class="layui-icon" style="top:2px;font-size: 24px;">&#xe635;</i>代码</a>
				<a href="user_message"><i class="layui-icon" style="top:5px;">&#xe611;</i>消息<span id="newmessage"></span></a>
				<a href="user_set"><i class="iconfont icon-shezhi"></i>设置</a> -->
				<a href="user/logout"><i class="iconfont icon-tuichu" style="top: 0; font-size: 22px;"></i>退出</a>
			</div>
			<%
				}
			%>
		</div>
	</div>
</div>
