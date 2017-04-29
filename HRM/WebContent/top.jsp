<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>



<html>
	
	<head>
		<meta charset="utf-8" />
		<title>管理页面</title>
		<script language=JavaScript>
function logout(){
	if (confirm("您确定要退出控制面板吗？"))
	top.location = "login.html";
	return false;
}
</script>
		<script language=JavaScript1.2>
function showsubmenu(sid) {
	var whichEl = eval("submenu" + sid);
	var menuTitle = eval("menuTitle" + sid);
	if (whichEl.style.display == "none"){
		eval("submenu" + sid + ".style.display=\"\";");
	}else{
		eval("submenu" + sid + ".style.display=\"none\";");
	}
}
</script>
		<meta http-equiv=Content-Type content=text/html;charset=gb2312>
		<script language=JavaScript1.2>
function showsubmenu(sid) {
	var whichEl = eval("submenu" + sid);
	var menuTitle = eval("menuTitle" + sid);
	if (whichEl.style.display == "none"){
		eval("submenu" + sid + ".style.display=\"\";");
	}else{
		eval("submenu" + sid + ".style.display=\"none\";");
	}
}
</script>
		<base target="main">
		<link href="images/skin.css" rel="stylesheet" type="text/css">
	</head>
	<body leftmargin="0" topmargin="0">
		<table width="100%" height="64" border="0" cellpadding="0"
			cellspacing="0" class="admin_topbg">
			<tr>
				<td width="40%" height="64">
					<img src="images/logo.gif" height="64">
				</td>
				<td width="60%" valign="top">
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							
							<td valign="bottom" class="admin_txt" height="64">
								<font color="#fffff">${loginin.userName}<b>
										您好,感谢登陆使用！ 
								</font>
								
							</td>
							<!--  <td width="50"   align="left"><img src="images/0031.gif"></td> -->
							<td width="100" align="left" >
								<input type="button" value="首页"
									onclick="javascript:window.top.frames['main'].location='right.jsp';" />
							</td>
							<td width="100" align="left" >								
									<input type="button" value="向前"
									onclick="javascript:window.top.frames['main'].history.forward();"/> 
							</td>
							<td width="100" align="left" >								
									<input type="button" value="向后"
									onclick="javascript:window.top.frames['main'].history.back();"/> 
							</td>
							<td width="100" align="left" >
								
										<input type="button" value="退出"
									onclick="logout();"/> 
							</td>

						</tr>

					</table>
				</td>
			</tr>
		</table>
	</body>
</html>

