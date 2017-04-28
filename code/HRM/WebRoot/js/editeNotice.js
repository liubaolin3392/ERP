$(document).ready(function() {
	findTr();
});
function findTr() {
	var tempTr = $("#data").find("TR");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#userid1" + tempId).hide();
		$("#nname1" + tempId).hide();
		$("#ncontent1" + tempId).hide();

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");
					$("#nname" + tempId).hide();
					$("#ncontent" + tempId).hide();

					$("#nname1" + tempId).fadeIn();
					$("#ncontent1" + tempId).fadeIn();
				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var nid = tempId;
						var userid = $("#userid1" + tempId).children().val();
						var nname = $("#nname1" + tempId).children().val();
						var ncontent = $("#ncontent1" + tempId).children()
								.val();

						if (nname == "") {
							alert("公告名称不能为空！！");
							$("#nname1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#nname1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}

						if (ncontent == "") {
							alert("公告内容不能为空！！");
							$("#ncontent1" + tempId).css("background",
									"#B7E1FA");
							$("INPUT").keypress(function() {
								$("#ncontent1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}

						$("#nname" + tempId).html(nname);
						$("#ncontent" + tempId).html(ncontent);

						$("#nname1" + tempId).hide();
						$("#ncontent1" + tempId).hide();

						$("#nname" + tempId).fadeIn();
						$("#ncontent" + tempId).fadeIn();

						submitEdit(nid, userid, nname, ncontent);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#nname1" + tempId).children().val($("#nname"
								+ tempId).html());
						$("#ncontent1" + tempId).children().val($("#ncontent"
								+ tempId).html());

						$("#nname1" + tempId).hide();
						$("#ncontent1" + tempId).hide();

						$("#nname" + tempId).fadeIn();
						$("#ncontent" + tempId).fadeIn();
					}
				}

			});
		}

		$("#deleteedit" + tempId).click(function() {
			var nid = tempId;
			$("#" + tempId).hide(100);
			if (confirm("您确定提交吗？")) {

				submitdelete(nid);

			} else {
				$("#" + tempId).fadeIn(100);
			}

		});

	});
}

function submitEdit(nid, userid, nname, ncontent) {
	nname = encodeURI(encodeURI(nname));
	ncontent = encodeURI(encodeURI(ncontent));
	$.ajax({
		type : "post",
		url : "updateNotice.do?method=updateNotice",
		data : "nid=" + nid + "&userid=" + userid + "&nname=" + nname
				+ "&ncontent=" + ncontent,

		success : function(data) {
			alert("更新成功");
		}
	});
}
function submitdelete(nid) {
	$.ajax({
		type : "post",
		url : "deleteNotice.do?method=deleteNotice",
		data : "nid=" + nid,

		success : function(data) {
			alert("删除成功！！！");
		}
	});
}
