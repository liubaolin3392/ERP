<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>培训反馈</title>
		<link href="<%=request.getContextPath()%>/images/skin.css" rel="stylesheet" type="text/css" />
		<script src="<%=request.getContextPath()%>/js/jquery-1.5.2.min.js" type="text/javascript"
			language="JavaScript"></script>
		<script src=<%=request.getContextPath()%>/js/editetrfb.js type="text/javascript"
			language="JavaScript" charset="GBK">
	
</script>
		<link href="<%=request.getContextPath()%>/css/common.css" rel="stylesheet" type="text/css" />
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
									培训反馈
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
				<hr>
					<table id="data" width="100%" align="center">
						<thead>
							<tr id="-1000">
								
								<th>
									员工姓名
								</th>
								
								<th>
									培训方向
								</th>
								<th>
									我的表现
								</th>
								<th>
									添加评价
								</th>
								
							</tr>
						</thead>
						<tbody>
							
							<c:forEach items="${feedBacks}" var="feedback">
							<tr onMouseOver="this.className
								= 'tr_over'" onMouseOut="this.className=''"  id="${feedback.trainFeedbackId}">
								
								<td>

									<div align="center">
										${feedback.employee.userName}
									</div>
								</td>
								<td>
									<div align="center">
										${feedback.trainDirect}
									</div>
								</td>
								<td>

									<div align="center">
										${feedback.trainFeedback}
									</div>
								</td>		
								<td>
									<div align="center">
										<a href="employee_evalue.action?trainDirect=${feedback.trainDirect}"
											style="border: 0px"><img src="<%=request.getContextPath()%>/images/ad.gif" /> </a>
									</div>
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
