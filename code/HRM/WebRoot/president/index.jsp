<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理中心</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <frameset rows="64,*,100" frameborder="NO" border="0" framespacing="0">
		<frame src="<%=request.getContextPath()%>/top.jsp" noresize="noresize" frameborder="NO"
			name="topFrame" scrolling="no" marginwidth="0" marginheight="0"
			target="main" />
		<frameset cols="200,*" rows="560,*" id="frame">
			<frame src="<%=request.getContextPath()%>/president/left.jsp" name="leftFrame" noresize="noresize"
				marginwidth="0" marginheight="0" frameborder="0" scrolling="no"
				target="main" />
			<frame src="<%=request.getContextPath()%>/right.jsp" name="main" marginwidth="0" marginheight="0"
				frameborder="0" scrolling="auto" target="_self" />
		</frameset>

		<frame src="<%=request.getContextPath()%>/bottom.jsp" noresize="noresize" frameborder="NO"
			name="bottomframe" scrolling="no" marginwidth="0" marginheight="0"
			target="main" />

	</frameset>
	<noframes>
		<body></body>
	</noframes>
</html>
