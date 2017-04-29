$(document).ready(function() {
			findTr();
		});
function findTr() {
	var tempTr = $("#data").find("TR");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		var adid = tempId;

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
						$("#" + tempId).hide(100);
						if (confirm("您确定提交吗？")) {

							submitEdit(adid);

						} else {
							$("#" + tempId).fadeIn(100);
						}

					});
		}

	});
}

function submitEdit(adid) {

	$.ajax({
				type : "post",
				url : "deleteAttendance.do?method=deleteAttendance",
				data : "adid=" + adid,

				success : function(data) {
					alert("删除成功");
				}
			});
}
