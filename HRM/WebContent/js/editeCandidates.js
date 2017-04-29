$(document).ready(function() {
	findTr();
});
function findTr() {
	var tempTr = $("#data").find("TR");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#caname1" + tempId).hide();
		$("#department1" + tempId).hide();
		$("#position1" + tempId).hide();
		$("#catel1" + tempId).hide();
		$("#cainfo1" + tempId).hide();
		$("#camark1" + tempId).hide();

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");

					$("#caname" + tempId).hide();
					$("#department" + tempId).hide();
					$("#position" + tempId).hide();
					$("#catel" + tempId).hide();
					$("#cainfo" + tempId).hide();
					$("#camark" + tempId).hide();

					$("#caname1" + tempId).fadeIn();
					$("#department1" + tempId).fadeIn();
					$("#position1" + tempId).fadeIn();
					$("#catel1" + tempId).fadeIn();
					$("#cainfo1" + tempId).fadeIn();
					$("#camark1" + tempId).fadeIn();
				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var caid = tempId;
						var caname = $("#caname1" + tempId).children().val();
						var department = $("#department1" + tempId).children()
								.val();
						var position = $("#position1" + tempId).children()
								.val();
						var catel = $("#catel1" + tempId).children().val();
						var cainfo = $("#cainfo1" + tempId).children().val();
						var camark = $("#camark1" + tempId).val();

						if (caname == "") {
							alert("请填写应聘人姓名！！");
							$("#caname1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#caname1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						if (department == "") {
							alert("请填写应聘部门！！");
							$("#department1"+tempId).css("background", "#B7E1FA");
							$("SELECT").keypress(function() {
								$("#department1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (position == "") {
							alert("请填写应聘职务！！");
							$("#position1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#position1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						if (catel == "") {
							alert("请填写应聘人联系方式！！");
							$("#catel1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#catel1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (cainfo == "") {
							alert("请填写应聘人信息！！");
							$("#cainfo1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#cainfo1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (camark == "") {
							alert("请填写应聘人状态！！");
							$("#camark1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#camark1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (catel.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#catel1"+tempId).val("");
							$("#catel1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#catel1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						$("#caname" + tempId).html(caname);
						$("#department" + tempId).html(department);
						$("#position" + tempId).html(position);
						$("#catel" + tempId).html(catel);
						$("#cainfo" + tempId).html(cainfo);
						$("#camark" + tempId).html(camark);

						$("#caname1" + tempId).hide();
						$("#department1" + tempId).hide();
						$("#position1" + tempId).hide();
						$("#catel1" + tempId).hide();
						$("#cainfo1" + tempId).hide();
						$("#camark1" + tempId).hide();

						$("#caname" + tempId).fadeIn();
						$("#department" + tempId).fadeIn();
						$("#position" + tempId).fadeIn();
						$("#catel" + tempId).fadeIn();
						$("#cainfo" + tempId).fadeIn();
						$("#camark" + tempId).fadeIn();
						alert(camark);

						submitEdit(caid, caname, department, position, catel,
								cainfo, camark);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#caname1" + tempId).children().val($("#caname"
								+ tempId).html());
						$("#department1" + tempId).children()
								.val($("#department" + tempId).html());
						$("#position1" + tempId).children().val($("#position"
								+ tempId).html());
						$("#catel1" + tempId).children().val($("#catel"
								+ tempId).html());
						$("#cainfo1" + tempId).children().val($("#cainfo"
								+ tempId).html());
						$("#camark1" + tempId).children().val($("#camark"
								+ tempId).html());

						$("#caname1" + tempId).hide();
						$("#department1" + tempId).hide();
						$("#position1" + tempId).hide();
						$("#catel1" + tempId).hide();
						$("#cainfo1" + tempId).hide();
						$("#camark1" + tempId).hide();

						$("#caname" + tempId).fadeIn();
						$("#department" + tempId).fadeIn();
						$("#position" + tempId).fadeIn();
						$("#catel" + tempId).fadeIn();
						$("#cainfo" + tempId).fadeIn();
						$("#camark" + tempId).fadeIn();

					}
				}

			});
		}

		$("#deleteedit" + tempId).click(function() {
			var caid = tempId;
			$("#" + tempId).hide(100);
			if (confirm("您确定提交吗？")) {
				submitdelete(caid);

			} else {
				$("#" + tempId).fadeIn(100);
			}

		});

	});
}

function submitEdit(caid, caname, department, position, catel, cainfo, camark) {

	caname = encodeURI(encodeURI(caname));
	department = encodeURI(encodeURI(department));
	position = encodeURI(encodeURI(position));
	cainfo = encodeURI(encodeURI(cainfo));
	camark = encodeURI(encodeURI(camark));

	$.ajax({
		type : "post",
		url : "updateCandidates.do?method=updateCandidates",
		data : "caid=" + caid + "&caname=" + caname + "&department="
				+ department + "&position=" + position + "&catel=" + catel
				+ "&cainfo=" + cainfo + "&camark=" + camark,

		success : function(data) {
			alert("更新成功");
		}
	});
}

function submitdelete(caid) {

	$.ajax({
		type : "post",
		url : "deleteCandidates.do?method=deleteCandidates",
		data : "caid=" + caid,

		success : function(data) {
			alert("删除成功");
		}
	});
}
