$(document).ready(function() {
			findTr();
		})
function findTr() {
	var tempTr = $("#data").find("tr");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#eva1" + tempId).hide();

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");

					$("#eva" + tempId).hide();

					$("#eva1" + tempId).fadeIn();
				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var taid = tempId;
						var eva = $("#eva1" + tempId).children().val();

						$("#eva" + tempId).html(eva);

						$("#eva1" + tempId).hide();

						$("#eva" + tempId).fadeIn();

						submitEdit(taid, eva);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#eva1" + tempId).children().val($("#eva" + tempId)
								.html());

						$("#eva1" + tempId).hide();

						$("#eva" + tempId).fadeIn();
					}
				}

			});
		}

		$("#deleteedit" + tempId).click(function() {
					var taid = tempId;
					
					if (confirm("您确定提交吗？")) {
						submitdelete(taid);

					} else {
						$("#" + tempId).fadeIn(100);
					}

				});

	});
}

function submitEdit(taid,eva) {

	eva = encodeURI(encodeURI(eva));
	$.ajax({
				type : "post",
				url : "TrainingMangment.do?method=editEva",
				data : "taid=" + taid + "&eva=" + eva,

				success : function(data) {
					alert("更新成功");
				}
			});
}

function submitdelete(taid) {

	$.ajax({
				type : "post",
				url : "TrainingMangment.do?method=delEva",
				data : "taid=" + taid,

				success : function(data) {
					alert("删除成功");
					$("#eva"+taid).html("请输入评价");
				}
			});
			
			
}
