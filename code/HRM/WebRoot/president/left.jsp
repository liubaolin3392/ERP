<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta charset="utf-8" />
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>管理页面</title>

		<script src="../js/prototype.lite.js" type="text/javascript"></script>
		<script src="../js/moo.fx.js" type="text/javascript"></script>
		<script src="../js/moo.fx.pack.js" type="text/javascript"></script>
		<style>
body {
	font: 12px Arial, Helvetica, sans-serif;
	color: #000;
	background-color: #EEF2FB;
	margin: 0px;
}

#container {
	width: 182px;
}

H1 {
	font-size: 12px;
	margin: 0px;
	width: 182px;
	cursor: pointer;
	height: 30px;
	line-height: 20px;
}

H1 a {
	display: block;
	width: 182px;
	color: #000;
	height: 30px;
	text-decoration: none;
	moz-outline-style: none;
	background-image: url(../images/menu_bgS.gif);
	background-repeat: no-repeat;
	line-height: 30px;
	text-align: center;
	margin: 0px;
	padding: 0px;
}

.content {
	width: 182px;
	height: 26px;
}

.MM ul {
	list-style-type: none;
	margin: 0px;
	padding: 0px;
	display: block;
}

.MM li {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	line-height: 26px;
	color: #333333;
	list-style-type: none;
	display: block;
	text-decoration: none;
	height: 26px;
	width: 182px;
	padding-left: 0px;
}

.MM {
	width: 182px;
	margin: 0px;
	padding: 0px;
	left: 0px;
	top: 0px;
	right: 0px;
	bottom: 0px;
	clip: rect(0px, 0px, 0px, 0px);
}

.MM a:link {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	line-height: 26px;
	color: #333333;
	background-image: url(../images/menu_bg1.gif);
	background-repeat: no-repeat;
	height: 26px;
	width: 182px;
	display: block;
	text-align: center;
	margin: 0px;
	padding: 0px;
	overflow: hidden;
	text-decoration: none;
}

.MM a:visited {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	line-height: 26px;
	color: #333333;
	background-image: url(../images/menu_bg1.gif);
	background-repeat: no-repeat;
	display: block;
	text-align: center;
	margin: 0px;
	padding: 0px;
	height: 26px;
	width: 182px;
	text-decoration: none;
}

.MM a:active {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	line-height: 26px;
	color: #333333;
	background-image: url(../images/menu_bg1.gif);
	background-repeat: no-repeat;
	height: 26px;
	width: 182px;
	display: block;
	text-align: center;
	margin: 0px;
	padding: 0px;
	overflow: hidden;
	text-decoration: none;
}

.MM a:hover {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	line-height: 26px;
	font-weight: bold;
	color: #006600;
	background-image: url(../images/menu_bg2.gif);
	background-repeat: no-repeat;
	text-align: center;
	display: block;
	margin: 0px;
	padding: 0px;
	height: 26px;
	width: 182px;
	text-decoration: none;
}
</style>
	</head>

	<body>
		<table width="100%" height="280" border="0" cellpadding="0"
			cellspacing="0" bgcolor="#EEF2FB">
			<tr>
				<td width="182" valign="top">
					<div id="container">
						<h1 class="type">
							<a href="javascript:void(0)">人事管理</a>
						</h1>
						<div class="content">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
										<img src="../images/menu_topline.gif" width="182" height="5" />
									</td>
								</tr>
							</table>
							<ul class="MM">
								<li>
									<a href="president_toemployee.action" target="main">员工管理</a>
								</li>
								<li>
									<a href="contract.do?method=findcontract" target="main">合同管理</a>
								</li>

								<li>
									<a href="findattendance.do?method=findattendance&level=超级管理员&department=<%=session.getAttribute("department") %>" target="main">考勤管理</a>
								</li>
								<li>
									<a href="fusionCharts.html" target="main">统计分析</a>
								</li>
							</ul>
						</div>
						<h1 class="type">
							<a href="javascript:void(0)">培训管理</a>
						</h1>
						<div class="content">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
										<img src="../images/menu_topline.gif" width="182" height="5" />
									</td>
								</tr>
							</table>
							<ul class="MM">
								<li>
									<a href="TrainingMangment.do?method=Trainingapproval"
										target="main">培训申请</a>
								</li>
								<li>
									<a href="TrainingMangment.do?method=Trainingplan" target="main">培训计划</a>
								</li>
								<li>
									<a href="TrainingMangment.do?method=Trainingevaluation"
										target="main">培训评价</a>
								</li>
								<li>
									<a href="TrainingMangment.do?method=Trainingfeedback"
										target="main">培训反馈</a>
								</li>


							</ul>
						</div>
						<h1 class="type">
							<a href="javascript:void(0)">招聘管理</a>
						</h1>
						<div class="content">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
										<img src="../images/menu_topline.gif" width="182" height="5" />
									</td>
								</tr>
							</table>
							<ul class="MM">
								<li>
									<a href="addRecruitment.html" target="main">新增招聘</a>
								</li>
								<li>
									<a
										href="findAllRecruitmentInfo.do?method=findAllRecruitmentInfo"
										target="main">编辑招聘</a>
								</li>
								<li>
									<a href="addCandidates.html" target="main">新人应聘</a>
								</li>
								<li>
									<a href="findCandidates.do?method=findCandidates" target="main">应聘管理</a>
								</li>
								<li>
									<a href="zhaopinCharts.html" target="main">统计分析</a>
								</li>

							</ul>
						</div>
						<h1 class="type">
							<a href="javascript:void(0)">薪酬管理</a>
						</h1>
						<div class="content">
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td>
										<img src="../images/menu_topline.gif" width="182" height="5" />
									</td>
								</tr>
							</table>
							<ul class="MM">
								<li>
									<a href="findAllsalary.do?method=findAllsalary" target="main">薪金管理</a>
								</li>
								<li>
									<a href="salaryCharts.html" target="main">统计分析</a>
								</li>
							</ul>
						</div>
					</div>
					<h1 class="type">
						<a href="javascript:void(0)">公告管理</a>
					</h1>
					<div class="content">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
									<img src="../images/menu_topline.gif" width="182" height="5" />
								</td>
							</tr>
						</table>
						<ul class="MM">
							<li>
								<a href="findallNotice.do?method=findallNotice" target="main">查看公告</a>
							</li>
							<li>
								<a href="addNotice.html" target="main">增加公告</a>
							</li>

						</ul>
					</div>

		<script type="text/javascript">
		var contents = document.getElementsByClassName('content');
		var toggles = document.getElementsByClassName('type');
	
		var myAccordion = new fx.Accordion(
			toggles, contents, {opacity: true, duration: 400}
		);
		myAccordion.showThisHideOpen(contents[0]);
	</script>
				</td>
			</tr>
		</table>
	</body>
</html>
