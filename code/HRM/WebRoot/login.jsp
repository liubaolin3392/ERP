<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<title>网站管理员登陆</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #1D3647;
}
-->
</style>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/check.js"></script>
<link href="images/skin.css" rel="stylesheet" type="text/css">
<body>
	<table width="100%" height="166" border="0" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="42" valign="top">
				<table width="100%" height="42" border="0" cellpadding="0"
					cellspacing="0" class="login_top_bg">
					<tr>
						<td width="1%" height="21">&nbsp;
							
						</td>
						<td height="42">&nbsp;
							
						</td>
						<td width="17%">&nbsp;
							
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td valign="top">
				<table width="100%" height="532" border="0" cellpadding="0"
					cellspacing="0" class="login_bg">
					<tr>
						<td width="49%" align="right">
							<table width="91%" height="532" border="0" cellpadding="0"
								cellspacing="0" class="login_bg2">
								<tr>
									<td height="138" valign="top">
										<table width="89%" height="427" border="0" cellpadding="0"
											cellspacing="0">
											<tr>
												<td  align="right" valign="top"></td>
											<tr>
												<td  align="center" valign="bottom">
													<img src="images/logo.png">
												</td>
											</tr>
											<tr>
												<td height="198" align="right" valign="top">
													<table width="100%" border="0" cellpadding="0"
														cellspacing="0">
														<tr>
															<td width="35%" align="right">&nbsp;
																<img src="images/dot_on.gif">
															</td>
															<td height="25" colspan="2" class="left_txt">
																<p>
																	1- 企业人事管理的首选方案...
																</p>
															</td>
														</tr>
														<tr>
															<td align="right">&nbsp;
																<img src="images/dot_on.gif">
															</td>
															<td height="25" colspan="2" class="left_txt">
																<p>
																	2- 一站通式的整合方式，方便用户使用...
																</p>
															</td>
														</tr>
														<tr>
															<td align="right">&nbsp;
																<img src="images/dot_on.gif">
															</td>
															<td height="25" colspan="2" class="left_txt">
																<p>
																	3- 强大的后台系统，管理内容易如反掌...
																</p>
															</td>
														</tr>
														<tr>
															<td>&nbsp;
																
															</td>
															<td width="30%" height="40">
																<img src="images/icon-demo.gif" width="16" height="16">
																<a href="http://www.865171.cn" target="_blank"
																	class="left_txt3"> 使用说明</a>
															</td>
															<td width="35%">
																<img src="images/icon-login-seaver.gif" width="16"
																	height="16">
																<a href="http://www.865171.cn" class="left_txt3">
																	在线客服</a>
															</td>
														</tr>
													</table>
												</td>
											</tr>
										</table>
									</td>
								</tr>

							</table>
						</td>
						<td width="1%">&nbsp;
							
						</td>
						<td width="50%" valign="bottom">
							<table width="100%" height="59" border="0" align="center"
								cellpadding="0" cellspacing="0">
								<tr>
									<td width="4%">&nbsp;
										
									</td>
									<td width="96%" height="105" align="left" valign="top">
										<img src="images/login-welcome.gif">
									</td>
								</tr>
								<tr>
									<td>&nbsp;
										
									</td>
									<td height="21">
										<table cellSpacing="0" cellPadding="0" width="100%" border="0"
											id="table211" height="328">
											<tr>
											<c:if test="${not empty msg}">
											<div style="color: red;">${msg}</div>
											
											</c:if>
												<td height="164" colspan="2" align="middle">
													<form name="myform" action="login_login.action" method="post">
														<table cellSpacing="0" cellPadding="0" width="100%"
															border="0" height="143" id="table212">
															<tr>
																<td width="13%" height="38" class="top_hui_text">
																	<span class="login_txt">用户名：&nbsp;&nbsp; </span>
																</td>
																<td height="38" colspan="2" class="top_hui_text">
																	<input name="employee.userId" class="editbox4" value=""
																		size="20" id = "username">
																</td>
															</tr>
															<tr>
																<td width="13%" height="35" class="top_hui_text" valign="bottom">
																	<span class="login_txt"> 密 码<img src="images/luck.gif" width="19" height="18">： &nbsp;&nbsp; </span>
																</td>
																<td height="35" colspan="2" class="top_hui_text">
																	<input class="editbox4" type="password" size="20"
																		name="employee.password" id="password">
																	
																</td>
															</tr>
															<tr>
																<td width="13%" height="35">
																	<span class="login_txt">用户权限：</span>
																</td>
																<td height="35" colspan="2" class="top_hui_text">
																	<select size="1" name="employee.userLevel" id="level">
																		<option value="">

																		</option>
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
																</td>
															</tr>
															<tr>
																<td height="35">&nbsp;
																	
																</td>
																<td width="20%" height="35">
																	<input name="Submit" type="submit" class="button"
																		id="Submit" value="登 陆">
																</td>
																<td width="67%" class="top_hui_text">
																	<input name="cs" type="button" class="button" id="cs"
																		value="取 消">
																</td>
															</tr>
														</table>
														<br>
													</form>
												</td>
											</tr>
											<tr>
												<td  align="center" valign="bottom">
													<img src="images/login-wel.gif" >
												</td>
												<td width="57" align="right" valign="bottom">&nbsp;
													
												</td>
											</tr>
										</table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td height="20">
				<table width="100%" border="0" cellspacing="0" cellpadding="0"
					class="login-buttom-bg">
					<tr>
						<td align="center">
							<span class="login-buttom-txt">Copyright &copy; 2011-2016 WWW.MyOffice.com.cn</span>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>