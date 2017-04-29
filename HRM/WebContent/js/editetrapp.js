$(document).ready(function() {
			findTr();
		})
function findTr() {
	var tempTr = $("#data").find("tr");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");

		$("#trf1" + tempId).hide();
		$("#fzr1" + tempId).hide();
		$("#trmark1" + tempId).hide();

		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");

					$("#trf" + tempId).hide();
					$("#fzr" + tempId).hide();
					$("#trmark" + tempId).hide();

					$("#trf1" + tempId).fadeIn();
					$("#fzr1" + tempId).fadeIn();
					$("#trmark1" + tempId).fadeIn();
				}
				if (storeId == "1") {
					if (confirm("您确定提交吗？")) {
						$("#storeEdit" + tempId).val("0");
						var taid = tempId;
						var userid = $("#userid" + tempId).children().val();
						var trf = $("#trf1" + tempId).val();
//						var trmark = $("#trmark1" + tempId).children().val();
						var trmark= $("input[name='mark']:checked").val();

						var trmark2;
						if(trmark=="1"){
							trmark2="处理通过";
							
						}else{
							trmark2="未处理";
						}
						
						var trf1 =$("#trf" + tempId).html();
						
						if (trf == "") {
							alert("培训方向不能为空！！");
							$("#trf1" + tempId).css("background",
									"#B7E1FA");
							$("INPUT").keypress(function() {
								$("#trf1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;

						}

						$("#trf" + tempId).html(trf1);
						$("#trmark" + tempId).html(trmark2);

						$("#trf1" + tempId).hide();
						$("#trmark1" + tempId).hide();

						$("#trf" + tempId).fadeIn();
						$("#trmark" + tempId).fadeIn();

						submitEdit(taid, userid, trf, trmark);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#trf1" + tempId).children().val($("#trf"
								+ tempId).html());
						$("#trmark1" + tempId).children()
								.val($("#trmark" + tempId).html());

						$("#trf1" + tempId).hide();
						$("#trmark1" + tempId).hide();

						$("#trf" + tempId).fadeIn();
						$("#trmark" + tempId).fadeIn();
					}
				}

			});
		}

		$("#deleteedit" + tempId).click(function() {
					var taid = tempId;
					$("#" + tempId).hide(100);
					if (confirm("您确定提交吗？")) {
						submitdelete(taid);

					} else {
						$("#" + tempId).fadeIn(100);
					}

				});

	});
}

function submitEdit(taid, userid, trf, trmark) {

	trf = encodeURI(encodeURI(trf));
	trmark = encodeURI(encodeURI(trmark));
	$.ajax({
				type : "post",
				url : "TrainingMangment.do?method=EditApproval",
				data : "taid=" + taid + "&userid=" + userid + "&trf=" + trf
						+  "&trmark=" + trmark,

				success : function(data) {
					alert("更新成功");
				}
			});
}

function submitdelete(taid) {

	$.ajax({
				type : "post",
				url : "TrainingMangment.do?method=DelApproval",
				data : "taid=" + taid,

				success : function(data) {
					alert("删除成功");
				}
			});
}
