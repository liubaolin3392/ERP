$(document).ready(function() {
	findTr();
});
function findTr() {
	var tempTr = $("#data").find("TR");
	$(tempTr).each(function(i) {
		var tempId = $(this).attr("id");
		$("#eid").hide();
		$("#userId1" + tempId).hide();
		$("#userName1" + tempId).hide();
		$("#password1" + tempId).hide();
		$("#age1" + tempId).hide();
		$("#department1" + tempId).hide();
		$("#sex1" + tempId).hide();
		$("#position1" + tempId).hide();
		$("#phone1" + tempId).hide();
		$("#userLevel1" + tempId).hide();
		if (tempId != "-1000") {
			$("#edit" + tempId).click(function() {
				var storeId = $("#storeEdit" + tempId).val();
				if (storeId == "0") {
					$("#storeEdit" + tempId).val("1");
					$("#userName" + tempId).hide();
					$("#password" + tempId).hide();
					$("#age" + tempId).hide();
					$("#sex" + tempId).hide();
					$("#position" + tempId).hide();
					$("#phone" + tempId).hide();

					$("#userName1" + tempId).fadeIn();
					$("#password1" + tempId).fadeIn();
					$("#age1" + tempId).fadeIn();
					$("#sex1" + tempId).fadeIn();
					$("#position1" + tempId).fadeIn();
					$("#phone1" + tempId).fadeIn();
				}
				if (storeId == "1") {
					if (confirm("您确认提交吗?")) {
						$("#storeEdit" + tempId).val("0");
						var eid = $("#eid").html();
						var userId = tempId;
						var userName = $("#userName1" + tempId).children()
								.val();
						var password = $("#password1" + tempId).children()
								.val();

						var age = $("#age1" + tempId).children().val();
						var department = $("#department1" + tempId).children()
								.val();

						var sex = $("#sex1" + tempId).children().val();
						var position = $("#position1" + tempId).children()
								.val();
						var phone = $("#phone1" + tempId).children().val();
						var userLevel = $("#userLevel1" + tempId).children().val();

						if (userName == "") {
							alert("姓名不能为空!!!");
							$("#userName1" + tempId).css("background",
									"#B7E1FA");
							$("INPUT").keypress(function() {
								$("#userName1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;

						}
						if (password == "") {
							alert("密码不能为空!!");
							$("#password1" + tempId).css("background",
									"#B7E1FA");
							$("INPUT").keypress(function() {
								$("#password1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}
						if (age == "") {
							alert("年龄不能为空!!");
							$("#age1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#age1" + tempId)
										.css("background", "#FFFFFF");
							});
							return false;
						}
						if (sex == "") {
							alert("性别不能为空");
							$("#sex1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#sex1" + tempId)
										.css("background", "#FFFFFF");
							});
							return false;
						}
						if (position == "") {
							alert("职务不能为空!!");
							$("#position1" + tempId).css("background",
									"#B7E1FA");
							$("INPUT").keypress(function() {
								$("#position1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}
						if (phone == "") {
							alert("电话不能为空!!");
							$("#phone1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#phone1" + tempId)
										.css("background", "#FFFFFF");
							});
							return false;
						}
						if (userLevel == "") {
							alert("权限不能为空");
							$("#userLevel1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#userLevel1" + tempId).css("background",
										"#FFFFFF");
							});
							return false;
						}

						if (age.search("^-?\\d+$") != 0) {
							alert("请输入正确的年龄格式!!");
							$("#age1" + tempId).val("");
							$("#age1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#age1" + tempId)
										.css("background", "#FFFFFF");
							});
							return false;
						}
						if (phone.search("^-?\\d+$") != 0) {
							alert("请输入正确的电话号码!!");
							$("#phone1" + tempId).val("");
							$("#phone1" + tempId).css("background", "#B7E1FA");
							$("INPUT").keypress(function() {
								$("#phone1" + tempId)
										.css("background", "#FFFFFF");
							});
							return false;
						}

						$("#userName" + tempId).html(userName);
						$("#password" + tempId).html(password);
						$("#age" + tempId).html(age);
						$("#sex" + tempId).html(sex);
						$("#position" + tempId).html(position);
						$("#phone" + tempId).html(phone);

						$("#userName1" + tempId).hide();
						$("#password1" + tempId).hide();
						$("#age1" + tempId).hide();
						$("#sex1" + tempId).hide();
						$("#position1" + tempId).hide();
						$("#phone1" + tempId).hide();

						$("#userName" + tempId).fadeIn();
						$("#password" + tempId).fadeIn();
						$("#age" + tempId).fadeIn();
						$("#sex" + tempId).fadeIn();
						$("#position" + tempId).fadeIn();
						$("#phone" + tempId).fadeIn();

						submitEdit(userId, userName, password, age, department,
								sex, position, phone, userLevel,eid);

					} else {
						$("#storeEdit" + tempId).val("0");
						$("#userName1" + tempId).children().val($("#userName"
								+ tempId).html());
						$("#password1" + tempId).children().val($("#password"
								+ tempId).html());
						$("#age1" + tempId).children().val($("#age" + tempId)
								.html());
						$("#sex1" + tempId).children().val($("#sex" + tempId)
								.html());
						$("#position1" + tempId).children().val($("#position"
								+ tempId).html());
						$("#phone1" + tempId).children().val($("#phone" + tempId)
								.html());
						$("#userLevel1" + tempId).children().val($("#userLevel"
								+ tempId).html());

						$("#userName1" + tempId).hide();
						$("#password1" + tempId).hide();
						$("#age1" + tempId).hide();
						$("#sex1" + tempId).hide();
						$("#position1" + tempId).hide();
						$("#phone1" + tempId).hide();

						$("#userName" + tempId).fadeIn();
						$("#password" + tempId).fadeIn();
						$("#age" + tempId).fadeIn();
						$("#sex" + tempId).fadeIn();
						$("#position" + tempId).fadeIn();
						$("#phone" + tempId).fadeIn();
					}
				}

			});
		}
		$("#deleteedit" + tempId).click(function() {
			var userId = tempId;
			$("#" + tempId).hide(100);
			if (confirm("您确定删除此用户吗,会级联删除!!")) {

				submitdelete(userId);

			} else {
				$("#" + tempId).fadeIn(100);
			}

		});

	});
}


function submitEdit(userId, userName, password, age, department, sex, position,
		phone, userLevel,eid) {
	
	debugger;
	
	$.post("employee_updateEmployee.action",{"employee.userName":userName,"employee.password":password,"employee.sex":sex,"employee.department":department,"employee.position":position
		,"employee.phone":phone,"employee.userLevel":userLevel,"employee.age":age,"employee.userId":userId,"employee.eid":eid},function(data)
		{
			data=eval(data);
			if(data == "ok"){
				alert("更新成功！");
			}else{
				alert("更新...");
			}	
		});
}

function submitdelete(userId) {
	$.ajax({
		type : "post",
		url : "deleteInformation.do?method=deleteInformation",
		data : "userId=" + userId,

		success : function(data) {
			alert("删除成功！！！");
		}
	});
}
