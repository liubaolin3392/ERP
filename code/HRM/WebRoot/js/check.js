$(document).ready(function() {
	$("#demo").fadeOut(2000);
	$("#test").hide();
	//	这个是添加反馈的
	$("#Submit").click(function() {
		var username = $("#username").val();
		var password = $("#password").val();
		var level = $("#level").val();
		if (username == "") {
			alert("用户名不能为空！！");
			return false;
		}
		if (password == "") {
			alert("密码不能为空！！");
			return false;
		}
		if (level == "") {
			alert("用户权限不能为空！！");
			return false;
		}
	});
	$("#cs").click(function() {
		$("#username").val("");
		$("#password").val("");
		$("#level").val("");

	});
	$("#regitUser").click(function() {
		var username = $("#regitusername").val();
		var password = $("#regitpassword").val();
		var age = $("#regitage").val();
		var phone = $("#regitphone").val();

		if (username == "") {
			alert("请输入用户名！！");

			$("#regitusername").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#regitusername").css("background", "#FFFFFF");
			});
			return false;
		}
		if (password == "") {
			alert("密码不能为空！！");
			$("#regitpassword").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#regitpassword").css("background", "#FFFFFF");
			});
			return false;
		}
		if (age == "") {
			alert("年龄不能为空！！");
			return false;
		}
		if (phone == "") {
			alert("电话不能为空！！");
			return false;
		}

		if (age.search("^-?\\d+$") != 0) {
			alert("请输入正确的年龄格式！！");
			$("#regitage").val("");
			$("#regitage").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#regitage").css("background", "#FFFFFF");
			});
			return false;
		}
		if (phone.search("^-?\\d+$") != 0) {
			alert("请输入正确的电话格式！！");
			$("#regitphone").val("");
			$("#regitphone").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#regitphone").css("background", "#FFFFFF");
			});
			return false;
		}

	});
	$("#addContract").click(function() {
		var username = $("#username").val();
		var cname = $("#cname").val();
		var cnature = $("#cnature").val();
		var cagreement = $("#cagreement").val();
		var ctime=$("#dateDemo").val();
		var cend = $("#cend").val();
		if (username == "") {
			alert("姓名不能为空！！");
			$("#username").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#username").css("background", "#FFFFFF");
			});
			return false;
		}
		if (cend == "") {
			alert("有效期不能为空！！");
			$("#cend").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#cend").css("background", "#FFFFFF");
			});
			return false;
		}
			if (ctime == "") {
			alert("请选择签约时间");
			$("#dateDemo").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#dateDemo").css("background", "#FFFFFF");
			});
			return false;
		}

		if (cname == "") {
			alert("合同名称不能为空！！");
			$("#cname").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#cname").css("background", "#FFFFFF");
			});
			return false;
		}
		if (cnature == "") {
			alert("合同性质不能为空！！");
			$("#cnature").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#cnature").css("background", "#FFFFFF");
			});
			return false;
		}
		if (cagreement == "") {
			alert("合同内容不能为空！！");
			$("#cagreement").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#cagreement").css("background", "#FFFFFF");
			});
			return false;
		}
		if (cend.search("^-?\\d+$") != 0) {
			alert("请输入正确的数字格式！！");
			$("#cend").val("");
			$("#cend").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#cend").css("background", "#FFFFFF");
			});
			return false;
		}

	});

	$("#addnotice").click(function() {
		var nname = $("#nname").val();
		var ncontent = $("#ncontent").val();

		if (nname == "") {
			alert("公告名称不能为空！！");
			$("#nname").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#nname").css("background", "#FFFFFF");
			});
			return false;
		}

		if (ncontent == "") {
			alert("公告内容不能为空！！");
			$("#ncontent").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#ncontent").css("background", "#FFFFFF");
			});
			return false;
		}

	});

	$("#addsalary").click(function() {
		var username = $("#username").val();
		var bwage = $("#bwage").val();
		var housefund = $("#housefund").val();
		var pension = $("#pension").val();
		var health = $("#health").val();
		var unemployment = $("#unemployment").val();
		var reimbursement = $("#reimbursement").val();
		var paword = $("#paword").val();

		if (username == "") {
			alert("员工姓名不能为空！！");
			$("#username").css("background", "#B7E1FA");
			$("SELECT").keypress(function() {
				$("#username").css("background", "#FFFFFF");
			});
			return false;
		}

		if (bwage == "") {
			alert("基本工资不能为空！！");
			$("#bwage").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#bwage").css("background", "#FFFFFF");
			});
			return false;
		}

		if (housefund == "") {
			alert("住房公积金不能为空！！");
			$("#housefund").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#housefund").css("background", "#FFFFFF");
			});
			return false;
		}

		if (pension == "") {
			alert("养老保险不能为空！！");
			$("#pension").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#pension").css("background", "#FFFFFF");
			});
			return false;
		}

		if (health == "") {
			alert("医疗保险不能为空！！");
			$("#health").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#health").css("background", "#FFFFFF");
			});
			return false;
		}

		if (unemployment == "") {
			alert("失业保险不能为空！！");
			$("#unemployment").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#unemployment").css("background", "#FFFFFF");
			});
			return false;
		}

		if (reimbursement == "") {
			alert("报销不能为空,或填0！！");
			$("#reimbursement").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#reimbursement").css("background", "#FFFFFF");
			});
			return false;
		}

		if (paword == "") {
			alert("业绩奖不能为空！！");
			$("#paword").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#paword").css("background", "#FFFFFF");
			});
			return false;
		}
		if (bwage.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#bwage").val("");
			$("#bwage").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#bwage").css("background", "#FFFFFF");
			});
			return false;
		}
		if (housefund.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#housefund").val("");
			$("#housefund").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#housefund").css("background", "#FFFFFF");
			});
			return false;
		}
		if (pension.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#pension").val("");
			$("#pension").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#pension").css("background", "#FFFFFF");
			});
			return false;
		}
		if (health.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#health").val("");
			$("#health").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#health").css("background", "#FFFFFF");
			});
			return false;
		}
		if (unemployment.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#unemployment").val("");
			$("#unemployment").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#unemployment").css("background", "#FFFFFF");
			});
			return false;
		}
		if (reimbursement.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#reimbursement").val("");
			$("#reimbursement").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#reimbursement").css("background", "#FFFFFF");
			});
			return false;
		}
		if (paword.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#paword").val("");
			$("#paword").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#paword").css("background", "#FFFFFF");
			});
			return false;
		}

	});

	$("#addrec").click(function() {
		var rname = $("#rname").val();
		var department = $("#department").val();
		var rers = $("#rers").val();
		var dateDemo = $("#dateDemo").val();
		var dateDemo1 = $("#dateDemo1").val();
		var content = $("#content").val();

		if (rname == "") {
			alert("请填写招聘名称！！");
			$("#rname").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#rname").css("background", "#FFFFFF");
			});
			return false;
		}

		if (department == "") {
			alert("请填写适合的招聘部门！！");
			$("#department").css("background", "#B7E1FA");
			$("SELECT").keypress(function() {
				$("#department").css("background", "#FFFFFF");
			});
			return false;
		}
		if (rers == "") {
			alert("请填写欲招聘的人数！！");
			$("#rers").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#rers").css("background", "#FFFFFF");
			});
			return false;
		}

		if (dateDemo == "") {
			alert("请填写招聘开始时间！！");
			$("#dateDemo").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#dateDemo").css("background", "#FFFFFF");
			});
			return false;
		}
		if (dateDemo1 == "") {
			alert("请填写招聘结束时间！！");
			$("#dateDemo1").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#dateDemo1").css("background", "#FFFFFF");
			});
			return false;
		}

		if (content == "") {
			alert("请填写招聘内容！！");
			$("#content").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#content").css("background", "#FFFFFF");
			});
			return false;
		}
		if (rers.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#rers").val("");
			$("#rers").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#rers").css("background", "#FFFFFF");
			});
			return false;
		}

	});

	$("#addcan").click(function() {
		var caname = $("#caname").val();
		var department = $("#department").val();
		var position = $("#position").val();
		var catel = $("#catel").val();
		var cainfo = $("#cainfo").val();

		if (caname == "") {
			alert("请填写应聘人姓名！！");
			$("#caname").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#caname").css("background", "#FFFFFF");
			});
			return false;
		}

		if (department == "") {
			alert("请填写应聘部门！！");
			$("#department").css("background", "#B7E1FA");
			$("SELECT").keypress(function() {
				$("#department").css("background", "#FFFFFF");
			});
			return false;
		}
		if (position == "") {
			alert("请填写应聘职务！！");
			$("#position").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#position").css("background", "#FFFFFF");
			});
			return false;
		}

		if (catel == "") {
			alert("请填写应聘人联系方式！！");
			$("#catel").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#catel").css("background", "#FFFFFF");
			});
			return false;
		}
		if (cainfo == "") {
			alert("请填写应聘人信息！！");
			$("#cainfo").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#cainfo").css("background", "#FFFFFF");
			});
			return false;
		}
		if (catel.search("^-?\\d+$") != 0) {
			alert("请输入整数格式！！");
			$("#catel").val("");
			$("#catel").css("background", "#B7E1FA");
			$("INPUT").keypress(function() {
				$("#catel").css("background", "#FFFFFF");
			});
			return false;
		}

	});
	
	$("#addeva").click(function(){
		
		var trafb = $("#trafb").val();
		if(trafb==""){
			alert("请添加培训反馈");
			return false;
		}else{
			$("#testtd").val(trafb);
			$("#test").fadeIn();
		}
		
				
	});

});