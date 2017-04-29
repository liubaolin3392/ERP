$(document).ready(function() {

	$("#a_trapp").click(function() {
		
		var a_bpr = $("#a_bpr").val();
		var a_bpfx = $("#a_bpfx").val();

		if (a_bpr == "") {
			alert("请选择申请人！！");
			$("#a_bpr").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#a_bpr").css("background", "#FFFFFF");
			});
			return false;
		}
		if (a_bpfx == "") {
			alert("请选择培训方向！！");
			$("#a_bpfx").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#a_bpfx").css("background", "#FFFFFF");
			});
			return false;
		}
		
	});
	
});