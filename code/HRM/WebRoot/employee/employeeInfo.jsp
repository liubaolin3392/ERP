<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>



<link href="<%=request.getContextPath()%>/images/skin.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/editeInformationpt.js"></script>
<body>
	<table width="100%" cellpadding="0" cellspacing="0" border="0">
		<tr>
			<td width="17" valign="top" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">
				<img src="<%=request.getContextPath()%>/images/left-top-right.gif" width="17" height="29" />
			</td>
			<td valign="top" background="<%=request.getContextPath()%>/images/content-bg.gif">
				<table width="100%" height="31" border="0" cellpadding="0"
					cellspacing="0" class="left_topbg" id="table2">
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
			<td valign="middle" background="<%=request.getContextPath()%>/images/mail_leftbg.gif">
				&nbsp;
			</td>
			<td valign="top" bgcolor="#F7F8F9">
				<br>			

				<table id="data" width="100%"  align="center">
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

					</TR>
					<TR onMouseOver="this.className='tr_over'"
						onMouseOut="this.className=''" id="${loginin.userId}">
					<div id="eid">${loginin.eid}</div>
						<TD>
							<div align="center" id="userName1${loginin.userId}">
								<input value="${loginin.userName}">
							</div>
							<div align="center" id="userName${loginin.userId}">
								${loginin.userName}
							</div>

						</TD>
						<TD>
							<div align="center" id="password1${loginin.userId}">
								<input value="${loginin.password}">
							</div>
							<div align="center" id="password${loginin.userId}">
								${loginin.password}
							</div>
						</TD>
						<TD>
							<div align="center" id="age1${loginin.userId}">
								<input value="${loginin.age}">
							</div>
							<div align="center" id="age${loginin.userId}">
								${loginin.age}
							</div>

						</TD>
						<TD>
							<div align="center" id="sex1${loginin.userId}">
								<input value="${loginin.sex}">
							</div>
							<div align="center" id="sex${loginin.userId}">
								${loginin.sex}
							</div>


						</TD>
						<TD>
							<div align="center" id="department1${loginin.userId}">
								<input value="${loginin.department}">
							</div>
							<div align="center" id="department${loginin.userId}">
								${loginin.department}
							</div>


						</TD>
						<TD>
							<div align="center" id="position1${loginin.userId}">
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
							<div align="center" id="position${loginin.userId}">
								${loginin.position}
							</div>
						</TD>
						<TD>
							<div align="center" id="phone1${loginin.userId}">
								<input value="${loginin.phone}">
							</div>
							<div align="center" id="phone${loginin.userId}">
								${loginin.phone}
							</div>

						</TD>
						<TD>
							<div align="center" id="userLevel1${loginin.userId}">
								<input value="${loginin.userLevel}">
							</div>
							<div align="center" id="userLevel${loginin.userId}">
								${loginin.userLevel}
							</div>
						</TD>

						<TD>
							<div align="center">
								<input type="hidden" id="storeEdit${loginin.userId}"
									value="0">
								<a id="edit${loginin.userId}" href='javascript:void(0)'
									style="border: 0px"><img src="<%=request.getContextPath()%>/images/ad.gif" /> </a>
							</div>

						</TD>

					</TR>


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

