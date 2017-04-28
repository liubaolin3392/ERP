$(document).ready(function() {

	$("#a_trplan").click(function() {
		
		var a_trf = $("#a_trf").val();
		var a_trd = $("#a_trd").val();
		var a_trn = $("#a_trn").val();
		var dateDemo = $("#dateDemo").val();
		var a_trc = $("#a_trc").val();
		var a_fzr = $("#a_fzr").val();
		if (a_trf == "") {
			alert("请为培训方向指定名称！！");
			$("#a_trf").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#a_trf").css("background", "#FFFFFF");
			});
			return false;
		}
		if (a_trd == "") {
			alert("请为培训方向指定适用对象！！");
			$("#a_trd").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#a_trd").css("background", "#FFFFFF");
			});
			return false;
		}
		if (a_trn == "") {
			alert("请为输入培训内容（地点，费用，课程安排）！！");
			$("#a_trn").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#a_trn").css("background", "#FFFFFF");
			});
			return false;
		}
		if (a_fzr == "") {
			alert("请为培训方向指定负责人！！");
			$("#a_fzr").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#a_fzr").css("background", "#FFFFFF");
			});
			return false;
		}
		if (dateDemo== "") {
			alert("请为输入培训开始时间！！");
			$("#dateDemo").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#dateDemo").css("background", "#FFFFFF");
			});
			return false;
		}
		if (a_trc == "") {
			alert("请为输入培训持续时间！！");
			$("#a_trc").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#a_trc").css("background", "#FFFFFF");
			});
			return false;
		}
		if (dateDemo.search("(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)") != 0) {
			alert("请为培训持续时间输入正确的格式或者从日历中选择！！");
			$("#dateDemo").val("");
			$("#dateDemo").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#dateDemo").css("background", "#FFFFFF");
			});
			return false;
		}
		
		if (a_trc.search("^-?\\d+$") != 0) {
			alert("请为培训持续时间输入正确的格式（单位：月）！！");
			$("#a_trc").val("");
			$("#a_trc").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#a_trc").css("background", "#FFFFFF");
			});
			return false;
		}

	});
	
});