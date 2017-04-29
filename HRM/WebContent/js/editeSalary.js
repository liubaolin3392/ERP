$(document).ready(function() {
	findTr();
})
function findTr() {
	var tempTr = $("#data").find("TR");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#sid1" + tempId).hide();
		$("#userid1" + tempId).hide();
		$("#bwage1" + tempId).hide();
		$("#housefund1" + tempId).hide();
		$("#pension1" + tempId).hide();
		$("#health1" + tempId).hide();
		$("#unemployment1" + tempId).hide();
		$("#reimbursement1" + tempId).hide();
		$("#paword1" + tempId).hide();

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");
					$("#bwage" + tempId).hide();
					$("#housefund" + tempId).hide();
					$("#pension" + tempId).hide();
					$("#health" + tempId).hide();
					$("#unemployment" + tempId).hide();
					$("#reimbursement" + tempId).hide();
					$("#paword" + tempId).hide();

					$("#bwage1" + tempId).fadeIn();
					$("#housefund1" + tempId).fadeIn();
					$("#pension1" + tempId).fadeIn();
					$("#health1" + tempId).fadeIn();
					$("#unemployment1" + tempId).fadeIn();
					$("#reimbursement1" + tempId).fadeIn();
					$("#paword1" + tempId).fadeIn();
				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var sid = tempId;
						var userid = $("#userid1" + tempId).children().val();
						var bwage = $("#bwage1" + tempId).children().val();
						var housefund = $("#housefund1" + tempId).children()
								.val();
						var pension = $("#pension1" + tempId).children().val();
						var health = $("#health1" + tempId).children().val();
						var unemployment = $("#unemployment1" + tempId)
								.children().val();
						var reimbursement = $("#reimbursement1" + tempId)
								.children().val();
						var paword = $("#paword1" + tempId).children().val();

						if (bwage == "") {
							alert("基本工资不能为空！！");
							$("#bwage1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#bwage1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						if (housefund == "") {
							alert("住房公积金不能为空！！");
							$("#housefund1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#housefund1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						if (pension == "") {
							alert("养老保险不能为空！！");
							$("#pension1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#pension1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						if (health == "") {
							alert("医疗保险不能为空！！");
							$("#health1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#health1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						if (unemployment == "") {
							alert("失业保险不能为空！！");
							$("#unemployment1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#unemployment1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						if (reimbursement == "") {
							alert("报销不能为空,或填0！！");
							$("#reimbursement1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#reimbursement1"+tempId)
										.css("background", "#FFFFFF");
							});
							return false;
						}

						if (paword == "") {
							alert("业绩奖不能为空！！");
							$("#paword1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#paword1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (bwage.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#bwage1"+tempId).val("");
							$("#bwage1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#bwage1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (housefund.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#housefund1"+tempId).val("");
							$("#housefund1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#housefund1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (pension.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#pension1"+tempId).val("");
							$("#pension1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#pension1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (health.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#health1"+tempId).val("");
							$("#health1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#health1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (unemployment.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#unemployment1"+tempId).val("");
							$("#unemployment1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#unemployment1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}
						if (reimbursement.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#reimbursement1"+tempId).val("");
							$("#reimbursement1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#reimbursement1"+tempId)
										.css("background", "#FFFFFF");
							});
							return false;
						}
						if (paword.search("^-?\\d+$") != 0) {
							alert("请输入整数格式！！");
							$("#paword1"+tempId).val("");
							$("#paword1"+tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#paword1"+tempId).css("background", "#FFFFFF");
							});
							return false;
						}

						$("#bwage" + tempId).html(bwage);
						$("#housefund" + tempId).html(housefund);
						$("#pension" + tempId).html(pension);
						$("#health" + tempId).html(health);
						$("#unemployment" + tempId).html(unemployment);
						$("#reimbursement" + tempId).html(reimbursement);
						$("#paword" + tempId).html(paword);

						$("#bwage1" + tempId).hide();
						$("#housefund1" + tempId).hide();
						$("#pension1" + tempId).hide();
						$("#health1" + tempId).hide();
						$("#unemployment1" + tempId).hide();
						$("#reimbursement1" + tempId).hide();
						$("#paword1" + tempId).hide();

						$("#bwage" + tempId).fadeIn();
						$("#housefund" + tempId).fadeIn();
						$("#pension" + tempId).fadeIn();
						$("#health" + tempId).fadeIn();
						$("#unemployment" + tempId).fadeIn();
						$("#reimbursement" + tempId).fadeIn();
						$("#paword" + tempId).fadeIn();

						submitEdit(sid, userid, bwage, housefund, pension,
								health, unemployment, reimbursement, paword);

					} else {
						$("#storeEdit" + tempId).val("0");

						$("#bwage1" + tempId).children().val($("#bwage"
								+ tempId).html());
						$("#housefund1" + tempId).children().val($("#housefund"
								+ tempId).html());
						$("#pension1" + tempId).children().val($("#pension"
								+ tempId).html());
						$("#health1" + tempId).children().val($("#health"
								+ tempId).html());
						$("#unemployment1" + tempId).children()
								.val($("#unemployment" + tempId).html());
						$("#reimbursement1" + tempId).children()
								.val($("#reimbursement" + tempId).html());
						$("#paword1" + tempId).children().val($("#paword"
								+ tempId).html());

						$("#bwage1" + tempId).hide();
						$("#housefund1" + tempId).hide();
						$("#pension1" + tempId).hide();
						$("#health1" + tempId).hide();
						$("#unemployment1" + tempId).hide();
						$("#reimbursement1" + tempId).hide();
						$("#paword1" + tempId).hide();

						$("#bwage" + tempId).fadeIn();
						$("#housefund" + tempId).fadeIn();
						$("#pension" + tempId).fadeIn();
						$("#health" + tempId).fadeIn();
						$("#unemployment" + tempId).fadeIn();
						$("#reimbursement" + tempId).fadeIn();
						$("#paword" + tempId).fadeIn();
					}
				}

			});
			$("#delete" + tempId).click(function() {
				var sid = tempId;
				$("#" + tempId).hide(100);
				if (confirm("您确定提交吗？")) {
					submitdelete(sid);

				} else {
					$("#" + tempId).fadeIn(100);
				}
			});
		}

	});
}

function submitdelete(sid) {

	$.ajax({
		type : "post",
		url : "deleteSalary.do?method=deleteSalary",
		data : "sid=" + sid,

		success : function(data) {
			alert("删除成功");
		}
	});
}
function submitEdit(sid, userid, bwage, housefund, pension, health,
		unemployment, reimbursement, paword) {

	$.ajax({
		type : "post",
		url : "updateSalary.do?method=updateSalary",
		data : "sid=" + sid + "&userid=" + userid + "&bwage=" + bwage
				+ "&housefund=" + housefund + "&pension=" + pension
				+ "&health=" + health + "&unemployment=" + unemployment
				+ "&reimbursement=" + reimbursement + "&paword=" + paword,

		success : function(data) {
			alert("更新成功");
		}
	});

}
