<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="<%=request.getContextPath()%>/images/skin.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/editeContract.js"
	charset="GBK"></script>

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
								合同管理
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
				<table id="data" width="100%" align="center">
					<TR id="-1000">

						<TH>
							<p>
								合同持有人
							</p>
						</TH>
						<TH>
							<p>
								合同持有人所在部门
							</p>
						</TH>
						<TH>
							<p>
								合同持有人年龄
							</p>
						</TH>
						<TH>
							<p>
								合同持有人联系方式
							</p>
						</TH>
						<TH>
							<p>
								合同名称
							</p>
						</TH>
						<TH>
							<p>
								合同性质
							</p>
						</TH>
						<TH>
							<p>
								合同内容
							</p>
						</TH>


					</TR>
							
					<c:forEach var="c" items="${contracts}">
					<TR onMouseOver="this.className='tr_over'"
						onMouseOut="this.className=''">

						<TD>

							<div align="center">
								${loginin.userName}
							</div>

						</TD>
						<TD>
							<div align="center">
								${loginin.department}
							</div>
						</TD>
						<TD>
							<div align="center">
								${loginin.age}
							</div>

						</TD>
						<TD>
							<div align="center">
								${loginin.phone} 
							</div>
						</TD>
						<TD>
							<div align="center" id="cname${cid} }">
								${c.contractName} 
							</div>
						</TD>
						<TD>
							<div align="center" id="cnature${cid}">
								${c.contractType} 
							</div>


						</TD>
						<TD>
							<div align="center" id="cagreement${cid}">
								${c.contractContect}
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

