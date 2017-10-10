<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.net.URLDecoder,java.net.URLEncoder"%>  
<!DOCTYPE html>
<html>
<%@ include file="../public/link.jsp"%>

<body>

<%@ include file="../public/header.jsp"%>

<input type="hidden" id="keyword" value="<%=request.getParameter("keyword")==null?"":request.getParameter("keyword")%>">

<div class="main layui-clear">
  <div class="fly-panel" pad20>
	<h2  class="page-title">视频库：正在计划实施中。。。</h2>
	<div class="layui-form layui-form-pane">
		视频库介绍：录制一个关于java路线学习系列视频。<br/><br/>
		目的：其实站长技术也一般，做这个视频库的初衷一方面是逼迫自己学习这些知识，另一方面是逼迫自己对这些知识做个总结。只有学习并且总结，自己才能更好的掌握这些知识，不逼自己一把，谁能知道自己的潜力有多大，对吧？<br/><br/>
		如果你想和站长一起学习的话，欢迎加群：<a target="_blank" href="//shang.qq.com/wpa/qunwpa?idkey=9d09b3b9cbcf584c9bab6b2576fb1c2aa6ca84bebb8f44e464382398e7d4acc5"><img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="代码库" title="代码库"></a><br/><br/>
		目录：这是个大概目录，录制的时候有可能会有变动。<br/>
		1、html<br/>
		2、css<br/>
		3、js<br/>
		4、jquery<br/>
		5、xml、json解析<br/>
		6、bootstrap<br/>
		7、java se<br/>
		8、mysql数据库<br/>
		9、java web<br/>
		10、oracle数据库<br/>
		11、strtus2<br/>
		12、hibernate<br/>
		13、spring<br/>
		14、maven<br/>
		15、spring mvc<br/>
		16、mybatis<br/>
		待补充。。。
	</div>
  </div>

</div>


<%@ include file="../public/footer.jsp"%>

<script>
layui.config({
  base: 'res/modules/video/'
}).use('index');
</script>

</body>
</html>