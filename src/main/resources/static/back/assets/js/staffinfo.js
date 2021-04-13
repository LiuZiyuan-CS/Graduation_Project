/**
 * staffinfo页面js代码
 */

/*
 * 打开头像上传框
 */
function uploadProfile() {
	$("#profile-icon").trigger('click');
}
/*
 * 头像上传
 */
$('#profile-icon').fileupload({
	dataType : 'json',
	url : "staffProfileUpload",// 文件的后台接受地址
	// 上传完成之后的操作，显示在img里面
	done : function(e, result) {
		console.log(result);
		if (result.result.resultCode == 1) {
			$("#profileImg").attr({
				src : result.result.data
			});
		} else {
			alert(result.result.message)
		}
	}
})
$('#profile-icon').bind('fileuploadsubmit', function(e, data) {
	data.formData = {
		staffId : $("#staffId").val()
	};
	// 如果需要额外添加参数可以在这里添加
});
/*
 * 打开职员的信息模态框
 */
function updateStaff(staff) {
	console.log(staff);
	$("#profileImg").prop("src", staff.staffProfile);
	$("#staffTelephone").val(staff.staffTelephone);
	$("#staffEmail").val(staff.staffEmail);
	$('#staffAuthority').find("option[value=" + staff.staffAuthority + "]")
			.prop("selected", "selected");
	$('#staffId').val(staff.staffId);
	$("#staffTelephone").attr("readonly", "readonly");
	$("#staffEmail").attr("readonly", "readonly");
	$('#modifyBtn').attr("disabled", "disabled")
	$('#staffInfoModal').modal('show');
}
$("#staffTelephone").change(function() {
	$("#modifyBtn").removeAttr("disabled");
});
$("#staffEmail").change(function() {
	$("#modifyBtn").removeAttr("disabled");
});
/*
 * 每个内容修改函数
 */
function modify(identity) {
	switch (identity) {
	case "tel":
		$("#staffTelephone").removeAttr("readonly");
		$("#staffTelephone").focus();
		$("#staffTelephone").select();
		break;
	case "email":
		$("#staffEmail").removeAttr("readonly");
		$("#staffEmail").focus();
		$("#staffEmail").select();
		break;
	}

}
$("#staffInfoForm").validate({
	rules : {
		staffTelephone : {
			required : true,
		},
		staffEmail : {
			required : true,
			email : true,
		},
	},
	messages : {
		staffTelephone : {
			required : '请输入电话号码',
		},
		staffEmail : {
			required : '请输入邮箱',
			email : '请输入正确格式的邮箱',
		},
	},
	errorElement : "em",
	sucess : function(em) {
		label.text(" ").addClass("success");
	}
});

/* 后台传输服务 修改职员信息 */
function updateStaffInfo() {
	if ($("#staffInfoForm").valid()) {
		$.post('updateStaffInfo', $('#staffInfoForm').serialize(), function(
				result) {
			if (result.resultCode == 1) {
				alert(result.message);
			} else {
				alert("系统繁忙，请稍后再试");
			}
		})
	} else {
		alert("请将信息按要求填写后再修改！");
	}

}

function resetStaffPassword(staff) {
	if (confirm("是否要重置该职员的密码,重置后默认密码是员工身份证后六位")) {
		$.post("resetStaffPassword", staff, function(result) {
			if (result.resultCode == 1) {
				alert(result.message);
			} else {
				alert("系统繁忙，请稍后再试");
			}
		})
	}
}

