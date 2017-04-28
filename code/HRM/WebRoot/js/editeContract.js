$(document).ready(function() {
	findTr();
});
function findTr() {
	var tempTr = $("#data").find("TR");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#cname1" + tempId).hide();
		$("#cnature1" + tempId).hide();
		$("#cagreement1" + tempId).hide();
		$("#ctime1" + tempId).hide();
		$("#cend1" + tempId).hide();
		

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");
					$("#cname" + tempId).hide();
					$("#cnature" + tempId).hide();
					$("#cagreement" + tempId).hide();

					$("#cname1" + tempId).fadeIn();
					$("#cnature1" + tempId).fadeIn();
					$("#cagreement1" + tempId).fadeIn();
				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var cid = tempId;
						var userid = $("#userid1" + tempId).children().val();
						var cname = $("#cname1" + tempId).children().val();
						var cnature = $("#cnature1" + tempId).children().val();

						var cagreement = $("#cagreement1" + tempId).children()
								.val();

						if (cname == "") {
							alert("合同名称不能为空！！");
							$("#cname1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#cname1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}
						if (cnature == "") {
							alert("合同性质不能为空！！");
							$("#cnature1" + tempId)
									.css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#cnature1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}
						if (cagreement == "") {
							alert("合同内容不能为空！！");
							$("#cagreement1" + tempId).css("background",
									"#B7E1FA");
							$("INPUT").keypress(function() {
								$("#cagreement1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}

						$("#cname" + tempId).html(cname);
						$("#cnature" + tempId).html(cnature);
						$("#cagreement" + tempId).html(cagreement);

						$("#cname1" + tempId).hide();
						$("#cnature1" + tempId).hide();
						$("#cagreement1" + tempId).hide();

						$("#cname" + tempId).fadeIn();
						$("#cnature" + tempId).fadeIn();
						$("#cagreement" + tempId).fadeIn();

						submitEdit(cid, userid, cname, cnature, cagreement);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#cname1" + tempId).children().val($("#cname"
								+ tempId).html());
						$("#cnature1" + tempId).children().val($("#cnature"
								+ tempId).html());
						$("#cagreement1" + tempId).children()
								.val($("#cagreement" + tempId).html());

						$("#cname1" + tempId).hide();
						$("#cnature1" + tempId).hide();
						$("#cagreement1" + tempId).hide();

						$("#cname" + tempId).fadeIn();
						$("#cnature" + tempId).fadeIn();
						$("#cagreement" + tempId).fadeIn();
					}
				}

			});
		}

		$("#deleteedit" + tempId).click(function() {
			var cid = tempId;
			$("#" + tempId).hide(100);
			if (confirm("您确定提交吗？")) {
				submitdelete(cid);

			} else {
				$("#" + tempId).fadeIn(100);
			}

		});

	});
}

function submitEdit(cid, userid, cname, cnature, cagreement) {

	cname = encodeURI(encodeURI(cname));
	cnature = encodeURI(encodeURI(cnature));
	cagreement = encodeURI(encodeURI(cagreement));
	$.ajax({
		type : "post",
		url : "updateContract.do?method=updateContract",
		data : "cid=" + cid + "&userid=" + userid + "&cname=" + cname
				+ "&cnature=" + cnature + "&cagreement=" + cagreement,

		success : function(data) {
			alert("更新成功");
		}
	});
}

function submitdelete(cid) {

	$.ajax({
		type : "post",
		url : "deleteContract.do?method=deleteContract",
		data : "cid=" + cid,

		success : function(data) {
			alert("删除成功");
		}
	});
}
