$(document).ready(function() {
			findTr();
		})
function findTr() {
	var tempTr = $("#data").find("tr");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#fb1" + tempId).hide();

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");

					$("#fb" + tempId).hide();

					$("#fb1" + tempId).fadeIn();
				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var taid = tempId;
						var fb = $("#fb1" + tempId).children().val();

						$("#fb" + tempId).html(fb);

						$("#fb1" + tempId).hide();

						$("#fb" + tempId).fadeIn();

						submitEdit(taid, fb);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#fb1" + tempId).children().val($("#fb" + tempId)
								.html());

						$("#fb1" + tempId).hide();

						$("#fb" + tempId).fadeIn();
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

function submitEdit(taid,fb) {

	fb = encodeURI(encodeURI(fb));
	$.ajax({
				type : "post",
				url : "TrainingMangment.do?method=editFb",
				data : "taid=" + taid + "&fb=" + fb,

				success : function(data) {
					alert("更新成功");
				}
			});
}

function submitdelete(taid) {

	$.ajax({
				type : "post",
				url : "TrainingMangment.do?method=delFb",
				data : "taid=" + taid,

				success : function(data) {
					alert("删除成功");
					$("#fb"+taid).html("请输入反馈");
				}
			});
			
			
}