/* 表格加载 */
$('#staffInfoTable')
		.bootstrapTable(
				{
					method : "POST",
					contentType : "application/x-www-form-urlencoded",
					dataType : "json",
					url : "loadStaffInfo", // 执行加载表格的PostMapping
					pagination : true, // 分页
					striped : true, // 是否显示行间隔色
					search : false, // 显示搜索框
					sidePagination : "server", // 服务端处理分页
					showRefresh : true,
					pageNumber : 1, // 初始化加载第一页，默认第一页
					pageSize : 5, // 每页的记录行数（*）
					pageList : [ 5, 10, 15, 20 ],
					classes : "table table-bordered table-striped table-sm ", // 这里设置表格样式
					// toolbar : '#toolbar',
					// detailView: false, //扩展子表
					showToggle : true, // 是否显示详细视图和列表视图的切换按钮
					showColumns : true, // 是否显示所有的列
					cardView : false, // 是否显示详细视图
					queryParams : function queryParams(params) {
						params.search = this.search;
						params.pageNumber = this.pageNumber;
						return params;
					},
					sidePagination : "server",
					responseHandler : function(result) {
						// console.log(result);
						return {
							"total" : result.total,// 总页数
							"rows" : result.list
						// 数据
						}
					},
					columns : [
							{
								field : 'staffId',
								sortable : true,
								title : '员工编号'
							},
							{
								field : 'staffName',
								sortable : true,
								title : '员工姓名',
							},
							{
								field : 'staffSex',
								sortable : true,
								title : '性别',
								formatter : function formatStaffSex(value, row,
										index) {
									var str;
									switch (value) {
									case "0":
										str = "女";
										break;
									case "1":
										str = "男";
										break;
									}
									return str;
								}
							},
							{
								field : 'staffIdcard',
								sortable : true,
								title : '身份证号码',
							/*
							 * formatter:function formatDate(value,row,index){
							 * var d = new Date(value); var
							 * times=d.getFullYear() + '年' + (d.getMonth() + 1) +
							 * '月' + d.getDate() + '日 ' + d.getHours() + ':' +
							 * d.getMinutes() + ':' + d.getSeconds(); return
							 * times; }
							 */
							},
							{
								field : 'staffTelephone',
								title : '联系电话'
							},
							{
								field : 'staffEmail',
								sortable : true,
								title : '邮箱地址',
							/*
							 * formatter : function formatStatus( value, row,
							 * index) { var str; switch (value) { case "0": str =
							 * "已完结"; break; case "1": str = "未完结"; break; }
							 * return str; }
							 */
							},

							{
								field : 'staffAuthority',
								sortable : true,
								title : '职位',
								formatter : function formatAuthority(value,
										row, index) {
									var str;
									switch (value) {
									case "0":
										str = "超级管理员";
										break;
									case "1":
										str = "员工";
										break;
									case "2":
										str = "经理";
										break;
									}
									return str;
								}
							},
							{
								filed : 'staffId',
								title : '操作',
								formatter : function(value, row, index) {
									// 通过formatter可以自定义列显示的内容
									// value：当前field的值，即id
									// row：当前行的数据
									var staff = JSON.stringify(row);
									var result = "";
									if (row.staffId != '1') {
										result += "<a class='btn btn-xs blue'  title='修改' onclick='updateStaff("
												+ staff
												+ ")'><span class='glyphicon glyphicon-pencil'></span></a>"
												+ "<a class='btn btn-xs blue'  title='重置密码' onclick='resetStaffPassword("
												+ staff
												+ ")'><span class='	glyphicon glyphicon-repeat'></span></a>"
												+ "<a class='btn btn-xs red'  title='删除' onclick='checkAccountById("
												+ staff
												+ ")'><span class='	glyphicon glyphicon-remove'></span></a>";
									} else {
										result += "系统管理员账号，无权修改";
									}
									return result;
								}
							}, ],
				// 注册加载子表的事件。注意下这里的三个参数！
				// index：父表当前行的行索引。
				// row：父表当前行的Json数据对象。
				// $detail：当前行下面创建的新行里面的td对象。
				/*
				 * onExpandRow: function (index, row, $detail) {
				 * //console.log(row); if(row.consumptionType==1){
				 * InitSubTable(index, row, $detail); } }
				 */

				});