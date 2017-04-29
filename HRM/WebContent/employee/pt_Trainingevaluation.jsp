<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>培训反馈</title>
		<link href="<%=request.getContextPath()%>/images/skin.css" rel="stylesheet" type="text/css" />
		<link href="<%=request.getContextPath()%>/css/common.css" rel="stylesheet" type="text/css" />
		<script src="<%=request.getContextPath()%>/js/jquery-1.5.2.min.js" type="text/javascript"
			language="JavaScript"></script>
		<script src=<%=request.getContextPath()%>/js/check.js type="text/javascript"
			language="JavaScript" charset="GBK"></script>
	
		
	</head>

	<body>

		<table width="100%" cellpadding="0" cellspacing="0" border="0">
			<tr>
				<td width="17" valign="top" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">

					<img src="<%=request.getContextPath()%>/images/left-top-right.gif" width="17" height="29" />
				</td>
				<td valign="top" background="<%=request.getContextPath()%>/images/content-bg.gif">
					<table width="100%" height="31" cellpadding="0" cellspacing="0"
						class="left_topbg" id="table2">
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
									培训名称 
								</th>
								<th>
									培训反馈

								</th>
							</tr>
						</thead>
						<tbody>

							<tr onMouseOver="this.className = 'tr_over'" onMouseOut="this.className=''"  >

								<td>

									<div align="center" id="fzr${trainDirect}">
										<p>${trainDirect}<p>
									</div>
								</td>

								<td>
									<table width="100%" align="center">
										<c:forEach items="${evaluations}" var="evaluation">
										<tr>
											<td align="center"><p>${evaluation.employee.userName}说：</p>
											</td>
											<td style="color: red;"><p>${evaluation.trainEvaluation}</p></td>
										</tr>
										</c:forEach>
					
										<tr id="test">
											<td >
												${loginin.userName }
											</td>
											<td>
												<dir id="testtd"></dir>
											</td>
										</tr>
										<tr>
										<form action="employee_addevalue.action" method="post">
											<td align="center">
												<input type="submit" value="我要说">
												<input type="text" name="trainDirect" value="${trainDirect}" style="display: none;">
								
											</td>
											<td>
												<textarea rows="" cols="40" id="trafb" name="trainEvaluation">我要说……说说心得，说说体会！</textarea>
											</td>
											<form>
										</tr>


									</table>
								</td>
							</tr>
							
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
