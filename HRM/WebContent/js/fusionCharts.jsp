<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>动态报表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/styles/chartStyle.css" type="text/css" />
   -->
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/autocomplete/jquery.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/FusionCharts.js"></script>
  </head>
  
  <body>
  <center>
         请选择年份
			<select id="year" name="year" onchange="report_request()">
				<option value="2010">
					2010
				</option>
				<option value="2011">
					2011
				</option>
			</select>
           请选择报表类型:
       <select id="report_type" onchange="report_request()">
				<option value="0">
					柱状图1
				</option>
				<option value="1">
					饼图1
				</option>
				<option value="2">
					住状图2
				</option>
				<option value="3">
					曲线图1
				</option>
				<option value="4">
					区域图
				</option>
				<option value="5">
					曲线图2
				</option>
				<option value="6">
					饼图2
				</option>
			</select>
			
        <div id="chartdiv">
		</div>
		
       </center>
        <script type="text/javascript">
        var swf;
             $(document).ready(function()
             {
                 swf =new Array("FCF_Column3D.swf","Doughnut3D.swf","Column3D.swf","Line.swf","FCF_Area2D.swf","FCF_Line.swf","FCF_Pie3D.swf");//三种图形
                report_request();
             });
             
          function report_request() {
           var year = $('#year').val();
				$.ajax( {
					type : "post",
					url : "dynaChart.do?method=getChart",
					data:"year="+year,
					dataType : "json",
					success : function(data) {	
						if(data.isEmpty != 0)//有数据
						{
							var gtype =	$("#report_type").val();				
							chartStr=data.xml;
							chart = new FusionCharts("${pageContext.request.contextPath}/FusionChart/"+swf[gtype], "ChartId", "650", "450");	
		   					chart.setDataXML(chartStr);	   
		   					chart.render("chartdiv");	
		   				}	
		   				else
		   				{
		   					$("#chartdiv").html("<font size='5' color='red'>对不起没有数据！</font>");
		   				}
					}
				});
			}
         </script>
  </body>
</html>
