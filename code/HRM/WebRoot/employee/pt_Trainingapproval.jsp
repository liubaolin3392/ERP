<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>培训申请</title>
		<link href="<%=request.getContextPath()%>/images/skin.css" rel="stylesheet" type="text/css" />
		<script src="<%=request.getContextPath()%>/js/jquery-1.5.2.min.js" type="text/javascript"
			language="JavaScript"></script>
		<script src="<%=request.getContextPath()%>/js/editetrapp.js" type="text/javascript"
			language="JavaScript">
		</script>
		<link href="<%=request.getContextPath()%>/css/common.css" rel="stylesheet" type="text/css" />
	</head>

	<body>

		<table width="100%"  cellpadding="0" cellspacing="0" border="0">
			<tr>
				<td width="17" valign="top" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">				
					<img src="<%=request.getContextPath()%>/images/left-top-right.gif" width="17" height="29" />
				</td>
				<td valign="top" background="<%=request.getContextPath()%>/images/content-bg.gif">
					<table width="100%" height="31" cellpadding="0"
						cellspacing="0" class="left_topbg" id="table2">
						<tr>
							<td height="31">
								<div class="titlebt">
									培训申请
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
	
					<form action="employee_addtrainapply.action" method="post">
						报批人：
						<select name="apply.employee.eid">
							<option value="${loginin.eid}">${loginin.userName}</option>
						</select>
						报批方向:

						<select name="apply.trainDirect">
							<c:forEach items="${trainPlans}" var="trainPlan">
							<option value="${trainPlan.trainDirect}">
								${trainPlan.trainDirect}
							</option>
							</c:forEach>
						</select>
						
						<input type="submit" value="添加申请">
					</form>
					<hr>
					<table id="data" width="100%"  align="center">
						<thead>
							<tr id="-1000">
								
								<th>
									员工姓名
								</th>
								<th>
									所在部门
								</th>
								<th>
									培训方向
								</th>
								<th>
									培训处理标志
								</th>

							</tr>
						</thead>
						<tbody>

							<c:forEach items="${trainApplies}" var="trainApply">
							<tr onMouseOver="this.className='tr_over'"
								onMouseOut="this.className=''" id="${trainApply.trainApplyId}">
								
								
								<td>
									<div align="center">
										${trainApply.employee.userName}
									</div>
								</td>
								<td>
									<div align="center">
										${trainApply.employee.department}
									</div>
								</td>
								<td>

									<div align="center" id="trf${trainApply.trainApplyId}">
										${trainApply.trainDirect}
									</div>
								</td>

								<td>

									<div align="center" id="trmark${trainApply.trainApplyId}">
										<c:choose>
											<c:when test="${trainApply.trainMark == 0 }">
												未处理
											</c:when>
										<c:otherwise>已处理</c:otherwise>
										</c:choose>	
												
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
