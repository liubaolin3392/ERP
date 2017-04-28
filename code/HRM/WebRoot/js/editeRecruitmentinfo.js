$(document).ready(function() {
	findTr();
})
function findTr() {
	var tempTr = $("#data").find("TR");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#rname1" + tempId).hide();
		$("#department1" + tempId).hide();
		$("#rest1" + tempId).hide();
		$("#rers1" + tempId).hide();
		$("#reut1" + tempId).hide();
		$("#content1" + tempId).hide();
		$("#rept1" + tempId).hide();

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");

					$("#rname" + tempId).hide();
					$("#department" + tempId).hide();
					$("#rest" + tempId).hide();
					$("#rers" + tempId).hide();
					$("#reut" + tempId).hide();
					$("#content" + tempId).hide();

					$("#rname1" + tempId).fadeIn();
					$("#department1" + tempId).fadeIn();
					$("#rest1" + tempId).fadeIn();
					$("#rers1" + tempId).fadeIn();
					$("#reut1" + tempId).fadeIn();
					$("#content1" + tempId).fadeIn();

				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var riid = tempId;
						var rname = $("#rname1" + tempId).children().val();
						var department = $("#department1" + tempId).children()
								.val();
						var rest = $("#rest1" + tempId).children().val();

						var rers = $("#rers1" + tempId).children().val();
						var reut = $("#reut1" + tempId).children().val();

						var rept = $("#rept1" + tempId).children().val();

						var content = $("#content1" + tempId).children().val();

						if (rname == "") {
							alert("请填写招聘名称！！");
							$("#rname1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#rname1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}

						if (department == "") {
							alert("请填写适合的招聘部门！！");
							$("#department1" + tempId).css("background", "#B7E1FA");
							$("SELECT").keypress(function() {
								$("#department1" + tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (rers == "") {
							alert("请填写欲招聘的人数！！");
							$("#rers1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#rers1" + tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						if (rest == "") {
							alert("请填写招聘开始时间！！");
							$("#dateDemo").css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#dateDemo").css("background", "#FFFFFF");
							});
							return false;
						}
						if (reut == "") {
							alert("请填写招聘结束时间！！");
							$("#dateDemo1").css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#dateDemo1").css("background", "#FFFFFF");
							});
							return false;
						}

						if (content == "") {
							alert("请填写招聘内容！！");
							$("#content1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#content1" + tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (rers.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#rers1" + tempId).val("");
							$("#rers1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#rers1" + tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						$("#rname" + tempId).html(rname);
						$("#department" + tempId).html(department);
						$("#rest" + tempId).html(rest);
						$("#rers" + tempId).html(rers);
						$("#reut" + tempId).html(reut);
						$("#content" + tempId).html(content);

						$("#rname1" + tempId).hide();
						$("#department1" + tempId).hide();
						$("#rest1" + tempId).hide();
						$("#rers1" + tempId).hide();
						$("#reut1" + tempId).hide();
						$("#content1" + tempId).hide();

						$("#rname" + tempId).fadeIn();
						$("#department" + tempId).fadeIn();
						$("#rest" + tempId).fadeIn();
						$("#rers" + tempId).fadeIn();
						$("#reut" + tempId).fadeIn();
						$("#content" + tempId).fadeIn();

						submitEdit(riid, rname, department, rest, rers, reut,
								content, rept);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#rname1" + tempId).children().val($("#rname"
								+ tempId).html());
						$("#department1" + tempId).children()
								.val($("#department" + tempId).html());
						$("#rest1" + tempId).children().val($("#rest" + tempId)
								.html());
						$("#rers1" + tempId).children().val($("#rers" + tempId)
								.html());
						$("#reut1" + tempId).children().val($("#reut" + tempId)
								.html());
						$("#content1" + tempId).children().val($("#contnet"
								+ tempId).html());

						$("#rname1" + tempId).hide();
						$("#department1" + tempId).hide();
						$("#rest1" + tempId).hide();
						$("#rers1" + tempId).hide();
						$("#reut1" + tempId).hide();
						$("#content1" + tempId).hide();

						$("#rname" + tempId).fadeIn();
						$("#department" + tempId).fadeIn();
						$("#rest" + tempId).fadeIn();
						$("#rers" + tempId).fadeIn();
						$("#reut" + tempId).fadeIn();
						$("#content" + tempId).fadeIn();

					}
				}

			});
		}

		$("#deleteedit" + tempId).click(function() {
			var riid = tempId;
			$("#" + tempId).hide(100);
			if (confirm("您确定提交吗？")) {
				submitdelete(riid);

			} else {
				$("#" + tempId).fadeIn(100);
			}

		});

	});
}

function submitEdit(riid, rname, department, rest, rers, reut, content, rept) {

	rname = encodeURI(encodeURI(rname));
	department = encodeURI(encodeURI(department));
	content = encodeURI(encodeURI(content));
	$.ajax({
		type : "post",
		url : "updateRecruitmentinfo.do?method=updateRecruitmentinfo",
		data : "riid=" + riid + "&rname=" + rname + "&department=" + department
				+ "&rest=" + rest + "&rers=" + rers + "&reut=" + reut
				+ "&content=" + content + "&rept=" + rept,

		success : function(data) {
			alert("更新成功");
		}
	});
}

function submitdelete(riid) {

	$.ajax({
		type : "post",
		url : "deleteRecruitmentinfo.do?method=deleteRecruitmentinfo",
		data : "riid=" + riid,

		success : function(data) {
			alert("删除成功");
		}
	});
}
