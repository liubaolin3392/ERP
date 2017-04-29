<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<meta charset="utf-8" />
<link href="<%=request.getContextPath()%>/images/skin.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/editeInformation.js" charset="GBK"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/check.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#1").click(function() {
			$("#2").slideToggle("slow");
		});
		$("#3").click(function() {
			$("#4").slideToggle("slow");
		});
	});
</script>
<style type="text/css">
	div.panel,
	b.flip {
		margin: 0px;
		padding: 5px;
		text-align: center;
		background: #B7E1FA;
		border: solid 1px #c3c3c3;
	}
	
	div.panel {
		height: 40px;
		display: none;
	}
</style>

<body>
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td width="17" valign="top" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">
				<img src="<%=request.getContextPath()%>/images/left-top-right.gif" width="17" height="29" />
			</td>
			<td valign="top" background="<%=request.getContextPath()%>/images/content-bg.gif">
				<table width="100%" height="31" border="0" cellpadding="0" cellspacing="0" class="left_topbg" id="table2">
					<tr>
						<td height="31">
							<div class="titlebt">
								员工管理
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
			<td valign="middle" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">&nbsp;

			</td>
			<td valign="top" bgcolor="#F7F8F9">
				<br>

				<form action="president_searchEmployee.action" method="POST">
					姓名：<input type="text" name="username"> 
					年龄：<input type="text" name="age">
					 性别：男<input type="radio" checked="checked" value="男" name="sex"> 女<input type="radio" value="女" name="sex"> 
					 部门：
					<select size="1" name="department">
							<option value="">

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
							<option value="其它">
								其它
							</option>
						</select> 职务：
					<select size="1" name="position">
							<option value="">

							</option>
							<option value="普通员工">
								普通员工
							</option>
							<option value="小组组长">
								小组组长
							</option>
							<option value="经理助理">
								经理助理
							</option>
							<option value="部门经理">
								部门经理
							</option>
							<option value="总经理">
								总经理
							</option>
							<option value="公司董事">
								公司董事
							</option>
						</select>

					<input type="submit" value="查询">
					<b id="3" class="flip">
					添加用户
				      </b>
				</form>

				<hr>
				<div class="panel" id="4">
				<c:if test="${not empty msg }">
				<div style="color: red;">${msg }</div>
				</c:if>
					<form action="president_regist.action" method="post">
						用户名：
						<INPUT type="text" id="regitusername" name="employee.username"> 密码：
						<INPUT type="password" id="regitpassword" name="employee.password"> 年龄：
						<input type="text" name="age" id="regitage"> 性别： 男
						<input type="radio" checked="checked" value="男 " name="employee.sex"> 女
						<input type="radio" value="女" name="employee.sex">
						<br> 部门：
						<select size="1" name="employee.department">
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
							<option value="其它">
								其它
							</option>
						</select> 职务：
						<select size="1" name="employee.position">
							<option value="普通员工">
								普通员工
							</option>
							<option value="小组组长">
								小组组长
							</option>
							<option value="经理助理">
								经理助理
							</option>
							<option value=" 部门经理">
								部门经理
							</option>
							<option value="总经理">
								总经理
							</option>
							<option value="公司董事">
								公司董事
							</option>
						</select> 电话：
						<input type="text" name="employee.phone" id="regitphone"> 级别：
						<select size="1" name="employee.userLevel">
							<option value="1">
								普通用户
							</option>
							<option value="2">
								一般管理员
							</option>
							<option value="3">
								超级管理员
							</option>
						</select>
						<input type="submit" value="添加用户" id="regitUser">
					</form>
				</div>

				<table id="data" width="100%" align="center">
					<TR id="-1000">

						<TH>
							<p>
								姓名
							</p>
						</TH>
						<TH>
							<p>
								密码
							</p>
						</TH>
						<TH>
							<p>
								年龄
							</p>
						</TH>
						<TH>
							<p>
								性别
							</p>
						</TH>
						<TH>
							<p>
								部门
							</p>
						</TH>
						<TH>
							<p>
								职务
							</p>
						</TH>
						<TH>
							<p>
								电话
							</p>
						</TH>
						<TH>
							<p>
								级别
							</p>
						</TH>
						<TH>
							<p>
								编辑
							</p>
						</TH>
						<TH>
							<p>
								删除
							</p>
						</TH>

					</TR>
					
					
					<c:forEach items="${employees}" var="employee">
					<TR onMouseOver="this.className='tr_over'" onMouseOut="this.className=''"  id="${employee.userId}">
										<div id="eid">${employee.eid}</div>
						<TD>
							<div align="center" id="userName1${employee.userId}">
								<input value="${employee.userName }">
							</div>
							<div align="center" id="userName${employee.userId}">
											${employee.userName }
							</div>

						</TD>
						<TD>
							<div align="center" id="password1${employee.userId}">
								<input value="${employee.password }">
							</div>
							<div align="center" id="password${employee.userId}">
												${employee.password }
							</div>
						</TD>
						<TD>
							<div align="center" id="age1${employee.userId}">
								<input value="${employee.age }">
							</div>
							<div align="center" id="age${employee.userId}">
										${employee.age }
							</div>

						</TD>
						<TD>
							<div align="center" id="sex1${employee.userId}">
								<input value="${employee.sex }">
							</div>
							<div align="center" id="sex${employee.userId}">
								${employee.sex }
							</div>

						</TD>
						<TD>
							<div align="center" id="department1${employee.userId}">
								
								<select size="1" name="department">
									<option value="">

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
									<option value="其它">
										其它
									</option>
								</select>
							</div>
							<div align="center" id="department${employee.userId}">
								${employee.department }
							</div>

						</TD>
						<TD>
							<div align="center" id="position1${employee.userId}">
								<select size="1" name="position">
									<option value="">

									</option>
									<option value="普通员工">
										普通员工
									</option>
									<option value="小组组长">
										小组组长
									</option>
									<option value="经理助理">
										经理助理
									</option>
									<option value="部门经理">
										部门经理
									</option>
									<option value="总经理">
										总经理
									</option>
									<option value="公司董事">
										公司董事
									</option>
								</select>
							</div>
							<div align="center" id="position${employee.userId}">
								${employee.position }
							</div>
						</TD>
						<TD>
							<div align="center" id="phone1${employee.userId}">
								<input value="${employee.phone }">
							</div>
							<div align="center" id="phone${employee.userId}">
												${employee.phone }
							</div>

						</TD>
						<TD>
							<div align="center" id="userLevel1${employee.userId}">
								<select size="1" name="userLevel">
									<option value="普通用户">
										普通用户
									</option>
									<option value="一般管理员">
										一般管理员
									</option>
									<option value="超级管理员">
										超级管理员
									</option>
								</select>
							</div>
							<div align="center" id="userLevel${employee.userId}">
							${employee.userLevel }
							</div>
						</TD>

						<TD>
							<div align="center">
								<input type="hidden" id="storeEdit${employee.userId}" value="0">
								<a id="edit${employee.userId}" href='javascript:void(0)' style="border: 0px"><img src="<%=request.getContextPath()%>/images/ad.gif" /> </a>
							</div>

						</TD>
						<TD>
							<div align="center">
								<a id="deleteedit${employee.userId}" href='javascript:void(0)' style="border: 0px"><img src="<%=request.getContextPath()%>/images/defind.gif" />
							</div>
						</TD>

					</TR>

					</c:forEach>

				</table>

			</td>
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

</body>