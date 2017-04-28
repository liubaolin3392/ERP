$(document).ready(function() {
			findTr();
		})
function findTr() {
	var tempTr = $("#data").find("TR");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#trd1" + tempId).hide();
		$("#department1" + tempId).hide();
		$("#trf1" + tempId).hide();
		$("#trn1" + tempId).hide();
		$("#userid1" + tempId).hide();
		$("#trst1" + tempId).hide();
		$("#trc1" + tempId).hide();

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");

					$("#trd" + tempId).hide();
					$("#department" + tempId).hide();
					$("#trf" + tempId).hide();
					$("#trn" + tempId).hide();
					$("#userid" + tempId).hide();
					$("#trst" + tempId).hide();
					$("#trc" + tempId).hide();

					$("#trd1" + tempId).fadeIn();
					$("#department1" + tempId).fadeIn();
					$("#trf1" + tempId).fadeIn();
					$("#trn1" + tempId).fadeIn();
					$("#userid1" + tempId).fadeIn();
					$("#trst1" + tempId).fadeIn();
					$("#trc1" + tempId).fadeIn();

				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var trid = tempId;
						var trd = $("#trd1" + tempId).children().val();
						var department = $("#department1" + tempId).children()
								.val();
						var trf = $("#trf1" + tempId).children().val();

						var trn = $("#trn1" + tempId).children().val();
						var userid = $("#userid1" + tempId + " option:selected")
								.val();

						var trc = $("#trc1" + tempId).children().val();

						var trst = $("#trst1" + tempId).children().val();

						if (userid == "") {
							alert("请为培训方向指定负责人！！");
							$("#userid1").css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
										$("#userid1").css("background",
												"#FFFFFF");
									});
							return false;
						}
						if (trst.search("(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)") != 0) {
							alert("请为培训持续时间输入正确的格式(yyyy-mm-dd)！！");
							$("#trst1" + tempId).val("");
							$("#trst1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#trst1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}

						$("#trd" + tempId).html(trd);
						$("#department" + tempId).html(department);
						$("#trf" + tempId).html(trf);
						$("#trn" + tempId).html(trn);
						$("#userid" + tempId).html(userid);
						$("#trst" + tempId).html(trst);
						$("#trc" + tempId).html(trc);

						$("#trd1" + tempId).hide();
						$("#department1" + tempId).hide();
						$("#trf1" + tempId).hide();
						$("#trn1" + tempId).hide();
						$("#userid1" + tempId).hide();
						$("#trst1" + tempId).hide();
						$("#trc1" + tempId).hide()

						$("#trd" + tempId).fadeIn();
						$("#department" + tempId).fadeIn();
						$("#trf" + tempId).fadeIn();
						$("#trn" + tempId).fadeIn();
						$("#userid" + tempId).fadeIn();
						$("#trst" + tempId).fadeIn();
						$("#trc" + tempId).fadeIn();

						submitEdit(trid, trd, department, trf, trn, userid,
								trst, trc);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#trd1" + tempId).children().val($("#trd" + tempId)
								.html());
						$("#department1" + tempId).children()
								.val($("#department" + tempId).html());
						$("#trf1" + tempId).children().val($("#trf" + tempId)
								.html());
						$("#trn1" + tempId).children().val($("#trn" + tempId)
								.html());
						$("#userid1" + tempId).children().val($("#userid"
								+ tempId).html());
						$("#trst1" + tempId).children().val($("#trst" + tempId)
								.html());
						$("#trc1" + tempId).children().val($("#trc" + tempId)
								.html());

						$("#trd1" + tempId).hide();
						$("#department1" + tempId).hide();
						$("#trf1" + tempId).hide();
						$("#trn1" + tempId).hide();
						$("#userid1" + tempId).hide();
						$("#trst1" + tempId).hide();
						$("#trc1" + tempId).hide();

						$("#trd" + tempId).fadeIn();
						$("#department" + tempId).fadeIn();
						$("#trf" + tempId).fadeIn();
						$("#trn" + tempId).fadeIn();
						$("#userid" + tempId).fadeIn();
						$("#trst" + tempId).fadeIn();
						$("#trc" + tempId).fadeIn();

					}
				}

			});
		}

		$("#deleteedit" + tempId).click(function() {
					var trid = tempId;
					$("#" + tempId).hide(100);
					if (confirm("您确定提交吗？")) {
						submitdelete(trid);

					} else {
						$("#" + tempId).fadeIn(100);
					}

				});

	});
}

function submitEdit(trid, trd, department, trf, trn, userid, trst, trc) {

	trd = encodeURI(encodeURI(trd));
	department = encodeURI(encodeURI(department));
	trf = encodeURI(encodeURI(trf));
	trn = encodeURI(encodeURI(trn));
	trst = encodeURI(encodeURI(trst));
	$.ajax({
				type : "post",
				url : "TrainingMangment.do?method=updateTrainingplan",
				data : "trid=" + trid + "&trd=" + trd + "&department="
						+ department + "&trf=" + trf + "&trn=" + trn
						+ "&userid=" + userid + "&trst=" + trst + "&trc=" + trc,

				success : function(data) {
					alert("更新成功");
				}
			});
}

function submitdelete(trid) {

	$.ajax({
				type : "post",
				url : "TrainingMangment.do?method=deleteTrainingplan",
				data : "trid=" + trid,

				success : function(data) {
					alert("删除成功");
				}
			});

}
