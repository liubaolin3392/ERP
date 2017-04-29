<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>



<html>
	<head>
		<title>管理中心</title>
	</head>
	<frameset rows="64,*,100" frameborder="NO" border="0" framespacing="0">
		<frame src="<%=request.getContextPath()%>/top.jsp" noresize="noresize" frameborder="NO"
			name="topFrame" scrolling="no" marginwidth="0" marginheight="0"
			target="main" />
		<frameset cols="200,*" rows="560,*" id="frame">
			<frame src="<%=request.getContextPath()%>/employee/left.jsp" name="leftFrame" noresize="noresize"
				marginwidth="0" marginheight="0" frameborder="0" scrolling="no"
				target="main" />
			<frame src="<%=request.getContextPath()%>/right.jsp" name="main" marginwidth="0"
				marginheight="0" frameborder="0" scrolling="auto" target="_self" />
		</frameset>
		<frame src="<%=request.getContextPath()%>/bottom.jsp" noresize="noresize" frameborder="NO"
			name="bottomrame" scrolling="no" marginwidth="0" marginheight="0"
			target="main" />
	</frameset>
	<noframes>
		<body></body>
	</noframes>
</html>
