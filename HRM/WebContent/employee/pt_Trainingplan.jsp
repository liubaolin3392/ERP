<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<link href="<%=request.getContextPath()%>/css/common.css" rel="stylesheet" type="text/css" />
		<link href="<%=request.getContextPath()%>/images/skin.css" rel="stylesheet" type="text/css" />
		<link type="text/css" href="<%=request.getContextPath()%>/css/ui.all.css" rel="stylesheet" />
		<link type="text/css" href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" />
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/editeTrainingplan.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/ui.core.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/ui.datepicker.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/ui.datepicker-zh_CN.js"></script>
		<script type="text/javascript">
	function datePicker(pickerName,locale) {
		$(pickerName).datepicker($.datepicker.regional[locale]);
		$(pickerName).datepicker('option', 'changeMonth', true);//月份可调
		$(pickerName).datepicker('option', 'changeYear', true);//年份可调
	}
	
	$(function() {
		//var locale = "<s:property value='#request.locale'/>";//struts2取语言环境
		//var locale = "<%=request.getLocale()%>"; //jsp取浏览器语言环境
		//datePicker('#dateDemo',locale);//根据语言环境切换日期控件语言
		datePicker('#dateDemo','zh_CN');
		datePicker('#dateDemo1','zh_CN');
		//datePicker('#dateDemo',''); //''默认的样式在ui.datepicker.js内已定义为英文样式，与附件内的ui.datepicker-en_US.js相同
	});
	</script>
		<title>培训计划</title>
	</head>
	<body>

		<table width="100%" cellpadding="0" cellspacing="0" border="0">
			<tr>
				<td width="17" valign="top" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">
					<img src="<%=request.getContextPath()%>/images/left-top-right.gif" width="17" height="29" />
				</td>
				<td valign="top" background="<%=request.getContextPath()%>/images/content-bg.gif">
					<table width="100%" height="31"  cellpadding="0"
						cellspacing="0" class="left_topbg" id="table2">
						<tr>
							<td height="31">
								<div class="titlebt">
									培训计划
								</div>
							</td>
						</tr>
					</table>
				</td>
				<td width="16" valign="top" background="<%=request.getContextPath()%>/images/mail_rightbg.gif">
					<img src="<%=request.getContextPath()%>/images/nav-right-bg.gif" width="16" height="29" />
				</td>
			</tr>
			<tr>
				<td valign="middle" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">
					&nbsp;
				</td>

				<td valign="top" bgcolor="#F7F8F9">
					<form action="employee_findplan.action" method="post">
						计划适用对象：
						<select size="1" name="trainObject">
							<option value="所有部门">
								所有部门
							</option>
							<option value="人事部">
								人事部
							</option>
							<option value="财务部">
								财务部
							</option>
							<option value="市场部">
								市场部
							</option>
							<option value="销售部">
								销售部
							</option>
							<option value="研发部">
								研发部
							</option>
						</select>
						培训方向:
						<input type="text" name="trainDirect">
						培训内容:
						<input type="text" name="trainContent">
						<input type="submit" value="查询">
					</form>
					<hr>

					<table id="data" width="100%"  align="center">
						<thead>
							<tr id="-1000">
								
								<th>
									培训对象
								</th>
								<th>
									培训方向
								</th>
								<th>
									培训内容简介
								</th>
								<th>
									培训开始时间
								</th>
								<th>
									培训持续时间（月）
								</th>
							</tr>
						</thead>
						<tbody>	
						<c:forEach items="${trainPlans}" var="tp">
							<tr id="${tp.trainPlanId}"
								onMouseOver="this.className='tr_over'"
								onMouseOut="this.className=''">
					
								<td>
									<div align="center" id="trd${tp.trainObject}">
										${tp.trainObject}
									</div>
								</td>
								<td>
									<div align="center" id="trf${tp.trainPlanId}">
										${tp.trainDirect}
									</div>
								</td>
								<td>
									<div align="center" id="trn${tp.trainPlanId}">
										${tp.trainContent}
									</div>
								</td>
								<td>
									<div align="center" id="trst${tp.trainPlanId}">
										${tp.trainStartTime}
									</div>
								</td>
								<td>
									<div align="center" id="trc${tp.trainPlanId}">
										${tp.trainContinueTime}
									</div>
								</td>
							</tr>

				</c:forEach>

						</tbody>
					</table>
				<td valign="bottom" background="<%=request.getContextPath()%>/images/mail_rightbg.gif">
					<img src="<%=request.getContextPath()%>/images/buttom_right2.gif" width="16" height="17" />
		   	   </td>
			</tr>

			<tr>
				<td valign="bottom" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">
					<img src="<%=request.getContextPath()%>/images/buttom_left2.gif" width="17" height="17" />
				</td>
				<td background="<%=request.getContextPath()%>/images/buttom_bgs.gif">
					<img src="<%=request.getContextPath()%>/images/buttom_bgs.gif" width="17" height="17">
				</td>
				<td valign="bottom" background="<%=request.getContextPath()%>/images/mail_rightbg.gif">
					<img src="<%=request.getContextPath()%>/images/buttom_right2.gif" width="16" height="17" />
				</td>
			</tr>
		</table>
		<input id="editsta" type="hidden" value="0" />
	</body>
</html>
